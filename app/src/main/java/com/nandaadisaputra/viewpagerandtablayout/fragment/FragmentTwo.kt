package com.nandaadisaputra.viewpagerandtablayout.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.nandaadisaputra.viewpagerandtablayout.R
import com.nandaadisaputra.viewpagerandtablayout.databinding.FragmentTwoBinding


class FragmentTwo : Fragment() {
    lateinit var fragmentTwoBinding: FragmentTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentTwoBinding.bind(view)
        fragmentTwoBinding = binding
        binding.containerTwo.setOnClickListener {
            val ft: FragmentTransaction = requireFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, FragmentOne())
            ft.commit()
            Toast.makeText(activity, "Pindah ke Fragment 1", Toast.LENGTH_SHORT).show()
        }
    }
}