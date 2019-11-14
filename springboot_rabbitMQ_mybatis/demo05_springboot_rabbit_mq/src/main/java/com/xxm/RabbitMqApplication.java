package com.xxm;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqApplication.class, args);
    }
    /*    //创建交换机
        @Bean
        public TopicExchange createTopic(){
            return new TopicExchange("topic_exchange_springboot");
        }
        //创建队列
        @Bean
        public Queue createQueue(){
            return new Queue("topic_item_queue_springboot");
        }
        //绑定队列
        @Bean
        public Binding binding(){
            return BindingBuilder.bind(createQueue()).to(createTopic()).with("item.#");
        }*/
}
