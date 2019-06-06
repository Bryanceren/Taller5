package com.example.kriz.taller5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.kriz.taller5.databinding.FragmentFragment1Binding
import com.example.kriz.taller5.databinding.FragmentFragment3Binding


class Fragment3 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding:FragmentFragment3Binding=DataBindingUtil.inflate(inflater,R.layout.fragment_fragment3,container,false)
        binding.fragment3Button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragment3_to_fragment4))
        return binding.root
    }


}
