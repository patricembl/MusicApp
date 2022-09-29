package com.example.android.musicapplication.ui.pop

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PopViewModel : ViewModel () {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Pop Fragment"
    }
    val text: LiveData<String> = _text
}