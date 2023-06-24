package com.vv.web.controller;

import com.vv.common.pojo.CouponDTO;
import com.vv.common.service.CouponService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author kw
 * @program Dubbo_ZookeeperProject
 * @description 优惠券api
 * @create 2023 - 06 - 23 14:26
 **/

@RestController
@RequestMapping("coupon")
public class CouponController {

    @DubboReference
    private CouponService couponService;

    @GetMapping("getCouponId")
    public List<String> getCouponId() {
        return couponService.getCouponId();
    }

    @PostMapping("calculationCoupon")
    public String calculationCoupon(@RequestBody CouponDTO couponDTO) {
        return couponService.calculationCoupon(couponDTO);
    }
}
