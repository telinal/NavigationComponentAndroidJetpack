package com.example.navigationcomponent_androidjetpack.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponent_androidjetpack.R
import com.example.navigationcomponent_androidjetpack.databinding.FragmentDBinding

class FragmentD : Fragment() {

    private lateinit var bindingD: FragmentDBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingD = FragmentDBinding.inflate(inflater, container, false)
        return bindingD.root
    }

}