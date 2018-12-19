package com.baoutu.sharding.demo.bean;

import java.io.Serializable;

/**
 * @Project: sharding-ssm-demo
 * @Author: ChagnXing 邮箱:515688558@qq.com
 * @Date: 2018/12/19 16:28
 * @Description:
 */
public class Order implements Serializable{
    private static final long serialVersionUID = 8840562426259693726L;
    private Long orderId;

    private Integer userId;

    private String status;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", status='" + status + '\'' +
                '}';
    }
}
