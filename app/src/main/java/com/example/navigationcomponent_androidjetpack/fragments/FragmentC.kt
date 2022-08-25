package com.example.navigationcomponent_androidjetpack.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponent_androidjetpack.databinding.FragmentCBinding


class FragmentC : Fragment() {

    private lateinit var bindingC: FragmentCBinding

    private val args by navArgs<FragmentCArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingC = FragmentCBinding.inflate(inflater, container, false)
        return bindingC.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindingC.tvGetData.text = args.myArgs
    }


}