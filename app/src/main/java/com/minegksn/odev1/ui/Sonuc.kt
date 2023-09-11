package com.minegksn.odev1.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.NavigationUI
import com.minegksn.odev1.R
import com.minegksn.odev1.common.viewBinding
import com.minegksn.odev1.databinding.FragmentSonucBinding


class Sonuc : Fragment(R.layout.fragment_sonuc) {
    private val binding by viewBinding(FragmentSonucBinding::bind)
    private val args by navArgs<SonucArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.getAdSoyad.text = args.isim.bilgiler.toString()

        binding.getEmail.text = args.bilgiler.email.toString()
        binding.getPhone.text = args.bilgiler.phone.toString()


        binding.getYuzme.text = args.yuzme.yuzme.toString()
        binding.getKitap.text = args.yuzme.kitap.toString()
        binding.getMuzik.text = args.yuzme.muzik.toString()

        binding.ivBack.setOnClickListener{
            NavHostFragment.findNavController(this).navigate(R.id.homeFragment)
        }
    }

}