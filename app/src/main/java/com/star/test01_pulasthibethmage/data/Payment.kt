package com.star.test01_pulasthibethmage.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="payment_table")
data class Payment(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val firstName:String,
    val lastName:String,
    val contactNumber:Int,
    val amountPaid:Float
)