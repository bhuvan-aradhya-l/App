package com.example.manogna;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Layout2 extends AppCompatActivity {

    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        b2 = (Button)findViewById(R.id.button4);

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i2 = new Intent(Layout2.this,Layout3.class);
                Layout2.this.startActivity(i2);
            }
        });
    }
}