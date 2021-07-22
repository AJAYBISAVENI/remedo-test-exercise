package com.example.remedotest

import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var picker: DatePicker? = null
    var displayDate: Button? = null
    var textview1: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview1= findViewById(R.id.textView1)
        picker=findViewById(R.id.datePicker)
//        displayDate=findViewById(R.id.button1);

//        textview1.setText("Current Date: "+getCurrentDate());

        displayDate?.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                textview1.setText("Change Date: "+getCurrentDate());
            }

        });
        displayDate?.setOnClickListener{
            textview1?.setText("change date")
        }

    }
    public String getCurrentDate(){
        StringBuilder builder=new StringBuilder();;
        builder.append((picker.getMonth() + 1)+"/");//month is 0 based
        builder.append(picker.getDayOfMonth()+"/");
        builder.append(picker.getYear());
        return builder.toString();
    }

    fun getCurrentDate():String {
        val builder = java.lang.StringBuilder();
        builder.append((picker!!.getMonth() + 1)!!+"/")
    }
}