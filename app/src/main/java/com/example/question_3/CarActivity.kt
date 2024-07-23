package com.example.question_3



import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car)

        val carBrand = intent.getStringExtra("EXTRA_CAR_BRAND")
        val carModel = intent.getStringExtra("EXTRA_CAR_MODEL")
        val carYear = intent.getStringExtra("EXTRA_CAR_YEAR")

        val textViewCar = findViewById<TextView>(R.id.textViewCar)
        textViewCar.text = "Brand: $carBrand\nModel: $carModel\nYear: $carYear"
    }
}
