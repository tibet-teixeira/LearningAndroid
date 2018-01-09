package zoso.app.sistemadecompras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.app.*;

public class ComprasActivity extends AppCompatActivity {

    CheckBox chkarroz, chkleite, chkcarne, chkfeijao;
    Button bttotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);

        chkarroz = (CheckBox) findViewById(R.id.Chkarroz);
        chkleite = (CheckBox) findViewById(R.id.Chkleite);
        chkcarne = (CheckBox) findViewById(R.id.Chkcarne);
        chkfeijao = (CheckBox) findViewById(R.id.Chkfeijao);
        Button bttotal = (Button) findViewById(R.id.bttotal);

        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double total = 0;
                if (chkarroz.isChecked())
                    total += 2.69;
                if (chkleite.isChecked())
                    total += 5.00;
                if (chkcarne.isChecked())
                    total += 9.7;
                if (chkfeijao.isChecked())
                    total += 2.30;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(
                        ComprasActivity.this);
                dialogo.setTitle("Mercadinho Furtos e Roubos");
                dialogo.setMessage("Valor R$ "
                        + String.valueOf(total) + "\nFechar compra? \n");
                dialogo.setPositiveButton("Comprar", null);
                dialogo.setNegativeButton("Cancelar", null);
                dialogo.show();
            }


        });
    }
}
