package com.nicej.hiltsample.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.nicej.hiltsample.R
import com.nicej.hiltsample.api.*
import com.nicej.hiltsample.model.Post
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() ,RemoteErrorEmitter {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        supportFragmentManager.beginTransaction().replace(
            R.id.framLeayout, MainFragment()).commit()
    }

    override fun onError(msg: String) {
        TODO("Not yet implemented")
    }

    override fun onError(errorType: ErrorType) {
        TODO("Not yet implemented")
    }

}