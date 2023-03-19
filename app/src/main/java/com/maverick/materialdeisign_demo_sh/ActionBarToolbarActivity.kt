package com.maverick.materialdeisign_demo_sh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maverick.materialdeisign_demo_sh.databinding.ActivityActionBarToolbarBinding

class ActionBarToolbarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityActionBarToolbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActionBarToolbarBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

}