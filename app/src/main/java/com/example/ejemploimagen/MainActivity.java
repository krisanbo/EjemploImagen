package com.example.ejemploimagen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,cero;
    private EditText et1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno= (Button) findViewById(R.id.b1);
        dos= (Button) findViewById(R.id.b2);
        tres= (Button) findViewById(R.id.b3);
        cuatro= (Button) findViewById(R.id.b4);
        cinco= (Button) findViewById(R.id.b5);
        seis= (Button) findViewById(R.id.b6);
        siete= (Button) findViewById(R.id.b7);
        ocho= (Button) findViewById(R.id.b8);
        nueve= (Button) findViewById(R.id.b9);
        cero= (Button) findViewById(R.id.b0);

    }
    public void mostrar(View view){
        if (uno.callOnClick()){
            et1.setText(uno);


        }
    }
}