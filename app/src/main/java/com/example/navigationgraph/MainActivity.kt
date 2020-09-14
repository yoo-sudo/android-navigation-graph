package com.example.navigationgraph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * nav graph programatical example for start destination implemention
         * this will be usefull when desclaring start destination dynamically
         */
        /* val navHostFragment = nav_host_fragment as NavHostFragment
         val inflater = navHostFragment.navController.navInflater
         val graph = inflater.inflate(R.navigation.nav_graph)
         graph.startDestination = R.id.navFirstFragment //your start fragment id from nav_graph.xml
         navHostFragment.navController.graph = graph*/
    }
}
