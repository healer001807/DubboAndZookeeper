package com.vv.service.strategy;

import com.vv.common.enums.CouponTypeEnum;
import com.vv.common.pojo.CouponDTO;
import org.springframework.stereotype.Component;

/**
 * @author kw
 * @program Dubbo_ZookeeperProject
 * @description 抵扣券
 * @create 2023 - 06 - 24 16:03
 **/
@Component
public class DeductionsCoupon implements CalculationCoupon {
    @Override
    public CouponTypeEnum getCouponType() {
        return CouponTypeEnum.DEDUCTIONS_COUPON;
    }

    @Override
    public String calculation(CouponDTO couponDTO) {
        return "抵扣券";
    }
}
