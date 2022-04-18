package com.cagataysencan.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.cagataysencan.odev4.databinding.FragmentAnaSayfaBinding


class AnaSayfa : Fragment() {
    private lateinit var tasarim : FragmentAnaSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)


        tasarim.buttonGecisA.setOnClickListener {
            val gecis = AnaSayfaDirections.anaSayfaSayfaA()
            Navigation.findNavController(it).navigate(gecis)
        }

        tasarim.buttonGecisX.setOnClickListener {
            val gecis = AnaSayfaDirections.anaSayfaSayfaX()
            Navigation.findNavController(it).navigate(gecis)
        }
        return tasarim.root

    }



}