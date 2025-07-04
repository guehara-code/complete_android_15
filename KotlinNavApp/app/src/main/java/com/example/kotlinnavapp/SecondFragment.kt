package com.example.kotlinnavapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.kotlinnavapp.databinding.FragmentHomeBinding
import com.example.kotlinnavapp.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)

        var input = arguments!!.getString("name")
        binding.textViewSecondFrag.text = input.toString()

        return binding.root


    }


}