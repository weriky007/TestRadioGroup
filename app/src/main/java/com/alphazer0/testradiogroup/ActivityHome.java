package com.alphazer0.testradiogroup;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityHome extends AppCompatActivity {
    RadioGroup radioGroup;
    Button button;
    String start = "Dinheiro";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        radioGroup = findViewById(R.id.formas_de_pagamento);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concluiVenda();
            }
        });
    }


    public void concluiVenda() {

        ColorDrawable back = new ColorDrawable(Color.WHITE);
        InsetDrawable inset = new InsetDrawable(back, 0);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(ActivityHome.this);
        String[] itens = {"Dinheiro","Cartao de Credito","Cartao de Debito","Conta Cliente"};
         alertDialog.setTitle("Concluir compra");
        alertDialog.setSingleChoiceItems(itens, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                start = itens[i];
                Toast.makeText(ActivityHome.this, ""+start, Toast.LENGTH_SHORT).show();
            }
        });
        alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.show();

    }
}
