package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.homework2.ViewPagerAdapter
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator


class MainActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        initViewPager()
    }

    private fun initViewPager() {
        val adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter
        val wormDotsIndicator = findViewById<WormDotsIndicator>(R.id.worm_dots_indicator)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        wormDotsIndicator.setViewPager2(viewPager)
    }

    private fun initViews(){
        viewPager = findViewById(R.id.viewPager)
    }
}