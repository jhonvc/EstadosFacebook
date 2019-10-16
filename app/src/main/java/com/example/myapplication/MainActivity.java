package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_sesion;
    EditText email;
    EditText pasword;
    Button registrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_sesion=findViewById(R.id.btn_sesion);
        email=findViewById(R.id.email);
        pasword=findViewById(R.id.pasword);
        registrarse=findViewById(R.id.btn_registrarse);

        btn_sesion.setOnClickListener(this);
        registrarse.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id =v.getId();
        switch (id){
            case R.id.btn_registrarse:
                break;
            case R.id.btn_sesion:
                goToSignUp();
                break;

        }

    }

    private void goToSignUp() {
        Intent i=new Intent(MainActivity.this,Publicar.class);
        startActivity(i);

    }
}
