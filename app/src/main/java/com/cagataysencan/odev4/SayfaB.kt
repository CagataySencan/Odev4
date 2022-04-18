package com.cagataysencan.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.cagataysencan.odev4.databinding.FragmentSayfaBBinding


class SayfaB : Fragment() {
    private lateinit var tasarim : FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaBBinding.inflate(inflater, container, false)

        tasarim.buttonGecisY.setOnClickListener {
            val gecis = SayfaBDirections.sayfaBSayfaY()
            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim.root
    }


}