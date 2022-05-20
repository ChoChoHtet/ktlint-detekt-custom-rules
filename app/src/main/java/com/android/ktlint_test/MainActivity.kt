package com.android.ktlint_test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.ktlint_test.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.txt_testing

class MainActivity : AppCompatActivity() {
    private var count = 0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btRunTest.setOnClickListener {
            binding.txtOutput.text = increase().toString()
        }
        txt_testing.text  = "Hello"
    }
    private fun increase(): Int {
        return ++count
    }
}
