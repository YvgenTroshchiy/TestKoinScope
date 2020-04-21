package com.troshchiy.testkoinscope

import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        btn_open.setOnClickListener {
            btn_open.visibility = GONE

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, TabFragment())
                .addToBackStack("tag")
                .commit()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        btn_open.visibility = VISIBLE
    }
}
