package com.minegksn.odev1.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.minegksn.odev1.R
import com.minegksn.odev1.common.viewBinding
import com.minegksn.odev1.data.Personal
import com.minegksn.odev1.databinding.FragmentKisiselBilgilerBinding


class KisiselBilgiler : Fragment(R.layout.fragment_kisisel_bilgiler) {

    private val binding by viewBinding(FragmentKisiselBilgilerBinding::bind)
    private val args by navArgs<KisiselBilgilerArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textAd.text = args.adSoyad.bilgiler.toString()

        binding.customButon.setOnClickListener{
            val gmail = binding.editTextEmail.text.toString()
            val no = binding.editTextPhone.text.toString()
            val info = Personal(gmail,no)
            val action = KisiselBilgilerDirections.kisiselToCustom(
                args.adSoyad,
                info
            )
            findNavController().navigate(action)
        }
    }
}