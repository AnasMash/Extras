package com.clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_activity2_extras.*

class MainActivity2_Extras : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main_activity2_extras)
		tv_act2.text = intent.getStringExtra("data")
	}
}