package com.plataformas.activityprincipal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView

private lateinit var bottomNav : BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.bottom_navigation)
        setListener()
        setFragment(HomeFragment.newInstance("Jose", "Santisteban"))
    }

    private fun setListener() {
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_home -> setFragment(HomeFragment.newInstance("Jose", "Santisteban"))
                R.id.action_search -> setFragment(SearchFragment())
                R.id.action_playlist -> setFragment(PlaylistFragment())
            }
            true
        }
    }

    private fun setFragment(fragment: Fragment){
        supportFragmentManager.commit{
            setReorderingAllowed(true)
            addToBackStack(null)
            replace(R.id.fragment_container,fragment)
        }
    }

}