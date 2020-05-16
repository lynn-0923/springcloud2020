package com.wu.springcloud.service;

import com.wu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author lynn
 * @date 2020/5/15 - 21:18
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getElementById(@Param("id") Long id);
}
