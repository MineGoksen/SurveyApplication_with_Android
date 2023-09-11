package com.minegksn.odev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.minegksn.odev1.common.viewBinding
import com.minegksn.odev1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //her fragemnti yönetecğim yer burası olacak

    private val binding by viewBinding(ActivityMainBinding::inflate)
    //boşuna o kadar satır yazmadan ViewBindingTemplate erişerek binding kullanır.

    //private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

    }
}