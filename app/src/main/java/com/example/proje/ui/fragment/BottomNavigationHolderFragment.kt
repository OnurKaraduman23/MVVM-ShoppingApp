package com.example.proje.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.proje.R
import com.example.proje.databinding.FragmentBottomNavigationHolderBinding


class BottomNavigationHolderFragment : Fragment() {

    private lateinit var tasarim: FragmentBottomNavigationHolderBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_bottom_navigation_holder,container,false)

        val navHostFragment = childFragmentManager
            .findFragmentById(R.id.nav_host_fragment_bottom_nav) as NavHostFragment
        NavigationUI.setupWithNavController(tasarim.bottomNav, navHostFragment.navController)


        return tasarim.root
    }


}