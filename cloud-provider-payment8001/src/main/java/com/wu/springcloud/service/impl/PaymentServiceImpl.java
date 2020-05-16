package com.wu.springcloud.service.impl;

import com.wu.springcloud.dao.PaymentDao;
import com.wu.springcloud.entities.Payment;
import com.wu.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author lynn
 * @date 2020/5/15 - 21:19
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    @Transactional
    public Payment getElementById(@Param("id") Long id){
        return paymentDao.getElementById(id);
    }
}
