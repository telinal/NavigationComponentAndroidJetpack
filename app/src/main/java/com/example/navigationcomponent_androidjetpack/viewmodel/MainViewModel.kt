package com.example.navigationcomponent_androidjetpack.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val result = MutableLiveData<String>()
    val resultLive: LiveData<String>
        get() = result
}