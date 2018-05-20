package com.example.lubuntupc.viewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.lubuntupc.viewpager.fragments.GameFragment
import com.example.lubuntupc.viewpager.fragments.MovieFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.appbar_main.*


class MainActivity : AppCompatActivity() {

    var pageAdapter: CustomPageradapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar_main)
        pageAdapter = CustomPageradapter(supportFragmentManager)
        pageAdapter!!.addFragments(GameFragment(), "Games")
        pageAdapter!!.addFragments(MovieFragment(), "Movies")

        //adding pageradaoer to viewpager
        customViewPager.adapter = pageAdapter
        //setting up view pager with tablayout
        customTabLayout.setupWithViewPager(customViewPager)
    }

}
