package com.maverick.materialdeisign_demo_sh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.maverick.materialdeisign_demo_sh.databinding.ActivityStandAloneToolbarBinding

class StandAloneToolbarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStandAloneToolbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStandAloneToolbarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.root.apply {
            title = "Standalone Toolbar"
            subtitle = "by Maverick"
            titleColor = R.color.white
            inflateMenu(R.menu.action_menu)
            setOnMenuItemClickListener { item: MenuItem? ->

                Toast.makeText(
                    this@StandAloneToolbarActivity,
                    item?.itemId.toString(),
                    Toast.LENGTH_SHORT
                ).show()

                when (item?.itemId) {
                    R.id.save -> {

                    }
                    R.id.settings -> {

                    }
                    R.id.mail -> {

                    }
                    R.id.camera -> {

                    }
                    R.id.help -> {

                    }
                }
                true
            }
        }

    }

}