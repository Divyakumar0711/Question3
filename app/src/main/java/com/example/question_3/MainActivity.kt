
package com.example.question_3


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCar = findViewById<Button>(R.id.buttonCar)
        val buttonProperty = findViewById<Button>(R.id.buttonProperty)

        buttonCar.setOnClickListener {
            val intent = Intent(this, CarActivity::class.java).apply {
                putExtra("EXTRA_CAR_BRAND", "Toyota")
                putExtra("EXTRA_CAR_MODEL", "Corolla")
                putExtra("EXTRA_CAR_YEAR", "2022")
            }
            startActivity(intent)
        }

        buttonProperty.setOnClickListener {
            val intent = Intent(this, PropertyActivity::class.java).apply {
                putExtra("EXTRA_PROPERTY_TYPE", "House")
                putExtra("EXTRA_PROPERTY_LOCATION", "123 Main St, Springfield")
                putExtra("EXTRA_PROPERTY_PRICE", "$300,000")
            }
            startActivity(intent)
        }
    }
}
