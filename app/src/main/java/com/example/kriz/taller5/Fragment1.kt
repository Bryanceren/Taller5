package com.example.kriz.taller5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.kriz.taller5.databinding.FragmentFragment1Binding


class Fragment1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding:FragmentFragment1Binding=DataBindingUtil.inflate(inflater,R.layout.fragment_fragment1,container,false)
        binding.fragment1Button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragment1_to_fragment2))
        return binding.root
    }


}
