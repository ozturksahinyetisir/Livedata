package com.ozturksahinyetisir.livedatat1.presentation.views.normal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozturksahinyetisir.livedatat1.databinding.FragmentNormalBinding


class NormalFragment : Fragment() {
    private lateinit var binding: FragmentNormalBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentNormalBinding.inflate(layoutInflater)

        var number = 0

        binding.plusButton.setOnClickListener {
            number++
            binding.scoreTv.text = number.toString()
        }
        return binding.root
    }
}