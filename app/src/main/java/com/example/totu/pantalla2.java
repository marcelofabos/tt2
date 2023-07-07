package com.example.totu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

    }

    //metodo para boton anterior

    public void Anterior (View view){

        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);

    }
    public void siguiente(View view ){
        Intent siguiente = new Intent(this,pantalla3.class);
        startActivity(siguiente);
    }
}