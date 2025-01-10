package com.harmonigate.carddemo

import Expense
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val expense = Expense(
            iconUrl = "https://img.icons8.com/ios-filled/50/expense.png",
            price = "$45.99",
            title = "Grocery",
            note = "Bought vegetables and fruits"
        )
        // Find views
        val iconView = findViewById<ImageView>(R.id.iconView)
        val expenseTitle = findViewById<TextView>(R.id.expenseTitle)
        val shortNote = findViewById<TextView>(R.id.shortNote)
        val expensePrice = findViewById<TextView>(R.id.expensePrice)


        Glide.with(this)
            .load(expense.iconUrl)
            .placeholder(R.drawable.ic_placeholder) // Optional placeholder
            .into(iconView)

        expenseTitle.text = expense.title
        shortNote.text = expense.note
        expensePrice.text = expense.price
    }
}