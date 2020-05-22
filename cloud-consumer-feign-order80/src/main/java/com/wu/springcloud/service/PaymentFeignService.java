package com.wu.springcloud.service;

import com.wu.springcloud.entities.CommonResult;
import com.wu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lynn
 * @date 2020/5/21 - 19:45
 */
@Component
@FeignClient("cloud-payment-service")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")    //哪个地址
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("payment/feign/timeout")
    String feignTimeout();
}
