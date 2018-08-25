package com.kronos.jhe.formsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    fun setListener() {
        sendValues.setOnClickListener {
            if (edit_name.text.isNotEmpty() && edit_lastName.text.isNotEmpty() &&
                    edit_address.text.isNotEmpty() && edit_number.text.isNotEmpty() &&
                    edit_rfc.text.isNotEmpty() && edit_email.text.isNotEmpty() &&
                    edit_aptitude.text.isNotEmpty()) {

                edit_name.setText("")
                edit_lastName.setText("")
                edit_address.setText("")
                edit_number.setText("")
                edit_rfc.setText("")
                edit_email.setText("")
                edit_aptitude.setText("")
                Toast.makeText(this, R.string.Success, Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, R.string.failure, Toast.LENGTH_LONG).show()

            }

        }
    }
}
