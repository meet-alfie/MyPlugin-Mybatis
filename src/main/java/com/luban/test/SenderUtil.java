package com.luban.test;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 需要咨询java高级VIP课程的同学可以加安其拉老师的QQ：3164703201
 * 需要往期视频的同学可以加木兰老师的QQ：2746251334
 * author：鲁班学院-商鞅老师
 */
@Component
public class SenderUtil {

    @Autowired
    AmqpTemplate amqpTemplate;

    public  void send(String message){
        amqpTemplate.convertAndSend("topic.message",message);
    }

    public  void send(String message,String roukey){
        amqpTemplate.convertAndSend(roukey,message);
    }
}
