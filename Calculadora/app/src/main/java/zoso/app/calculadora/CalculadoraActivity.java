package zoso.app.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class CalculadoraActivity extends AppCompatActivity {

    EditText number1, number2;
    Button btSomar, btSubtrair, btDividir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        btSomar = (Button) findViewById(R.id.btSomar);
        btSubtrair = (Button) findViewById(R.id.btSubtrair);
        btDividir = (Button) findViewById(R.id.btDivisao);

        // Como reutilizar a variaveis num1 e num2

        btSomar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double soma = num1 + num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

                dialogo.setTitle("Resultado soma");

                dialogo.setMessage("A soma é " + soma);

                dialogo.setNeutralButton("Ok", null);

                dialogo.show();

            }
        });

        btSubtrair.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double subtrai = num1 - num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

                dialogo.setTitle("Resultado subtracao");

                dialogo.setMessage("A subtracao é " + subtrai);

                dialogo.setNeutralButton("Ok", null);

                dialogo.show();
            }

        });

        btDividir.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                String message;

                if(num2 != 0) {
                    double divisao = num1 / num2;
                    message = "A divisao é " + divisao;
                }
                else{
                    message = "Insira um numero diferente de 0 (zero) no segundo campo";
                }

                AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

                dialogo.setTitle("Resultado subtracao");

                dialogo.setMessage(message);

                dialogo.setNeutralButton("Ok", null);

                dialogo.show();

            }
        });

    }
}
