package com.example.proje.data.util

import android.view.View
import androidx.navigation.Navigation

fun Navigation.gecisYap(it: View, id:Int){
    findNavController(it).navigate(id)
}