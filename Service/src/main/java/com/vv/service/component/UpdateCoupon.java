package com.vv.service.component;

import com.vv.common.pojo.CouponDTO;
import com.vv.common.service.CouponOperation;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author kw
 * @program DubboAndZookeeper
 * @description 修改券
 * @create 2023 - 06 - 26 22:48
 **/
@Component
public class UpdateCoupon implements CouponOperation {
    @Override
    public String operation(CouponDTO couponDTO) {
        return "券修改成功";
    }
}
