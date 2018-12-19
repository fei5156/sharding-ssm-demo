package com.baoutu.sharding.demo.mapper;

import com.baoutu.sharding.demo.bean.Order;

/**
 * @Project: sharding-ssm-demo
 * @Author: ChagnXing 邮箱:515688558@qq.com
 * @Date: 2018/12/19 16:29
 * @Description:
 */
public interface OrderMapper {


    Long insert(Order model);

    void delete(Long orderId);


}
