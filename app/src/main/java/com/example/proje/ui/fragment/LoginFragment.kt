package com.example.proje.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.proje.R
import com.example.proje.databinding.FragmentLoginBinding
import com.example.proje.ui.viewmodel.LoginFragmentViewModel
import com.google.android.material.snackbar.Snackbar


class LoginFragment : Fragment() {

    private lateinit var tasarim : FragmentLoginBinding
    private lateinit var viewModel : LoginFragmentViewModel
    var kulaniciAdi:String = "deneme"
    var kullaniciSifre:String = "1234"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)

        tasarim.loginFragment = this


        return tasarim.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : LoginFragmentViewModel by viewModels()
        viewModel = tempViewModel
    }



    fun buttonGecisYap(it:View, kAd:String, sifre:String){
        if ((kAd == kulaniciAdi) && (sifre == kullaniciSifre)){
            Navigation.findNavController(it).navigate(R.id.loginFragmentBottomNavigationGecis)
        }else{
            Snackbar.make(it,"Kullanıcı Adı: \"$kulaniciAdi\" \n Sifre: \"$kullaniciSifre\" olmalı",Snackbar.LENGTH_SHORT).show()
        }

    }
    fun buttonKaydol(it:View){
        Navigation.findNavController(it).navigate(R.id.action_loginFragment_to_signUpAdFragment)
    }
}



