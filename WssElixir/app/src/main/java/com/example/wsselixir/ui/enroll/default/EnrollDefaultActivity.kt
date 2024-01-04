package com.example.wsselixir.ui.enroll.default

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView
import com.example.wsselixir.databinding.ActivityEnrollDefaultBinding
import com.google.android.material.appbar.AppBarLayout

class EnrollDefaultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEnrollDefaultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEnrollDefaultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupAppBar()
    }

    private fun setupAppBar() {
        val nestedScrollView: NestedScrollView = binding.svEnroll
        val appBarLayout: AppBarLayout = binding.alEnrollAppBar

        nestedScrollView.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { _, _, scrollY, _, _ ->
            val scrollRatio = scrollY.toFloat() / appBarLayout.height
            val colorAlpha = 255.coerceAtMost((scrollRatio * 255).toInt())

            appBarLayout.setBackgroundColor(Color.argb(colorAlpha, 255, 255, 255))
        })
    }
}