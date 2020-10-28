package com.nicej.hiltsample.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nicej.hiltsample.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
abstract class BaseActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}