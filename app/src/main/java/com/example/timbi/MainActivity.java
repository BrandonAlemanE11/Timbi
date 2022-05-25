package com.example.timbi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    TextView txtjugador1, txtjugador2;
    float turno = 1;
    int cuadro1 = 0;
    int cuadro2 = 0;
    int cuadro3 = 0;
    int jugador1 = 0;
    int jugador2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        txtjugador1 = findViewById(R.id.txtjugador1);
        txtjugador2 = findViewById(R.id.txtjugador2);


    }

    private void Comprobar() {
        if(cuadro1 == 4){
            if(turno == 0 || turno == 2){
                turno = 2;
                jugador1 = jugador1 + 1;
                txtjugador1.setText("Jugador1 : " + jugador1);
                txtjugador2.setText("Jugador 2 : " + jugador2 );
            }
            if(turno == 1 || turno == 1.5){
                turno = 1;
                jugador2 = jugador2 + 1;
                txtjugador2.setText("jugador 2 : " + jugador2);
                txtjugador1.setText("jugador 1 : " + jugador1);
            }
        }
    }

    public void btn1(View view) {
        if(turno == 1 || turno == 1.5){
            cuadro1 = cuadro1 + 1;
            turno = (float) (turno + 0.5);
            Comprobar();
            btn1.setTextColor(getResources().getColor(R.color.white));
            btn1.setEnabled(false);
        }
        else{
            if(turno == 2){
                cuadro1 = cuadro1 + 1;
                btn1.setEnabled(false);
                turno = (float) (turno - 2);
                Comprobar();
            }
            else{
                if(turno == 0){
                    cuadro1 = cuadro1 + 1;
                    btn1.setEnabled(false);
                    turno = (float) (turno + 1);
                    Comprobar();
                }
            }
        }
    }

    public void btn2(View view) {
        if(turno == 1 || turno == 1.5){
            cuadro1 = cuadro1 + 1;
            btn2.setEnabled(false);
            turno = (float) (turno + 0.5);
            Comprobar();
        }
        else{
            if(turno == 2){
                cuadro1 = cuadro1 + 1;
                btn2.setEnabled(false);
                turno = (float) (turno - 2);
                Comprobar();
            }
            else{
                if(turno == 0){
                    cuadro1 = cuadro1 + 1;
                    btn2.setEnabled(false);
                    turno = (float) (turno + 1);
                    Comprobar();
                }
            }
        }
    }

    public void btn3(View view) {
        if(turno == 1 || turno == 1.5){
            cuadro1 = cuadro1 + 1;
            cuadro2 = cuadro2 + 1;
            btn3.setEnabled(false);
            turno = (float) (turno + 0.5);
            Comprobar();
        }
        else{
            if(turno == 2){
                cuadro1 = cuadro1 + 1;
                cuadro2 = cuadro2 + 1;
                btn3.setEnabled(false);
                turno = (float) (turno - 2);
                Comprobar();
            }
            else{
                if(turno == 0){
                    cuadro1 = cuadro1 + 1;
                    cuadro2 = cuadro2 + 1;
                    btn3.setEnabled(false);
                    turno = (float) (turno + 1);
                    Comprobar();
                }
            }
        }
    }

    public void btn4(View view) {
        if(turno == 1 || turno == 1.5){
            cuadro1 = cuadro1 + 1;
            btn4.setEnabled(false);
            turno = (float) (turno + 0.5);
            Comprobar();
        }
        else{
            if(turno == 2){
                cuadro1 = cuadro1 + 1;
                btn4.setEnabled(false);
                turno = (float) (turno - 2);
                Comprobar();
            }
            else{
                if(turno == 0){
                    cuadro1 = cuadro1 + 1;
                    btn4.setEnabled(false);
                    turno = (float) (turno + 1);
                    Comprobar();
                }
            }
        }
    }

    public void btn25(View view) {
    }

    public void btn23(View view) {
    }

    public void btn24(View view) {
    }

    public void btn26(View view) {
    }

    public void btn18(View view) {
    }

    public void btn17(View view) {
    }

    public void btn10(View view) {
    }

    public void btn6(View view) {
    }

    public void btn5(View view) {
    }

    public void btn9(View view) {
    }

    public void btn7(View view) {
    }

    public void btn8(View view) {
    }

    public void btn11(View view) {
    }

    public void btn15(View view) {
    }

    public void btn19(View view) {
    }

    public void btn20(View view) {
    }

    public void btn21(View view) {
    }

    public void btn22(View view) {
    }

    public void btn13(View view) {
    }

    public void btn14(View view) {
    }
}