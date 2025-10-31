package lat.pam.pesanmakan

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        // 🔹 Ambil nama user dari intent (cukup 1x di sini)
        val namaUser = intent.getStringExtra("USERNAME") ?: "Nazwa"
        tvWelcome.text = "Halo $namaUser,"

        // 🔹 Ambil item makanan
        val listMakanan = findViewById<LinearLayout>(R.id.listMakanan)
        val item1 = listMakanan.getChildAt(0)
        val item2 = listMakanan.getChildAt(1)
        val item3 = listMakanan.getChildAt(2)
        val item4 = listMakanan.getChildAt(3)
        val item5 = listMakanan.getChildAt(4)
        val item6 = listMakanan.getChildAt(5)
        val item7 = listMakanan.getChildAt(6)
        val item8 = listMakanan.getChildAt(7)
        val item9 = listMakanan.getChildAt(8)
        val item10 = listMakanan.getChildAt(9)

        // 🔹 Klik masing-masing makanan → pindah ke OrderActivity
        item1.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("USERNAME", namaUser)
            intent.putExtra("MAKANAN", "Cimol Bandung")
            startActivity(intent)
        }

        item2.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("USERNAME", namaUser)
            intent.putExtra("MAKANAN", "Batagor Bandung")
            startActivity(intent)
        }

        item3.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("USERNAME", namaUser)
            intent.putExtra("MAKANAN", "Seblak Pedas Bandung")
            startActivity(intent)
        }

        item4.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("USERNAME", namaUser)
            intent.putExtra("MAKANAN", "Cireng Crispy")
            startActivity(intent)
        }

        item5.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("USERNAME", namaUser)
            intent.putExtra("MAKANAN", "Karedok Sunda")
            startActivity(intent)
        }

// lanjut item6–10
        item6.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("USERNAME", namaUser)
            intent.putExtra("MAKANAN", "Tahu Sumedang")
            startActivity(intent)
        }

        item7.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("USERNAME", namaUser)
            intent.putExtra("MAKANAN", "Combro Pedas")
            startActivity(intent)
        }

        item8.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("USERNAME", namaUser)
            intent.putExtra("MAKANAN", "Nasi Tutug Oncom")
            startActivity(intent)
        }

        item9.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("USERNAME", namaUser)
            intent.putExtra("MAKANAN", "Surabi Bandung")
            startActivity(intent)
        }

        item10.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("USERNAME", namaUser)
            intent.putExtra("MAKANAN", "Lotek Bandung")
            startActivity(intent)
        }

        // 🔹 Bottom navigation
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> Toast.makeText(this, "Kamu di Home", Toast.LENGTH_SHORT).show()
                R.id.nav_order -> Toast.makeText(this, "Buka halaman Order", Toast.LENGTH_SHORT).show()
                R.id.nav_profile -> Toast.makeText(this, "Buka halaman Profile", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
}
