package com.nandaadisaputra.viewpagerandtablayout.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.nandaadisaputra.viewpagerandtablayout.R
import com.nandaadisaputra.viewpagerandtablayout.databinding.FragmentOneBinding

class FragmentOne : Fragment() {
    lateinit var fragmentOneBinding: FragmentOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentOneBinding.bind(view)
        fragmentOneBinding = binding
        binding.containerOne.setOnClickListener {
            val ft: FragmentTransaction = requireFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, FragmentTwo())
            ft.commit()
            Toast.makeText(activity, "Pindah ke Fragment 2", Toast.LENGTH_SHORT).show()
        }
    }
}
