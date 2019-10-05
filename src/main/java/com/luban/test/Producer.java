package com.luban.test;

import com.luban.product.mapper.ProductMapper;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/**
 * 需要咨询java高级VIP课程的同学可以加鲁班学院-白浅的QQ：2207192173
 * 需要视频资料的可以添加安其拉老师的QQ：3164703201
 * author：鲁班学院-商鞅老师
 */
@Component
public class Producer {


    @Autowired
    SenderUtil senderUtil;

    @Autowired
    ProductMapper mapper;


}
