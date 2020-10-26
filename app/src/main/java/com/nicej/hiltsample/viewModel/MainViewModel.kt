package com.nicej.hiltsample.viewModel

import androidx.lifecycle.ViewModel
import com.nicej.hiltsample.api.ApiRepo

import androidx.hilt.lifecycle.ViewModelInject
class MainViewModel @ViewModelInject constructor(var repository: ApiRepo) : ViewModel() {
    // TODO: Implement the ViewModel


        fun getPhoto(id : Int) = repository.getPhoto(id)


}