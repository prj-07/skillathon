package com.example.sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView name,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
    name  = findViewById(R.id.textView4);
    phone = findViewById(R.id.textView5);
        SharedPreferences sharedPreferences = getSharedPreferences("user", Context.MODE_PRIVATE);
        name.setText(sharedPreferences.getString("name",""));
        phone.setText(sharedPreferences.getString("phone",""));

    }
}