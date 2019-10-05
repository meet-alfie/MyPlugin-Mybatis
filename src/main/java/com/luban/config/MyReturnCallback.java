//package com.luban.config;
//
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// * 需要咨询java高级VIP课程的同学可以加安其拉老师的QQ:3164703201
// * 需要视频资料的可以添加木兰老师的QQ：2746251334
// * author：鲁班学院-商鞅老师
// */
//@Component
//public class MyReturnCallback implements RabbitTemplate.ReturnCallback {
//
//
//    @Autowired
//    RabbitTemplate rabbitTemplate;
//
//
//
//    @Override
//    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
//        System.out.println(message);
//        System.out.println(replyCode);
//        System.out.println(replyText);
//        System.out.println(exchange);
//        System.out.println(routingKey);
//        rabbitTemplate.convertAndSend(null,"ttt","123");
//        System.out.println(1);
//    }
//}