package com.example.coroutine // замените на ваш package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.coroutine.databinding.MainBinding // обратите внимание: MainBinding, а не ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainBinding
    private var count: Int = 1  // текущее значение ползунка

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Настройка слушателя для SeekBar
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                count = progress
                binding.countText.text = "$count coroutines"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }
}