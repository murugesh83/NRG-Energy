package com.smart.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AndroidViewModel : ViewModel() {

     val counter  = MutableLiveData<Int>(0)


    fun getCounter()  : LiveData<Int>{
        return  counter
    }

     fun countPlus(){
        counter.value.let {
            counter.value = counter.value?.plus(1)
        }
     }

    fun countSubtract(){
        counter.value.let {
            counter.value = counter.value?.minus(1)
        }
    }
}