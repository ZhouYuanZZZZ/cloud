package org.example.springcloud.service;

import org.example.springcloud.entities.Payment;

public interface PaymentService {

    long createPayment(Payment payment);

    Payment getPayment(long id);
}
