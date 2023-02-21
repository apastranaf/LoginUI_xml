package com.arturodev.loginui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arturodev.loginui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Initialize the UI
        initUI()
    }

    private fun initUI() {

        binding.fbBack.setOnClickListener { }

        binding.btnSignin.setOnClickListener { }

        binding.tvSingup.setOnClickListener { }

        binding.tvForgotPassword.setOnClickListener { }
    }
}