package com.example.drawer

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import androidx.fragment.app.FragmentManager


import com.example.drawer.databinding.FragmentSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialog


class SheetFragment : Fragment(R.layout.fragment_sheet) {
    private lateinit var binding : FragmentSheetBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentSheetBinding.inflate(inflater)
        val bottomsheetfragment = BottomSheet()
        binding.btnsheet.setOnClickListener {
            //val view : View =layoutInflater.inflate(R.layout.bottom_sheet,null)
           // val dialog = context?.let { it1 -> BottomSheetDialog(it1) }
          //  dialog?.setContentView(view)
          //  dialog?.show()


            bottomsheetfragment.show(parentFragmentManager,"this")

        }
        return binding.root
    }


}