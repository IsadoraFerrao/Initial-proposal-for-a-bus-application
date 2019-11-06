package com.example.isado.tchebus;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Inicio da programação da troca de página de botões
    public void layout1 (View View){
        setContentView(R.layout.layout1);
    }
    public void layoutc1 (View View){setContentView(R.layout.layoutc1);
    }
    public void layoutc2 (View View){
        setContentView(R.layout.layoutc2);
    }
    public void layoutcentenarioprado (View View){
        setContentView(R.layout.layoutcentenarioprado);
    }
    public void layoutfavilaboavista (View View){
        setContentView(R.layout.layoutfavilaboavista);
    }
    public void layoutfavilaterminal (View View){
        setContentView(R.layout.layoutfavilaterminal);
    }
    public void layoutjoaoxiiinovabrasilia (View View){
        setContentView(R.layout.layoutjoaoxiiinovabrasilia);
    }
    public void layoutmedianeiranovabrasilia (View View){
        setContentView(R.layout.layoutmedianeiranovabrasilia);
    }
    public void layoutpolivalenteibirapuita (View View){
        setContentView(R.layout.layoutpolivalenteibirapuita);
    }
    public void layoutpradoibirapuita (View View){
        setContentView(R.layout.layoutpradoibirapuita);
    }
    public void layoutrestingacapaodoangico (View View){
        setContentView(R.layout.layoutrestingacapaodoangico);
    }
    public void layoutveracruzdrromario (View View){
        setContentView(R.layout.layoutveracruzdrromario);
    }
    public void layoutveracruzsantosdumont (View View){
        setContentView(R.layout.layoutveracruzsantosdumont);
    }


    public void voltar (View View) {
        setContentView(R.layout.activity_main);
    }


    public void rota(View view){
        //mostrar imagem da rota
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.pradocentenario);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage("Centenário - Centro - Prado").
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }
    public void rota2(View view){
        //mostrar imagem da rota
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.favilaboavista);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage("Favila - Centro - Boa Vista").
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }

    public void rota3(View view){
        //mostrar imagem da rota
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.favilaterminal);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage("Favila - Centro - Terminal").
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }

    public void rota4(View view){
        //mostrar imagem da rota
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.joaoxxiiinovabrasilia);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage("João XXIII - Centro - Nova Brasília").
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }
    public void rota5(View view){
        //mostrar imagem da rota
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.medianeiranovabrasilia);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage("Medianeira - Centro - Nova Brasília").
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }
    public void rota6(View view){
        //NÃO POSSUI LOCALIZAÇÃO
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.pradocentenario);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage("Polivalente - Centro - Ibirapuitã").
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }
    public void rota7(View view){
        //mostrar imagem da rota
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.pradoibirapuita);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage("Prado - Centro - Ibirapuitã").
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }
    public void rota8(View view){
        //mostrar imagem da rota
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.restingacapaodoangico);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage("Restinga - Centro - Capão do Angico").
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }
    public void rota9(View view){
        //mostrar imagem da rota
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.veracruzdoutorromario);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage("Vera Cruz - Centro - Doutor Romário").
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }
    public void rota10(View view){
        //mostrar imagem da rota
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.veracruzdoutorromario);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage("Vera Cruz - Centro - Santos Dumont").
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }
    public void rota11(View view){
        //mostrar imagem da rota
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.cprimeiro);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage("Rota C1").
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }
    public void rota12(View view){
        //mostrar imagem da rota
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.csegundo);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage("Rota C2").
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }

}
