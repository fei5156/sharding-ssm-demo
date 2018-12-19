package com.baoutu.sharding.demo.service.impl;

import com.baoutu.sharding.demo.bean.Order;
import com.baoutu.sharding.demo.mapper.OrderMapper;
import com.baoutu.sharding.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Project: sharding-ssm-demo
 * @Author: ChagnXing 邮箱:515688558@qq.com
 * @Date: 2018/12/19 16:35
 * @Description:
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService{

    @Resource
    private OrderMapper orderMapper;
    @Override
    public long insert(Order order) {
        return orderMapper.insert(order);
    }
}
