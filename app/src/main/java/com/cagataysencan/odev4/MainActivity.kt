package com.cagataysencan.odev4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cagataysencan.odev4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)
    }
}