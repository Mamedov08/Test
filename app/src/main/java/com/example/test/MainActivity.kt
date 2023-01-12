package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.Math
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding){
           val first = firstEd.text.toString()
           val second = firstEd.text.toString()
            val math = Math()
            calculatePlus.setOnClickListener {
                resultEd.text = math.add(first, second)
            }
            calculateDivide.setOnClickListener {
                resultEd.text = math.divide(first, second)
            }
        }
    }
}