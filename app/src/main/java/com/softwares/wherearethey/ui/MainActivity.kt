package com.softwares.wherearethey.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.softwares.wherearethey.R
import com.softwares.wherearethey.db.RunDao
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDao: RunDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Log.d("runDao","RUNDAO: ${runDao.hashCode()}")

    }
}