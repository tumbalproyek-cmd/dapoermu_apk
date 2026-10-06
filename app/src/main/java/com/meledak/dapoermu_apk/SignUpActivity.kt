package com.meledak.dapoermu_apk

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        supportActionBar?.hide()

        val etNama = findViewById<EditText>(R.id.etNama)
        val etEmail = findViewById<EditText>(R.id.etEmailSignUp)
        val etPassword = findViewById<EditText>(R.id.etPasswordSignUp)
        val etConfirmPassword = findViewById<EditText>(R.id.etConfirmPassword)
        val cbSyaratKondisi = findViewById<CheckBox>(R.id.cbSyaratKondisi)
        val btnDaftar = findViewById<Button>(R.id.btnDaftar)
        val tvSignIn = findViewById<TextView>(R.id.tvSignIn)

        btnDaftar.setOnClickListener {
            // Logika pendaftaran akun (akan disambungkan ke backend/database)
        }

        // Kembali ke halaman Sign In jika teks "Masuk" diklik
        tvSignIn.setOnClickListener {
            finish()
        }
    }
}