package io.github.calcular

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity :
    AppCompatActivity(), View.OnClickListener {

        override fun onCreate(
            savedInstanceState: Bundle?
        ) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val suma = findViewById<Button>(R.id.sumar)

            suma.setOnClickListener(this)
            }


    override fun onClick(v: View?) {
        val n1 = findViewById<EditText>(R.id.num1)
        val n2 = findViewById<EditText>(R.id.num2)
        val r = findViewById<TextView>(R.id.txtresultado)
        val a = Integer.parseInt(n1.text.toString())
        val b = Integer.parseInt(n2.text.toString())
        val c = a + b
        r.setText("Resultado $c.")

    }
}