package com.maverick.materialdeisign_demo_sh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maverick.materialdeisign_demo_sh.databinding.ActivityContextualMenuBinding

class ContextualMenuActivity : AppCompatActivity() {

    private lateinit var binding:ActivityContextualMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContextualMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

}