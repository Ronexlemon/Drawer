package com.example.drawer

import android.os.Bundle
import android.system.Os.accept
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.drawer.databinding.FragmentBackDropBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class BackDropFragment : Fragment(R.layout.fragment_back_drop) {
    private lateinit var binding : FragmentBackDropBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBackDropBinding.inflate(inflater)
        binding.floatingbtn.setIconResource(R.drawable.ic_baseline_send_24)
        binding.floatingbtn.setOnClickListener{view:View ->
            activity?.let {
                MaterialAlertDialogBuilder(
                    it,
                    R.style.ThemeOverlay_MaterialComponents_MaterialAlertDialog)
                    .setMessage(resources.getString(R.string.message))
                    .setNegativeButton(resources.getString(R.string.decline)) { dialog, which ->
                        // Respond to negative button press
                        Toast.makeText(activity,"yes",Toast.LENGTH_LONG).show()
                    }
                    .setPositiveButton(resources.getString(R.string.accept)) { dialog, which ->
                        // Respond to positive button press
                        Toast.makeText(activity,"yes",Toast.LENGTH_LONG).show()
                    }
                    .show()

            }
        }
        return binding.root
    }

}