package com.nandaadisaputra.viewpagerandtablayout.activity

import android.content.Intent
import android.opengl.Visibility
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.nandaadisaputra.viewpagerandtablayout.databinding.ActivityMainBinding
import com.nandaadisaputra.viewpagerandtablayout.fragment.FragmentOne
import com.nandaadisaputra.viewpagerandtablayout.fragment.FragmentTwo
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        smartTabLayout()
    }

    private fun smartTabLayout() {

        val adapter = FragmentPagerItemAdapter(
            supportFragmentManager, FragmentPagerItems.with(this)
                .add("Fragment 1", FragmentOne::class.java)
                .add("Fragment 2", FragmentTwo::class.java)
                .create()
        )
        binding.viewPager.adapter = adapter
        binding.viewPager.offscreenPageLimit = 0
        binding.tabLayout.setViewPager(binding.viewPager)
    }
}