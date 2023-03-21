package com.maverick.materialdeisign_demo_sh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import com.google.android.material.snackbar.Snackbar
import com.maverick.materialdeisign_demo_sh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.title = "Toolbar Title"

        binding.collapsingToolbar.title = "Collapsing toolbar"


    }

}