package com.wu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author lynn
 * @date 2020/5/22 - 22:07
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_Timeout ,o(╥﹏╥)o";
    }
}
