package com.example.ibarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCadastrar = (Button) findViewById(R.id.cadastronovo);
        btnCadastrar.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent intent;

        if(view == btnCadastrar){
            intent= new Intent(this, Cadastro.class);
            startActivity(intent);
        }
    }
}