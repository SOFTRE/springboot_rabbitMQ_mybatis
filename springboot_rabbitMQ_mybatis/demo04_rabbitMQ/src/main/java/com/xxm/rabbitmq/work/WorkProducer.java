package com.xxm.rabbitmq.work;

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
 * @CreateDate: 2019-11-13 10:12:25 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
public class WorkProducer {
    /***
     * 消息生产者
     * @param args
     * @throws IOException
     * @throws TimeoutException
     */
    public static void main(String[] args) throws IOException, TimeoutException {
        //创建链接
        Connection connection = ConnectionUtil.getConnection();

        //创建频道
        Channel channel = connection.createChannel();

        /**
         * 声明队列
         * 参数1：队列名称
         * 参数2：是否定义持久化队列
         * 参数3：是否独占本次连接
         * 参数4：是否在不使用的时候自动删除队列
         * 参数5：队列其它参数
         * **/
        channel.queueDeclare("work_queue",true,false,false,null);

        for (int i = 0; i < 10; i++) {
            String message = "hello!welcome to xxm!"+i;
            channel.basicPublish("","work_queue",null,message.getBytes());
        }

        //关闭资源
        channel.close();
        connection.close();
    }
}
