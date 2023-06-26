package com.vv.service.component;

import com.vv.common.pojo.CouponDTO;
import com.vv.common.service.CouponOperation;
import org.springframework.stereotype.Component;

/**
 * @author kw
 * @program DubboAndZookeeper
 * @description 创建券
 * @create 2023 - 06 - 26 22:48
 **/
@Component
public class AddCoupon implements CouponOperation {
    @Override
    public String operation(CouponDTO couponDTO) {
        return "券创建成功";
    }
}
