package com.cagataysencan.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.cagataysencan.odev4.databinding.FragmentSayfaYBinding


class SayfaY : Fragment() {
    private lateinit var tasarim : FragmentSayfaYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaYBinding.inflate(inflater, container, false)


        tasarim.buttonGeri.setOnClickListener {
            val gecis = SayfaYDirections.sayfaYAnaSayfa()
            Navigation.findNavController(it).navigate(gecis)
        }




        return tasarim.root
    }


}