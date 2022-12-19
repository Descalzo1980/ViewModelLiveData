package ru.stas.viewmodellivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
    var number = 0

    val currentNumber: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    val currentBoolean: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }

}