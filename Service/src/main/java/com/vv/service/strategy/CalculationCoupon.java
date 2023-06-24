package com.vv.service.strategy;

import com.vv.common.enums.CouponTypeEnum;
import com.vv.common.pojo.CouponDTO;

/**
 * @author kw
 * @program Dubbo_ZookeeperProject
 * @description 不同类型券，计算
 * @create 2023 - 06 - 24 15:47
 **/
public interface CalculationCoupon {

    /***
     * @description 获取券类型
     * @param []
     * @return com.vv.common.enums.CouponTypeEnum
     * @author
     * @date 2023/6/24
     **/

    CouponTypeEnum getCouponType();

    /***
     * @description 根据不同券计算优惠金额
     * @param []
     * @return java.lang.String
     * @author
     * @date 2023/6/24
     **/

    String calculation(CouponDTO couponDTO);
}
