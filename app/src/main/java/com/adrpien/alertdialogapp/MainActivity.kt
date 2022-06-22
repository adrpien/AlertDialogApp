package com.adrpien.alertdialogapp

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.adrpien.alertdialogapp.databinding.ActivityMainBinding
import kotlin.concurrent.fixedRateTimer
import kotlin.math.E

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val DEFAULT_DIALOG = "DEFAULT DIALOG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.defaultDialogButton.setOnClickListener {
            createDefaultDialog(this)
        }
    }

    private fun createDefaultDialog(context: Context) {
        val dialog = DefaultDialog()
        dialog.show(supportFragmentManager, DEFAULT_DIALOG)
    }
}
