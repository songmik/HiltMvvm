package com.example.hiltmvvm.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.hiltmvvm.R
import com.example.hiltmvvm.base.BaseActivity
import com.example.hiltmvvm.databinding.ActivityMainBinding
import com.example.hiltmvvm.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun getViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun createViewModel(): MainViewModel {
        return ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}