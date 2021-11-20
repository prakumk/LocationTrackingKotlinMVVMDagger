package com.softwares.wherearethey.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.softwares.wherearethey.R
import com.softwares.wherearethey.ui.viewmodels.MainViewModel

class RunFragment : Fragment(R.layout.fragment_run) {

    private val viewModel : MainViewModel by viewModels()
}