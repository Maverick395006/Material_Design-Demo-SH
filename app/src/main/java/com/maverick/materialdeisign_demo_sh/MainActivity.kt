package com.maverick.materialdeisign_demo_sh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maverick.materialdeisign_demo_sh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.standAloneToolbar.setOnClickListener {
            startActivity(Intent(this,StandAloneToolbarActivity::class.java))
        }

        binding.actionbarToolbar.setOnClickListener {
            startActivity(Intent(this,ActionBarToolbarActivity::class.java))
        }

        binding.contextualMenu.setOnClickListener {
            startActivity(Intent(this,ContextualMenuActivity::class.java))
        }

    }

}