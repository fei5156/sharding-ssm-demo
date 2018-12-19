package com.baoutu.sharding.demo.algorithm;

import io.shardingsphere.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * @Project: sharding-ssm-demo
 * @Author: ChagnXing 邮箱:515688558@qq.com
 * @Date: 2018/12/19 16:09
 * @Description:
 */
public class DataBaseShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {
    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Integer> shardingValue) {
        for (String each : availableTargetNames) {
            if (each.endsWith("_"+shardingValue.getValue() % 2)) {
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }
}
