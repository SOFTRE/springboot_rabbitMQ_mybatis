package com.xxm.rabbitmq.simple;

import com.rabbitmq.client.*;
import com.xxm.rabbitmq.util.ConnectionUtil;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Program: IntelliJ IDEA springboot_demo01
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-13 09:58:13 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
public class Consumer {
    /***
     * 消息消费者
     * @param args
     * @throws IOException
     * @throws TimeoutException
     */
    public static void main(String[] args) throws IOException, TimeoutException {
        /*//创建链接工厂对象
        ConnectionFactory connectionFactory = new ConnectionFactory();

        //设置RabbitMQ服务主机地址,默认localhost
        connectionFactory.setHost("localhost");

        //设置RabbitMQ服务端口,默认5672
        connectionFactory.setPort(5672);

        //设置虚拟主机名字，默认/
        connectionFactory.setVirtualHost("liu");

        //设置用户连接名，默认guest
        connectionFactory.setUsername("admin");

        //设置链接密码，默认guest
        connectionFactory.setPassword("admin");*/

        //创建链接
        Connection connection = ConnectionUtil.getConnection();

        //创建频道
        Channel channel = connection.createChannel();

        //创建队列
        channel.queueDeclare("simple_queue",true,false,false,null);

        //创建消费者，并设置消息处理
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel){
            /***
             * @param consumerTag   消息者标签，在channel.basicConsume时候可以指定
             * @param envelope      消息包的内容，可从中获取消息id，消息routingkey，交换机，消息和重传标志(收到消息失败后是否需要重新发送)
             * @param properties    属性信息
             * @param body           消息
             * @throws IOException
             */
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                //路由的key
                String routingKey = envelope.getRoutingKey();
                //获取交换机信息
                String exchange = envelope.getExchange();
                //获取消息ID
                long deliveryTag = envelope.getDeliveryTag();
                //获取消息信息
                String message = new String(body,"UTF-8");
                System.out.println("routingKey:"+routingKey+",exchange:"+exchange+",deliveryTag:"+deliveryTag+",message:"+message);
            }
        };

        /**
         * 消息监听
         * 参数1：队列名称
         * 参数2：是否自动确认，设置为true为表示消息接收到自动向mq回复接收到了，mq接收到回复会删除消息，设置为false则需要手动确认
         * 参数3：消息接收到后回调
         */
        channel.basicConsume("simple_queue",true,defaultConsumer);

        //关闭资源(不建议关闭，建议一直监听消息)
        //channel.close();
        //connection.close();
    }
}
