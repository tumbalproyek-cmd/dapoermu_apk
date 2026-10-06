package com.meledak.dapoermu_apk

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // Sembunyikan Action Bar bawaan
        supportActionBar?.hide()

        // Inisialisasi komponen UI dari XML
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnMasuk = findViewById<Button>(R.id.btnMasuk)
        val tvSignUp = findViewById<TextView>(R.id.tvSignUp)

        // Aksi saat tombol Masuk diklik
        btnMasuk.setOnClickListener {
            // Logika masuk / validasi (akan disambungkan nanti)
        }

        // Aksi saat teks "Sign up" diklik
        tvSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}