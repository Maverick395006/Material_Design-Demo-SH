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

        binding.btnSubmit.setOnClickListener {
            signUp()
        }

    }

    fun signUp() {
        var isValid = true
        if (binding.etFullName.text.toString().isEmpty()) {
            binding.inputLayoutFullName.error = "Full Name is Mandatory"
            isValid = false
        } else {
            binding.inputLayoutFullName.isErrorEnabled = false
        }
    }

}