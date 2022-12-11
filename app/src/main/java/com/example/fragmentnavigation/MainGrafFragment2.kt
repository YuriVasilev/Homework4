package com.example.fragmentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation


class MainGrafFragment2 : Fragment() {

    lateinit var button: TextView
    lateinit var button2: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_graf2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.textView2)
        button2 = view.findViewById(R.id.textViewToGraf2)

        button.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainGrafFragment2_to_first_graf)
        }

        button2.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_mainGrafFragment2_to_second_graf)

            }



    }
}