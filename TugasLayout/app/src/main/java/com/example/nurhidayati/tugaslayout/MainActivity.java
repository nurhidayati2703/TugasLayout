package com.example.nurhidayati.tugaslayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnbreakfast, btnlunch, btndrink, btndessert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnbreakfast = (Button) findViewById(R.id.btnbreakfast);
        btnlunch = (Button) findViewById(R.id.btnlunch);
        btndrink = (Button) findViewById(R.id.btndrink);
        btndessert = (Button) findViewById(R.id.btndessert);

        btndessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Dessert.class);
                startActivity(i);
            }
        });


    }
}
