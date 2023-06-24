package com.vv.common.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author kw
 * @program Dubbo_ZookeeperProject
 * @description 优惠券
 * @create 2023 - 06 - 24 16:01
 **/
@Data
public class CouponDTO implements Serializable {

    private String couponId;
    private String couponType;
}
