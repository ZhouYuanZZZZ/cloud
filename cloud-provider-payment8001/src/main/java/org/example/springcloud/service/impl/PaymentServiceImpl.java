package org.example.springcloud.service.impl;

import org.example.springcloud.entities.Payment;
import org.example.springcloud.mapper.PaymentMapper;
import org.example.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public long createPayment(Payment payment) {
        int rows = paymentMapper.insert(payment);
        return payment.getId();
    }

    @Override
    public Payment getPayment(long id) {
        Payment payment = paymentMapper.selectByPrimaryKey(id);
        return payment;
    }
}
