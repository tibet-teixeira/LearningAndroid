package com.tibetteixeira.trocadetelas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrocaTelasActivity extends AppCompatActivity {

    Button btTelaPrinc, btTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        carregarTelaPrincipal();
    }
    public void carregarTelaPrincipal(){
        setContentView(R.layout.activity_troca_telas);
        btTela2 = (Button) findViewById(R.id.btTela2);
        btTela2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                carregarTela2();
            }
        });
    }

    public void carregarTela2(){
        setContentView(R.layout.tela2);
        btTelaPrinc = (Button) findViewById(R.id.btTelaPrinc);
        btTelaPrinc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                carregarTelaPrincipal();
            }
        });
    }
}
