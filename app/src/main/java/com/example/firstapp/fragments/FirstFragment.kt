package com.example.firstapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.firstapp.R



class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_first, container, false)

        val button = view.findViewById<Button>(R.id.firstFragmentToSecondFragment)

        button.setOnClickListener(){
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.con, SecondFragment())
                    ?.addToBackStack("Second")
                ?.commit()
        }

        return view;
    }


}