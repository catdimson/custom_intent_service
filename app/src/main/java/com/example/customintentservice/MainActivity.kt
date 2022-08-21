package com.example.customintentservice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.customintentservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowToast.setOnClickListener {
            Toast.makeText(this, "Тостик, запущенный из Активити", Toast.LENGTH_LONG).show()
        }

        binding.btnShowSystemService.setOnClickListener {

        }

        binding.btnShowCustomService.setOnClickListener {

        }
    }
}