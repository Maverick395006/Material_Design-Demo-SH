package com.maverick.materialdeisign_demo_sh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.maverick.materialdeisign_demo_sh.databinding.ActivityStandAloneToolbarBinding

class ActionBarToolbarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStandAloneToolbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStandAloneToolbarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar.root)
        supportActionBar?.apply {
            title = "Action Bar Toolbar1"
            subtitle = "by Maverick"
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        Toast.makeText(
            this@ActionBarToolbarActivity,
            item.itemId.toString(),
            Toast.LENGTH_SHORT
        ).show()

        when (item.itemId) {
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
        return super.onOptionsItemSelected(item)
    }
}