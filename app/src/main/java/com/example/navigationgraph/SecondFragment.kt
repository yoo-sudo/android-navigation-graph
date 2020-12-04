package com.example.navigationgraph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_second, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            //to pass arguments from nav graph
            Toast.makeText(
                activity,
                "navigation argument" + SecondFragmentArgs.fromBundle(arguments!!).testBool,
                Toast.LENGTH_SHORT
            ).show()

//            tvText.text = arguments!!.getString("test")
        }

        tvBack.setOnClickListener {
            Navigation.findNavController(view).navigateUp()
        }


    }
}