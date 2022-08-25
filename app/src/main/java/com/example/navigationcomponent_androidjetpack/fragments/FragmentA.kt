package com.example.navigationcomponent_androidjetpack.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent_androidjetpack.R
import com.example.navigationcomponent_androidjetpack.databinding.FragmentABinding


class FragmentA : Fragment() {

    private lateinit var bindingA: FragmentABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        bindingA = FragmentABinding.inflate(inflater, container, false)
        return bindingA.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindingA.btnGoToB.setOnClickListener {
            findNavController().navigate(FragmentADirections.actionFragmentAToFragmentB(key = ""))
        }

        bindingA.btnGoToC.setOnClickListener {
            findNavController().navigate(FragmentADirections.actionFragmentAToFragmentC())
        }
    }

}