package com.meledak.dapoermu_apk

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Setup RecyclerView Resep
        val rvRecipes = findViewById<RecyclerView>(R.id.rvRecipes)
        val sampleRecipes = listOf(
            Recipe("Soto Tauto Asli Pekalongan", "45 Mins", "4.8", R.drawable.soto_tauto_asli_pekalongan),
            Recipe("Sup Matahari Khas Solo", "15 Mins", "4.7", R.drawable.sup_matahari_khas_solo),
            Recipe("Soto Tauto Asli Pekalongan", "45 Mins", "4.8", R.drawable.soto_tauto_asli_pekalongan),
            Recipe("Sup Matahari Khas Solo", "15 Mins", "4.7", R.drawable.sup_matahari_khas_solo)
        )
        rvRecipes.layoutManager = GridLayoutManager(this, 2)
        rvRecipes.adapter = RecipeAdapter(sampleRecipes)

        // Setup Bottom Navigation & FAB
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val fabAdd = findViewById<FloatingActionButton>(R.id.fabAdd)
        bottomNavigationView.background = null

        // Hilangkan latar belakang item agar mengikuti bentuk BottomAppBar
        bottomNavigationView.background = null

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Berada di Halaman Home
                    true
                }
                R.id.nav_bookmark -> {
                    Toast.makeText(this, "Halaman Bookmark", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_notification -> {
                    Toast.makeText(this, "Halaman Notifikasi", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_profile -> {
                    Toast.makeText(this, "Halaman Profile", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        // Action Klik Tombol (+)
        fabAdd.setOnClickListener {
            Toast.makeText(this, "Tambah Resep Baru", Toast.LENGTH_SHORT).show()
        }
    }
}