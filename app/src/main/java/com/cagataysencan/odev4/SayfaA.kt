package com.cagataysencan.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.cagataysencan.odev4.databinding.FragmentSayfaABinding


class SayfaA : Fragment() {
    private lateinit var tasarim : FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaABinding.inflate(inflater, container, false)

        tasarim.buttonGecisB.setOnClickListener {
            val gecis = SayfaADirections.sayfaASayfaB()
            Navigation.findNavController(it).navigate(gecis)
        }




        return tasarim.root
    }

}