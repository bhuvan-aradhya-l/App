package com.example.manogna;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;
    TextView tx1,tx2,tx3,tx4;
    private FirebaseAuth auth;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        b1 = (Button)findViewById(R.id.Login);
        ed1 = (EditText)findViewById(R.id.Username);
        ed2 = (EditText)findViewById(R.id.Password);
        tx1 = (TextView)findViewById(R.id.Su);
        tx2 = (TextView)findViewById(R.id.Reset);
        tx3 = (TextView)findViewById(R.id.da);
        tx4 = (TextView)findViewById(R.id.SignIn);
        ImageView imageView = (ImageView) findViewById(R.id.Logo);
        ImageView imageView1 = (ImageView) findViewById(R.id.Google);

        imageView1.setImageResource(R.drawable.google);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email =ed1.getText().toString();
                String password = ed2.getText().toString();
                if (ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...", Toast.LENGTH_SHORT).show();
                } else  {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
                }

            }
        });
        tx2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Layout2.class);
                MainActivity.this.startActivity(i);
            }
        });
    ;}
}