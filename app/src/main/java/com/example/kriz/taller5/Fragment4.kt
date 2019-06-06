package com.example.kriz.taller5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.kriz.taller5.databinding.FragmentFragment1Binding
import com.example.kriz.taller5.databinding.FragmentFragment4Binding


class Fragment4 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding:FragmentFragment4Binding=DataBindingUtil.inflate(inflater,R.layout.fragment_fragment4,container,false)
        binding.fragment4Button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragment4_to_fragment5))
        binding.fragment4to1Button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragment4_to_fragment2))
        return binding.root
    }


}
