package com.example.navigationgraph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_first, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nav = Navigation.findNavController(activity!!, R.id.nav_host_fragment);

        tvNext.setOnClickListener {
            Bundle().apply {
                putString("test", "helo")
                nav.navigate(R.id.action_firstFragment_to_secondFragment, this)
//                Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment, this)
            }
        }
    }

}