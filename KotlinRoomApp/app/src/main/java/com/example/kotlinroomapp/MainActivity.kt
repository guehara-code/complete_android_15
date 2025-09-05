package com.example.kotlinroomapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var itemName: EditText
    lateinit var itemPrice: EditText
    lateinit var itemQuantity: EditText
    lateinit var dbRecordText: TextView
    lateinit var saveBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        itemName = findViewById(R.id.editText1)
        itemPrice = findViewById(R.id.editText2)
        itemQuantity = findViewById(R.id.editText3)
        dbRecordText = findViewById(R.id.textView3)
        saveBtn = findViewById(R.id.saveItemBtn)


        saveBtn.setOnClickListener {
            insertItem()
        }


    }

    fun insertItem() {

        val name = itemName.text.toString()
        val price = itemPrice.text.toString()
        val quantity = itemQuantity.text.toString()

        val doublePrice = price.toDouble()
        val intQuality = quantity.toInt()

        val myDB = MyDB.getDatabase(applicationContext)

        val myDAO = myDB.itemDAO()

        val myItem: Item = Item(0 , name, doublePrice, intQuality)

        CoroutineScope(Dispatchers.IO).launch {
            myDAO.insertItem(myItem)
        }

    }

}