package com.nicej.hiltsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var blawBlaw: BlawBlaw
    @Inject
    lateinit var complexModel: ComplexModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    class BlawBlaw @Inject constructor() {
        @Inject
        lateinit var obj: SomeClass

        // Code
    }

    class SomeClass @Inject constructor(var someOtherClass: SomeOtherClass)

    class SomeOtherClass @Inject constructor()

    @Module
    @InstallIn(ActivityComponent::class)
    class ActivityModule {
        @ActivityScoped
        @Provides
        fun provideComplexModel(): ComplexModel {
            val complexModel = ComplexModel()
            return complexModel
        }
    }

    class ComplexModel {
        fun someText(): String = "Blaw blaw"
    }
}