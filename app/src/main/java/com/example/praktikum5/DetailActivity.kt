package com.example.praktikum5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.example.praktikum5.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        intent.putExtra("nim",listStudent[position].nim)
//        intent.putExtra("nama",listStudent[position].nama)
//        intent.putExtra("notelepon",listStudent[position].nomortelepon)
//        intent.putExtra("foto",listStudent[position].foto)

        val nim = intent.getStringExtra("nim")
        val nama = intent.getStringExtra("nama")
        val nomortelepon = intent.getStringExtra("nomortelepon")
        val foto = intent.getStringExtra("foto")

        binding.txtNim.text = nim
        binding.txtNama.text = nama
        binding.txtNoTelp.text = nomortelepon
        Glide.with(this).load(foto).into(binding.images)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
//                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}