package com.nicej.hiltsample.base

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.nicej.hiltsample.R
import com.nicej.hiltsample.api.*
import com.nicej.hiltsample.model.Post
import com.nicej.hiltsample.view.MainFragment
import dagger.hilt.android.AndroidEntryPoint
@AndroidEntryPoint
abstract class BaseActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}