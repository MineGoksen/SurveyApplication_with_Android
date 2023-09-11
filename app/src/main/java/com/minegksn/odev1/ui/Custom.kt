package com.minegksn.odev1.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.minegksn.odev1.R
import com.minegksn.odev1.common.viewBinding
import com.minegksn.odev1.data.Anket
import com.minegksn.odev1.data.Personal
import com.minegksn.odev1.data.User
import com.minegksn.odev1.databinding.FragmentCustomBinding

class Custom : Fragment(R.layout.fragment_custom) {

    private val binding by viewBinding(FragmentCustomBinding::bind)
    private val args by navArgs<CustomArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //ui ayağa kalktı. Bu scope içinde ui ile ilgili işlem gerçekleştirebilirim.
        super.onViewCreated(view, savedInstanceState)

        binding.sonuclarButon.setOnClickListener{
            val swim = binding.soru1.text.toString()
            val book = binding.soru2.text.toString()
            val music = binding.soru3.text.toString()
            val anket = Anket(swim,book,music)
            val action = CustomDirections.customToSonuc(
                anket,
                args.mailphone,
                args.info
            )

            //val act = CustomDirections.customToSonuc(action)
            findNavController().navigate(action)
        }

    }

}