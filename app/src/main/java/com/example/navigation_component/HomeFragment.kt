package com.example.navigation_component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_component.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)

       binding.goToProfile.setOnClickListener(){
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)

       }

        binding.goToUser.setOnClickListener(){
           findNavController().navigate(R.id.action_homeFragment_to_userFragment)
        }


        return binding.root

    }


}