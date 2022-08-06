package com.star.test01_pulasthibethmage.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface PaymentDoa {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
     fun addPayment(payment: Payment)

}