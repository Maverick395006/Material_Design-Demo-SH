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



        binding.toolbar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.simple_snackbar -> {
                    showSimpleSnackBar()
                }
                R.id.snackbar_action_callback -> {
                    showSnackBarWithActionCallBack()
                }
                R.id.custom_snackbar -> {
                    showCustomSnackBar()
                }
            }
            true
        }

        binding.fab.setOnClickListener {
            Snackbar.make(binding.root, "Floating Button in COL", Snackbar.LENGTH_LONG).show()
        }

    }

    private fun showSimpleSnackBar() {
        Snackbar.make(binding.root, "Simple Snack Bar", Snackbar.LENGTH_LONG).show()
    }

    private fun showSnackBarWithActionCallBack() {
        val snackbar =
            Snackbar.make(binding.root, "File Deleted Successfully", Snackbar.LENGTH_LONG)
        snackbar.setAction("UNDO") {
            Snackbar.make(binding.root, "File Recovered Successfully", Snackbar.LENGTH_LONG).show()
        }
        snackbar.show()
    }

    private fun showCustomSnackBar() {

    }
}