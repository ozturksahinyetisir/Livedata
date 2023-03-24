package com.ozturksahinyetisir.livedatat1.presentation.views.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ozturksahinyetisir.livedatat1.R
import com.ozturksahinyetisir.livedatat1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.livedataButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_livedataFragment)
        }
        binding.normalButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_normalFragment)
        }

        return binding.root
    }}