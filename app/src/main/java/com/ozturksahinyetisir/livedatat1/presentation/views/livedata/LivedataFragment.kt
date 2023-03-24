package com.ozturksahinyetisir.livedatat1.presentation.views.livedata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.ozturksahinyetisir.livedatat1.databinding.FragmentLivedataBinding
import com.ozturksahinyetisir.livedatat1.presentation.viewmodels.ExperienceViewModel

class LivedataFragment : Fragment() {
    private lateinit var binding: FragmentLivedataBinding
    lateinit var expViewModel: ExperienceViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentLivedataBinding.inflate(layoutInflater)

        expViewModel = ViewModelProvider(this).get(ExperienceViewModel::class.java)
        activity?.let {
            expViewModel.currentExperience.observe(it, Observer {
                binding.scoreTv.text= it.toString()
            })
        }
        incrementExp()
        return binding.root
    }

private fun incrementExp(){
    binding.plusButton.setOnClickListener{
        expViewModel.currentExperience.value = ++expViewModel.experience
    }

}
}