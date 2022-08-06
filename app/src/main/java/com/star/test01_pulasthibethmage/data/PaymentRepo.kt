package com.star.test01_pulasthibethmage.data

class PaymentRepo(private val paymentDoa: PaymentDoa) {
    suspend fun addPayment(payment: Payment)
    {
        paymentDoa.addPayment(payment)
    }
}