package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] countries;
    Spinner spin;
    Button btn;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countries=getResources().getStringArray(R.array.country);
        spin=findViewById(R.id.spinId);
        btn=findViewById(R.id.btnId);
        text=findViewById(R.id.textId);
        ArrayAdapter<String> adapter=new ArrayAdapter(MainActivity.this,R.layout.string_view,R.id.textViewId,countries);
        spin.setAdapter(adapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=spin.getSelectedItem().toString();
                text.setText(value);

            }
        });

    }
}