package com.star.test01_pulasthibethmage.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext

@Database(entities = [Payment::class], version = 1, exportSchema = false)
abstract class PaymentDatabase:RoomDatabase(){

    abstract fun paymentDao():PaymentDoa

    companion object{
        @Volatile
        private var INSTANCE: PaymentDatabase?= null

        fun getDatabase(context: Context):PaymentDatabase{

            val tempInstance = INSTANCE
            if(tempInstance != null)
            {
                return tempInstance
            }
            synchronized(this)
            {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PaymentDatabase::class.java,
                    "payment_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}