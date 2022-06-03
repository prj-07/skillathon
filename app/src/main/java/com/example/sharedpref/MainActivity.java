package com.example.sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,phone;
    Button save,display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.PersonName);
        phone =findViewById(R.id.PersonNumber);
        save = findViewById(R.id.buttonsave);
        display = findViewById(R.id.buttondisplay);

    save.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            SaveData(view);
        }
    });
    display.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            DisplayData(view);
        }
    });

    }

    public void SaveData(View view) {

        String namestr = name.getText().toString();
        String phonestr =phone.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences("user", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("name",namestr);
        editor.putString("phone",phonestr);
        editor.apply();
        Toast.makeText(this, "Data has been saved", Toast.LENGTH_SHORT).show();
    }

    public void DisplayData(View view  ) {
        startActivity(new Intent(MainActivity.this,DisplayActivity.class));
    }




}