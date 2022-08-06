package com.star.test01_pulasthibethmage.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PaymentViewModel(application: Application):AndroidViewModel(application) {


    private val repository: PaymentRepo

    init {
        val paymentDoa = PaymentDatabase.getDatabase(application).paymentDao()
        repository = PaymentRepo(paymentDoa)

    }

    fun addPayment(payment: Payment)
    {
        viewModelScope.launch(Dispatchers.IO){
            repository.addPayment(payment)
        }
    }
}