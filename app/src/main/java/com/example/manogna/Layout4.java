package com.example.manogna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Layout4 extends Activity {
    Button b4;

    TextView p1,p2,p3,p4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
        b4 = (Button)findViewById(R.id.register);
        p1 = (EditText)findViewById(R.id.username);
        p2 = (EditText)findViewById(R.id.password);
        p3 = (EditText)findViewById(R.id.name);
        p4 = (EditText)findViewById(R.id.email);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    //public void onClick(View v) {
                    Intent i4 = new Intent(Layout4.this, MainActivity.class);
                    Layout4.this.startActivity(i4);
                }

            }

        );
    }

}

