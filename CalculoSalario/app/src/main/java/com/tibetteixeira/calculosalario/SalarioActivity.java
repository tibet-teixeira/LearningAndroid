package com.tibetteixeira.calculosalario;

import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.Currency;
import java.util.Locale;

public class SalarioActivity extends AppCompatActivity {

    RadioGroup rgOpcoes;
    Button btCalcular;
    EditText etSalario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salario);

        rgOpcoes = (RadioGroup) findViewById(R.id.rgOpcoes);
        btCalcular = (Button) findViewById(R.id.btCalcular);
        etSalario = (EditText) findViewById(R.id.etSalario);

        btCalcular.setOnClickListener(new View.OnClickListener(){

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View arg0){
                double salario = Double.parseDouble(etSalario.getText().toString());
                int op = rgOpcoes.getCheckedRadioButtonId();
                double novo_salario = 0;

                if(op == R.id.rb40)
                    novo_salario = salario + (salario * 0.40);
                else if(op == R.id.rb45)
                    novo_salario = salario + (salario * 0.45);
                else
                    novo_salario = salario + (salario * 0.50);

                //NumberFormat numberFormat = new DecimalFormat("#,##");
                //String str = numberFormat.format(novo_salario);
                String str = NumberFormat.getNumberInstance(Locale.US).format(novo_salario);

                AlertDialog.Builder dialogo = new AlertDialog.Builder(SalarioActivity.this);

                dialogo.setTitle("Novo salário");

                dialogo.setMessage("Seu novo salário é \nR$" + str);

                dialogo.setNeutralButton("Ok", null);

                dialogo.show();
            }

        });

    }
}
