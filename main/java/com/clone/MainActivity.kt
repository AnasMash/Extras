package com.clone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		var i = Intent(this,MainActivity2_Extras::class.java)

		btn_run.setOnClickListener {
			i.putExtra("data",et_Extras.text.toString())
			startActivity(i)
		}
	}
}