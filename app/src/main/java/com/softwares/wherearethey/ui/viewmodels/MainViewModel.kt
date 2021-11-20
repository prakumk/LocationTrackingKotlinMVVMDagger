package com.softwares.wherearethey.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.softwares.wherearethey.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
) :ViewModel(){
}