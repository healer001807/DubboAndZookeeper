package com.vv.common.service;

import com.vv.common.pojo.CouponDTO;

/**
 * @author kw
 * @program DubboAndZookeeper
 * @description 开闭原则，实现优惠券增加/修改
 * @create 2023 - 06 - 26 22:45
 **/
public interface CouponOperation {

    /***
     * @description 优惠券操作接口
     * @param [couponDTO]
     * @return java.lang.String
     * @author
     * @date 2023/6/26
     **/

    String operation(CouponDTO couponDTO);
}