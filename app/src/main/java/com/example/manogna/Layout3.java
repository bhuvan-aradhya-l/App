package com.example.manogna;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Layout3 extends AppCompatActivity {

    Button b3;

    TextView p1,p2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
        b3 = (Button)findViewById(R.id.button);
        p1 = (EditText)findViewById(R.id.editTextTextPassword);
        p2 = (EditText)findViewById(R.id.editTextTextPassword2);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p1.getText().toString().equals(p2)) {
                    Toast.makeText(getApplicationContext(),
                            "Changed Password Successfully!", Toast.LENGTH_SHORT).show();
                    //public void onClick(View v) {
                        Intent i3 = new Intent(Layout3.this, MainActivity.class);
                        Layout3.this.startActivity(i3);
                    }
                else {
                    Toast.makeText(getApplicationContext(), "Re-Enter Password", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}