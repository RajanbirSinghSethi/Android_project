package com.example.rajanbir.morsecodeconvertor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

//    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.alpha_m1);
        Button b2=findViewById(R.id.alpha_m2);

        Log.d("Check", "Find");
        b1.setOnClickListener(this);
        Log.d("Check", "listener");
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "hell", Toast.LENGTH_SHORT).show();
//                Intent intent=new Intent(MainActivity.this,text_convertor.class);
//                startActivity(intent);
//            }
//        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),sound.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View view) {
        Log.d("Check", "In function");
        Toast.makeText(MainActivity.this, "hell", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(MainActivity.this,text_convertor.class);
        startActivity(intent);
    }
}
