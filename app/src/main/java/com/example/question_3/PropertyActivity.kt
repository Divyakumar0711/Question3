package com.example.question_3



import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PropertyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_property)

        val propertyType = intent.getStringExtra("EXTRA_PROPERTY_TYPE")
        val propertyLocation = intent.getStringExtra("EXTRA_PROPERTY_LOCATION")
        val propertyPrice = intent.getStringExtra("EXTRA_PROPERTY_PRICE")

        val textViewProperty = findViewById<TextView>(R.id.textViewProperty)
        textViewProperty.text = "Type: $propertyType\nLocation: $propertyLocation\nPrice: $propertyPrice"
    }
}
