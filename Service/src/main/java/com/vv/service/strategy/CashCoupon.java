package com.vv.service.strategy;

import com.vv.common.enums.CouponTypeEnum;
import com.vv.common.pojo.CouponDTO;
import org.springframework.stereotype.Component;

/**
 * @author kw
 * @program Dubbo_ZookeeperProject
 * @description 现金券
 * @create 2023 - 06 - 24 16:00
 **/
@Component
public class CashCoupon implements CalculationCoupon {
    @Override
    public CouponTypeEnum getCouponType() {
        return CouponTypeEnum.CASH_COUPON;
    }

    @Override
    public String calculation(CouponDTO couponDTO) {
        return "现金券优惠";
    }
}
