package com.star.test01_pulasthibethmage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.star.test01_pulasthibethmage.data.Payment
import com.star.test01_pulasthibethmage.data.PaymentViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mPaymentViewModel: PaymentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPaymentViewModel = ViewModelProvider(this).get(PaymentViewModel::class.java)

        btnSubmit.setOnClickListener {

            addpaymentdata();

        }

    }

    private fun addpaymentdata()
    {
        val firstName_  = tvFirstName.text.toString()
        val lastName_  = tvLastName.text.toString()
        val contactNumber_  = tvContactNumber.text.toString()
        val amountPaid_  = tvAmountPaid.text.toString()

        val paymentdetails = Payment(0,firstName_,lastName_,Integer.parseInt(contactNumber_),amountPaid_.toFloat())
        //Add Payments to Database
        mPaymentViewModel.addPayment(paymentdetails)
        Toast.makeText(this," Successfully added..",Toast.LENGTH_LONG).show()

        //Toast.makeText(this, "Str"+firstName_+"-"+lastName_+"_"+contactNumber_+"__"+amountPaid_, Toast.LENGTH_SHORT).show()
    }
}