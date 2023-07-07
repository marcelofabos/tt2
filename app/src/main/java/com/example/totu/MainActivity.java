package com.example.totu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //metodo boton siguieten

    public void siguiente(View view ){
        Intent siguiente = new Intent(this,pantalla2.class);
        startActivity(siguiente);
    }

}