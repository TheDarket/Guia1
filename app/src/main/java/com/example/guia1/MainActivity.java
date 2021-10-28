package com.example.guia1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.guia1.login";
    private Button btnCalculadora;
    private Button btnLogin;
    private Button btnDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.idLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });

        btnDatos = findViewById(R.id.idDatos);
        btnDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, datos.class);
                startActivity(intent);
            }
        });

        btnCalculadora = findViewById(R.id.idCalculadora);
        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, calculadora.class);
                startActivity(intent);

            }
        });
    }
}