package com.vv.service.strategy;

import com.vv.common.enums.CouponTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kw
 * @program Dubbo_ZookeeperProject
 * @description 优惠券策略模式
 * @create 2023 - 06 - 24 15:39
 **/
@Slf4j
@Component
public class CouponFactoryStrategy implements InitializingBean, ApplicationContextAware {
    // 初始化缓存，todo 还能通过其他方式
    private static final Map<CouponTypeEnum, CalculationCoupon> couponStrategies = new HashMap<>();


    private ApplicationContext applicationContext;

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, CalculationCoupon> beansOfType = applicationContext.getBeansOfType(CalculationCoupon.class);
        beansOfType.values().forEach(calculationCoupon -> couponStrategies.put(calculationCoupon.getCouponType(), calculationCoupon));
        log.info("策略模式::" + couponStrategies);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static CalculationCoupon getCalculationCoupon(CouponTypeEnum couponType) {
        if (couponType == null) {
            throw new IllegalArgumentException("coupon type is empty.");
        }
        if (!couponStrategies.containsKey(couponType)) {
            throw new IllegalArgumentException("coupon type not supported.");
        }
        return couponStrategies.get(couponType);
    }

}
