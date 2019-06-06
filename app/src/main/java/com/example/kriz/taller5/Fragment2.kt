package com.example.kriz.taller5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.kriz.taller5.databinding.FragmentFragment1Binding
import com.example.kriz.taller5.databinding.FragmentFragment2Binding


class Fragment2 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding:FragmentFragment2Binding=DataBindingUtil.inflate(inflater,R.layout.fragment_fragment2,container,false)
        binding.fragment2Button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragment2_to_fragment3))
        return binding.root
    }


}
