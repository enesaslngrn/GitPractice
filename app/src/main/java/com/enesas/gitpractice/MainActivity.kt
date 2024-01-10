package com.enesas.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enesas.gitpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        println("2. comment için yazdığım satır")
        println("3. commit için yazdığım satır")
    }
}