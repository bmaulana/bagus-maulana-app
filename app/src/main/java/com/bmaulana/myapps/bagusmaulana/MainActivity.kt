package com.bmaulana.myapps.bagusmaulana

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.text.Spanned
import android.text.SpannableString
import android.text.style.TypefaceSpan

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // change background colour
        window.decorView.setBackgroundColor(ContextCompat.getColor(
                applicationContext, R.color.colorSecondary))

        // change font of action bar
        val typefaceSpan = TypefaceSpan("sans-serif-light")
        val str = SpannableString(supportActionBar?.title) // ? = if not null
        str.setSpan(typefaceSpan, 0, str.length, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
        supportActionBar!!.title = str // !! = asserts not null
    }
}