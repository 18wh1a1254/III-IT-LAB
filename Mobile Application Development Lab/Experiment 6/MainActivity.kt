package com.example.linearlayoutreg

import android.R.id
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.linearlayoutreg.R.id
import com.example.linearlayoutreg.R.layout

class MainActivity : AppCompatActivity() {
    var tv1: TextView? = null
    var tv2: TextView? = null
    var tv3: TextView? = null
    var tv4: TextView? = null
    var tv5: TextView? = null
    var tv6: TextView? = null
    var tv7: TextView? = null
    var b: Button? = null
    var et1: EditText? = null
    var et2: EditText? = null
    var et3: EditText? = null
    var et4: EditText? = null
    var radioSexGroup: RadioGroup? = null
    var radioSexButton: RadioButton? = null
    var dob: DatePicker? = null
    var sp: Spinner? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        tv1 = findViewById(id.TextView7)
        tv2 = findViewById(id.TextView9)
        tv3 = findViewById(id.TextView10)
        tv4 = findViewById(id.TextView12)
        tv5 = findViewById(id.TextView11)
        tv6 = findViewById(id.TextView12)
        tv7 = findViewById(id.TextView14)
        b = findViewById(id.button1)
        et1 = findViewById(id.EditText1)
        et2 = findViewById(id.EditText2)
        et3 = findViewById(id.EditText3)
        et4 = findViewById(id.EditText4)
        dob = findViewById(id.datepicker)
        sp = findViewById<View>(id.spinner) as Spinner
        val details: TextView
        details = findViewById(id.details)
        details.text = "Your Details are:"
        b.setOnClickListener(object : View.OnClickListener {
            @Throws(CloneNotSupportedException::class)
            protected override fun clone(): Any {
                return super.clone()
            }

            override fun onClick(v: View) {
                val st = et1.getText().toString()
                val st1 = et2.getText().toString()
                val st2 = et3.getText().toString()
                val st3 = et4.getText().toString()
                tv1.setText("Username: $st")
                tv2.setText("Password: $st1")
                tv3.setText("Address: $st2")
                tv4.setText("Age: $st3")
                onRadioButtonClicked()
                val st5 = dob.getDayOfMonth()
                val st6 = dob.getMonth() + 1
                val st7 = dob.getYear()
                tv6.setText("The Date of Birth is: $st5/$st6/$st7")
                val size = sp!!.selectedItem.toString()
                tv7.setText("Country: $size")
            }
        })
    }

    fun onRadioButtonClicked() {
        radioSexGroup = findViewById(id.radioGrp)
        val selectedId = radioSexGroup.getCheckedRadioButtonId()
        radioSexButton = findViewById<View>(selectedId) as RadioButton
        val st4 = radioSexButton!!.text.toString()
        tv5!!.text = "Gender: $st4"
    }
}