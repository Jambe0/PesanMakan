package lat.pam.pesanmakan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val tvNamaUser = findViewById<TextView>(R.id.tvNamaUser)
        val tvPesanan = findViewById<TextView>(R.id.tvPesanan)
        val btnKirim = findViewById<Button>(R.id.btnKirim)

        // Ambil data dari Intent
        val namaUser = intent.getStringExtra("USERNAME") ?: "Nazwa"
        val namaMakanan = intent.getStringExtra("MAKANAN") ?: "Tidak diketahui"

        tvNamaUser.text = "Halo $namaUser,"
        tvPesanan.text = "Pesanan saya: $namaMakanan"

        // Tombol kirim
        btnKirim.setOnClickListener {
            val intent = Intent(this, AlamatActivity::class.java)
            startActivity(intent)
        }

    }
}
