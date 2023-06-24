package com.vv.common.service;

import com.vv.common.pojo.CouponDTO;

import java.util.List;

/**
 * @author kw
 * @program Dubbo_ZookeeperProject
 * @description 优惠券业务调用接口
 * @create 2023 - 06 - 23 13:10
 **/
public interface CouponService {

    /***
     * @description 获取优惠券编号
     * @param []
     * @return java.util.List<java.lang.String>
     * @author
     * @date 2023/6/23
     **/

    List<String> getCouponId();

    /***
     * @description 根据券类型计算券
     * @param [couponDTO]
     * @return java.lang.String
     * @author
     * @date 2023/6/24
     **/

    String calculationCoupon(CouponDTO couponDTO);
}
