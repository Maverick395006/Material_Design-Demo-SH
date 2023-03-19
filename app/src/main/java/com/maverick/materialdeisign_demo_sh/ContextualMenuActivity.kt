package com.maverick.materialdeisign_demo_sh

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.AdapterView
import android.widget.Toast
import com.maverick.materialdeisign_demo_sh.databinding.ActivityContextualMenuBinding

class ContextualMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContextualMenuBinding
    private var actionMode: ActionMode? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContextualMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.toolbar.root.apply {
            title = "Standalone Toolbar"
            subtitle = "by Maverick"
            titleColor = R.color.white
            inflateMenu(R.menu.action_menu)
            setOnMenuItemClickListener { item: MenuItem? ->

                Toast.makeText(
                    this@ContextualMenuActivity,
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

        registerForContextMenu(binding.button)

        binding.button.setOnLongClickListener { view ->
            // Called when the user long-clicks on someView
            when (actionMode) {
                null -> {
                    // Start the CAB using the ActionMode.Callback defined above
                    actionMode = startActionMode(actionModeCallback)
                    view.isSelected = true
                    true
                }
                else -> false
            }
        }

    }

    override fun onCreateContextMenu(
        menu: ContextMenu, v: View,
        menuInfo: ContextMenu.ContextMenuInfo
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.contextual_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val info = item.menuInfo as AdapterView.AdapterContextMenuInfo
        return when (item.itemId) {
            R.id.save -> {
                Toast.makeText(this@ContextualMenuActivity, info.id.toString(), Toast.LENGTH_SHORT)
                    .show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }

    private val actionModeCallback = object : ActionMode.Callback {
        // Called when the action mode is created; startActionMode() was called
        override fun onCreateActionMode(mode: ActionMode, menu: Menu): Boolean {
            // Inflate a menu resource providing context menu items
            mode.menuInflater.inflate(R.menu.contextual_menu, menu)
            return true
        }

        // Called each time the action mode is shown. Always called after onCreateActionMode, but
        // may be called multiple times if the mode is invalidated.
        override fun onPrepareActionMode(mode: ActionMode, menu: Menu): Boolean {
            mode.title = "My Action Mode"
            mode.subtitle = "by Maverick"
            return false // Return false if nothing is done
        }

        // Called when the user selects a contextual menu item
        override fun onActionItemClicked(mode: ActionMode, item: MenuItem): Boolean {
            return when (item.itemId) {
                R.id.save -> {

                    mode.finish() // Action picked, so close the CAB
                    true
                }
                else -> false
            }
        }

        // Called when the user exits the action mode
        override fun onDestroyActionMode(mode: ActionMode) {
            actionMode = null
        }
    }


}