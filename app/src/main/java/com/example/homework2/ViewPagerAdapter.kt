package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

private const val FRAGMENT_COUNT = 3

class ViewPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = FRAGMENT_COUNT

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> OnboardingFirst()
            1 -> OnboardingSecond()
            2 -> OnboardingThird()
            else -> OnboardingFirst()
        }
    }
}