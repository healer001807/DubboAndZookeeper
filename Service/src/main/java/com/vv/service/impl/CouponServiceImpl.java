package com.vv.service.impl;

import com.vv.common.enums.CouponTypeEnum;
import com.vv.common.pojo.CouponDTO;
import com.vv.common.service.CouponService;
import com.vv.service.strategy.CouponFactoryStrategy;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Arrays;
import java.util.List;

/**
 * @author kw
 * @program Dubbo_ZookeeperProject
 * @description 优惠券业务实现
 * @create 2023 - 06 - 23 13:12
 **/
@DubboService
public class CouponServiceImpl implements CouponService {
    @Override
    public List<String> getCouponId() {
        return Arrays.asList("LK0001", "LK0002", "LK0003");
    }

    @Override
    public String calculationCoupon(CouponDTO couponDTO) {
        //
        return CouponFactoryStrategy.getCalculationCoupon(CouponTypeEnum.valueOf(couponDTO.getCouponType())).calculation(couponDTO);
    }
}
