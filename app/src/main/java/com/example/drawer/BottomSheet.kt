package com.example.drawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.drawer.databinding.FragmentSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_sheet.*

class BottomSheet : BottomSheetDialogFragment(){
   // private lateinit var binding : FragmentSheetBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       // binding =DataBindingUtil.inflate(inflater,R.layout.bottom_sheet,container,false)

        return inflater.inflate(R.layout.bottom_sheet,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnsheet.setOnClickListener { view :View ->
            Toast.makeText(context,"bottomsheet",Toast.LENGTH_LONG).show()
        }
    }
}