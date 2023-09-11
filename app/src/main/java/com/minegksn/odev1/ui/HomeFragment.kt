package com.minegksn.odev1.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.minegksn.odev1.R
import com.minegksn.odev1.common.viewBinding
import com.minegksn.odev1.data.User
import com.minegksn.odev1.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //ui ayağa kalktı. Bu scope içinde ui ile ilgili işlem gerçekleştirebilirim.
        super.onViewCreated(view, savedInstanceState)

        binding.anketButon.setOnClickListener{
            val enteredValue = binding.editTextAdSoyad.text.toString()
            val info = User(enteredValue)
            val action = HomeFragmentDirections.homeTokisisel(info)
            findNavController().navigate(action)
        }

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                activity?.finish()
            }
        }
    }

}