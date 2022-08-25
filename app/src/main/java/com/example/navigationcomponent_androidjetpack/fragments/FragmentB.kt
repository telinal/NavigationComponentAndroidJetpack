package com.example.navigationcomponent_androidjetpack.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent_androidjetpack.R
import com.example.navigationcomponent_androidjetpack.databinding.FragmentBBinding
import com.example.navigationcomponent_androidjetpack.viewmodel.MainViewModel

class FragmentB : Fragment() {

    private lateinit var bindingB: FragmentBBinding
    private val mainviewmodel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        bindingB = FragmentBBinding.inflate(inflater, container, false)
        bindingB.lifecycleOwner = this
        bindingB.viewmodel = mainviewmodel
        return bindingB.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindingB.btnGoToD.setOnClickListener {
            findNavController().navigate(FragmentBDirections.actionFragmentBToFragmentD())
        }


        mainviewmodel.resultLive.observe(viewLifecycleOwner, Observer {

        })

        bindingB.senBtn.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("key", mainviewmodel.resultLive.value)
            findNavController().navigate(R.id.fragmentC, bundle)
        }
    }


}