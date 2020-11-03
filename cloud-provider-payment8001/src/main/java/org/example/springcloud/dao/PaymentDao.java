package org.example.springcloud.dao;

import org.apache.ibatis.annotations.Param;
import org.example.springcloud.entities.Payment;

public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
