
package com.example.rajanbir.morsecodeconvertor;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sound extends AppCompatActivity {
    String sentence;
    EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);
        txt = findViewById(R.id.txt);

        final MediaPlayer A = MediaPlayer.create(this, R.raw.aa);
        final MediaPlayer B = MediaPlayer.create(this, R.raw.bb);
        final MediaPlayer C = MediaPlayer.create(this, R.raw.cc);
        final MediaPlayer D = MediaPlayer.create(this, R.raw.dd);
        final MediaPlayer E = MediaPlayer.create(this, R.raw.ee);
        final MediaPlayer F = MediaPlayer.create(this, R.raw.ff);
        final MediaPlayer G = MediaPlayer.create(this, R.raw.gg);
        final MediaPlayer H = MediaPlayer.create(this, R.raw.hh);
        final MediaPlayer I = MediaPlayer.create(this, R.raw.ii);
        final MediaPlayer J = MediaPlayer.create(this, R.raw.jj);
        final MediaPlayer K = MediaPlayer.create(this, R.raw.kk);
        final MediaPlayer L = MediaPlayer.create(this, R.raw.ll);
        final MediaPlayer M = MediaPlayer.create(this, R.raw.mm);
        final MediaPlayer N = MediaPlayer.create(this, R.raw.nn);
        final MediaPlayer O = MediaPlayer.create(this, R.raw.oo);
        final MediaPlayer P = MediaPlayer.create(this, R.raw.pp);
        final MediaPlayer Q = MediaPlayer.create(this, R.raw.qq);
        final MediaPlayer RR = MediaPlayer.create(this, R.raw.rr);
        final MediaPlayer S = MediaPlayer.create(this, R.raw.ss);
        final MediaPlayer T = MediaPlayer.create(this, R.raw.tt);
        final MediaPlayer U = MediaPlayer.create(this, R.raw.uu);
        final MediaPlayer V = MediaPlayer.create(this, R.raw.vv);
        final MediaPlayer W = MediaPlayer.create(this, R.raw.ww);
        final MediaPlayer X = MediaPlayer.create(this, R.raw.xx);
        final MediaPlayer Y = MediaPlayer.create(this, R.raw.yy);
        final MediaPlayer Z = MediaPlayer.create(this, R.raw.zz);


        Button playSound = (Button) this.findViewById(R.id.play);

        playSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sentence = txt.getText().toString();
                for (int j = 0; j < sentence.length(); j++) {
                    final int i = sentence.charAt(j);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            switch (i) {
                                case 'a':
                                    A.start();
                                    break;
                                case 'b':
                                    B.start();
                                    break;
                                case 'c':
                                    C.start();
                                    break;
                                case 'd':
                                    D.start();
                                    break;
                                case 'e':
                                    E.start();
                                    break;
                                case 'f':
                                    F.start();
                                    break;
                                case 'g':
                                    G.start();
                                    break;
                                case 'h':
                                    H.start();
                                    break;
                                case 'i':
                                    I.start();
                                    break;
                                case 'j':
                                    J.start();
                                    break;
                                case 'k':
                                    K.start();
                                    break;
                                case 'l':
                                    L.start();
                                    break;
                                case 'm':
                                    M.start();
                                    break;
                                case 'n':
                                    N.start();
                                    break;
                                case 'o':
                                    O.start();
                                    break;
                                case 'p':
                                    P.start();
                                    break;
                                case 'q':
                                    Q.start();
                                    break;
                                case 'r':
                                    RR.start();
                                    break;
                                case 's':
                                    S.start();
                                    break;
                                case 't':
                                    T.start();
                                    break;
                                case 'u':
                                    U.start();
                                    break;
                                case 'v':
                                    V.start();
                                    break;
                                case 'w':
                                    W.start();
                                    break;
                                case 'x':
                                    X.start();
                                    break;
                                case 'y':
                                    Y.start();
                                    break;
                                case 'z':
                                    Z.start();
                                    break;
                            }

                        }
                    }, 300*j);
                }
            }
        });
    }
}




//                for(int i=0;i<sentence.length();i++) {
//                    if (sentence.charAt(i) == 'a') {
//                        A.start();
//                    }
//                    else if(sentence.charAt(i)=='b'){
//                        B.start();
//                    }
//                    else if(sentence.charAt(i)=='c'){
//                        C.start();
//                    }
//                    else if(sentence.charAt(i)=='d'){
//                        D.start();
//                    }
//                    else if(sentence.charAt(i)=='e'){
//                        E.start();
//                    }
//                    else if(sentence.charAt(i)=='f'){
//                        F.start();
//                    }
//                    else if(sentence.charAt(i)=='g') {
//                        G.start();
//                    }
//                    else if(sentence.charAt(i)=='h') {
//                        H.start();
//                    }
//                    else if(sentence.charAt(i)=='i') {
//                        I.start();
//                    }
//                    else if(sentence.charAt(i)=='j') {
//                        J.start();
//                    }
//                    else if(sentence.charAt(i)=='k') {
//                        K.start();
//                    }
//                    else if(sentence.charAt(i)=='l') {
//                        L.start();
//                    }
//                    else if(sentence.charAt(i)=='m') {
//                        M.start();
//                    }
//                    else if(sentence.charAt(i)=='n') {
//                        N.start();
//                    }
//                    else if(sentence.charAt(i)=='o') {
//                        O.start();
//                    }
//                    else if(sentence.charAt(i)=='p') {
//                        P.start();
//                    }
//                    else if(sentence.charAt(i)=='q') {
//                        Q.start();
//                    }
//                    else if(sentence.charAt(i)=='r') {
//                        RR.start();
//                    }
//                    else if(sentence.charAt(i)=='s') {
//                        S.start();
//                    }
//                    else if(sentence.charAt(i)=='t') {
//                        T.start();
//                    }
//                    else if(sentence.charAt(i)=='u') {
//                        U.start();
//                    }
//                    else if(sentence.charAt(i)=='v') {
//                        V.start();
//                    }
//                    else if(sentence.charAt(i)=='w') {
//                        W.start();
//                    }
//                    else if(sentence.charAt(i)=='x') {
//                        X.start();
//                    }
//                    else if(sentence.charAt(i)=='y') {
//                        Y.start();
//                    }
//                    else if(sentence.charAt(i)=='z') {
//                    else {
//                        Z.start();
//                    }
//
//
//                }
//            }
//
//        });