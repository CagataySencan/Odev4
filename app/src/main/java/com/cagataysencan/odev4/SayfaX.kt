package com.cagataysencan.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.cagataysencan.odev4.databinding.FragmentSayfaXBinding


class SayfaX : Fragment() {
    private lateinit var tasarim : FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaXBinding.inflate(inflater, container, false)

        tasarim.buttonGecisXY.setOnClickListener {
            val gecis = SayfaXDirections.sayfaXSayfaY()
            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim.root
    }

}