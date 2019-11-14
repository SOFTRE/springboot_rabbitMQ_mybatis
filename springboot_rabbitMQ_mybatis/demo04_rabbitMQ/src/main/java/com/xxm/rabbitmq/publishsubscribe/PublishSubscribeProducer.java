package com.xxm.rabbitmq.publishsubscribe;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.xxm.rabbitmq.util.ConnectionUtil;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Program: IntelliJ IDEA springboot_demo01
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-13 10:32:50 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
public class PublishSubscribeProducer {
    /***
     * 订阅模式
     * @param args
     */
    public static void main(String[] args) throws IOException, TimeoutException {
        //创建链接对象
        Connection connection = ConnectionUtil.getConnection();

        //创建频道
        Channel channel = connection.createChannel();

        /**
         * 声明交换机
         * 参数1：交换机名称
         * 参数2：交换机类型，fanout、topic、direct、headers
         */
        channel.exchangeDeclare("fanout_exchange", BuiltinExchangeType.FANOUT);

        /**
         * 声明队列
         * 参数1：队列名称
         * 参数2：是否定义持久化队列
         * 参数3：是否独占本次连接
         * 参数4：是否在不使用的时候自动删除队列
         * 参数5：队列其它参数
         */
        channel.queueDeclare("fanout_queue_1",true,false,false,null);
        channel.queueDeclare("fanout_queue_2",true,false,false,null);

        //队列绑定交换机
        channel.queueBind("fanout_queue_1","fanout_exchange","");
        channel.queueBind("fanout_queue_2","fanout_exchange","");

        //消息
        String message = "发布订阅模式:欢迎来到xxm！";
        /**
         * 参数1：交换机名称，如果没有指定则使用默认Default Exchage
         * 参数2：路由key,简单模式可以传递队列名称
         * 参数3：消息其它属性
         * 参数4：消息内容
         */
        channel.basicPublish("fanout_exchange","",null,message.getBytes());

        //关闭资源
        channel.close();
        connection.close();
    }
}
