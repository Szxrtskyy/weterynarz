package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText etOwner = findViewById(R.id.editText);
        EditText etPurpose = findViewById(R.id.editText2);
        EditText etTime = findViewById(R.id.editText3);
        ListView lvSpecies = findViewById(R.id.listView);
        SeekBar sbAge = findViewById(R.id.seekBar);
        TextView tvAgeLabel = findViewById(R.id.textView2);
        Button btnOK = findViewById(R.id.btnOK);
        TextView tvResult = findViewById(R.id.textView3);
    }

}