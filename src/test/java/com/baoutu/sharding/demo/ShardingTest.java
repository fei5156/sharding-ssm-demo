package com.baoutu.sharding.demo;

import com.baoutu.sharding.demo.bean.Order;
import com.baoutu.sharding.demo.service.OrderService;
import io.shardingsphere.core.keygen.DefaultKeyGenerator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Project: sharding-ssm-demo
 * @Author: ChagnXing 邮箱:515688558@qq.com
 * @Date: 2018/12/19 16:40
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:application.xml"})
public class ShardingTest {
    private  Logger log = LogManager.getLogger();

    @Resource
    private OrderService orderService;
    @Test
    public void insertTest(){

        DefaultKeyGenerator key = new DefaultKeyGenerator();
        int userId = 45;
        Number orderIdKey = key.generateKey();
        long orderId = orderIdKey.longValue();
        log.info("分布式主键orderId:" + orderId);

        Order order = new Order();
        order.setUserId(userId);
        order.setStatus("1");
        order.setOrderId(orderId+1);

        Long returnOrderId = orderService.insert(order);
        log.info("插入成功后的returnOrderId:" + returnOrderId);
    }






}
