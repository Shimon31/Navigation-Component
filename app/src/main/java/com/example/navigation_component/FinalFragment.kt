package com.example.navigation_component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_component.databinding.FragmentFinalBinding
import com.example.navigation_component.databinding.FragmentProfileBinding

class FinalFragment : Fragment() {

        lateinit var binding: FragmentFinalBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFinalBinding.inflate(inflater,container,false)

        binding.homeBTN.setOnClickListener(){
            findNavController().navigate(R.id.action_finalFragment_to_homeFragment)
        }


        return binding.root
    }


}