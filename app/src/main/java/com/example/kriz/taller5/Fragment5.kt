package com.example.kriz.taller5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.kriz.taller5.databinding.FragmentFragment1Binding
import com.example.kriz.taller5.databinding.FragmentFragment5Binding


class Fragment5 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding:FragmentFragment5Binding=DataBindingUtil.inflate(inflater,R.layout.fragment_fragment5,container,false)
        return binding.root
    }


}
