package com.ozturksahinyetisir.livedatat1.presentation.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExperienceViewModel:ViewModel() {
    var experience = 0

    val currentExperience: MutableLiveData<Int> by lazy{
        MutableLiveData<Int>()
    }

}