package com.wu.springcloud.controller;

import com.wu.springcloud.entities.CommonResult;
import com.wu.springcloud.entities.Payment;
import com.wu.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lynn
 * @date 2020/5/21 - 19:47
 */
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
    @GetMapping("/consumer/payment/feign/timeout")
    public String feignTimeout(){
        //open-feign-ribbon 客户端一般默认等待1秒钟
        return paymentFeignService.feignTimeout();
    }
}
