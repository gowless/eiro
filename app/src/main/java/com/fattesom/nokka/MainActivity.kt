package com.fattesom.nokka

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.fattesom.nokka.main.MainActivity
import com.trident.library.BackObject
import com.trident.library.callbacks.BackObjectCallback

class MainActivity : AppCompatActivity(), BackObjectCallback {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_second)

        window.statusBarColor = ContextCompat.getColor(this, R.color.mains)

        BackObject.setup(appsflyerId = "JyorSgpERyDvBUGvuYf7ib", oneSignalId = "9e4553e7-2628-49e9-ac46-6176bf6b167d", activity = this)

    }

    override fun startGame() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}