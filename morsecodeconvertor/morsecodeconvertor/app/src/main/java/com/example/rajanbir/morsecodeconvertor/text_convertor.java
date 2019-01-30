package com.example.rajanbir.morsecodeconvertor;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class text_convertor extends AppCompatActivity {


    private TextView txt;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_convertor);
        Log.d("Check", "intent");
        txt = (TextView) findViewById(R.id.txt);
        result = (TextView) findViewById(R.id.result);
        Button toMorseBtn = (Button) findViewById(R.id.toMorseBtn);
        Button toAlphaBtn = (Button) findViewById(R.id.toAlphaBtn);

        toMorseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtToConvert = txt.getText().toString();
                String convertedTxt = AlphaToMorse.alphaToMorse(txtToConvert);
                result.setText(convertedTxt);
            }
        });

        toAlphaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtToConvert = txt.getText().toString();
                String convertedTxt = AlphaToMorse.morseToAlpha(txtToConvert);
                result.setText(convertedTxt);
            }
        });
    }
}


