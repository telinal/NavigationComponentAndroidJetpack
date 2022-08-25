package com.example.navigationcomponent_androidjetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //use when we want to add bottom navigation menu, app drawer, toolbar, destination changes, etc in navigation component
        val navController = Navigation.findNavController(this,R.id.navHostFragment)
            navController.navigate(R.id.action_fragmentA_to_fragmentB)}

    }
