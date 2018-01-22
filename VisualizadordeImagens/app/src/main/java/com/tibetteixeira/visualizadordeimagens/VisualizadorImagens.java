package com.tibetteixeira.visualizadordeimagens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class VisualizadorImagens extends AppCompatActivity {

    ImageView image;
    Button btFoto1, btFoto2;
    TextView textInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizador_imagens);

        image = (ImageView) findViewById(R.id.image);
        btFoto1 = (Button) findViewById(R.id.btFoto1);
        btFoto2 = (Button) findViewById(R.id.btFoto2);
        textInfo = (TextView) findViewById(R.id.textInfo);

        btFoto1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0){
                image.setImageResource(R.drawable.pandinha);
                textInfo.setText("Foto 1");
            }
        });

        btFoto2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0){
                image.setImageResource(R.drawable.fs);
                textInfo.setText("Foto 2");
            }
        });
    }
}
