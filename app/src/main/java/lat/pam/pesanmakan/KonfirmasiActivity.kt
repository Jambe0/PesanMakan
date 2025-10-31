package lat.pam.pesanmakan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KonfirmasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi)

        val tvHalo = findViewById<TextView>(R.id.tvHalo)
        val btnKembali = findViewById<Button>(R.id.btnKembali)

        // Ambil nama user dari intent (jika dikirim dari activity sebelumnya)
        val namaUser = intent.getStringExtra("USERNAME") ?: "Nazwa"
        tvHalo.text = "Halo $namaUser,"

        // Ketika tombol ditekan, kembali ke layar awal (home)
        btnKembali.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
