package com.smart.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.smart.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    lateinit var viewModelData : AndroidViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        viewModelData = ViewModelProvider(this).get(AndroidViewModel::class.java)


        binding.minus.setOnClickListener {
            viewModelData.countSubtract()

        }
        binding.plusImage.setOnClickListener {
            viewModelData.countPlus()
        }

        viewModelData.getCounter().observe(this, Observer {
            binding.counterText.text = it.toString()
        })

    }
}