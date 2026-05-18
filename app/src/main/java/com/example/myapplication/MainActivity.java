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

    private String selectedSpecies = "Pies";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText etOwner = findViewById(R.id.editText);
        EditText etPurpose = findViewById(R.id.editText2);
        EditText etTime = findViewById(R.id.editText3);
        ListView listSpecies = findViewById(R.id.listView);
        SeekBar seekBarAge = findViewById(R.id.seekBar);
        TextView editTime = findViewById(R.id.textView2);
        Button btnOK = findViewById(R.id.btnOK);
        TextView Result = findViewById(R.id.textView3);

        String[] species = {"Pies", "Kot", "Świnka morska"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, species);
        listSpecies.setAdapter(adapter);

        listSpecies.setOnItemClickListener((parent, view, position, id) -> {
            selectedSpecies = species[position];
            switch (selectedSpecies) {
                case "Pies": seekBarAge.setMax(18); break;
                case "Kot": seekBarAge.setMax(20); break;
                case "Świnka morska": seekBarAge.setMax(9); break;
            }
            seekBarAge.setProgress(0);
            editTime.setText("Ile ma lat? 0");
        });
        seekBarAge.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                editTime.setText("Ile ma lat? " + progress);
            }
            @Override public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override public void onStopTrackingTouch(SeekBar seekBar) {}
        });


    }

}