package com.tibetteixeira.exemplocommenus;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MenusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_aplicacao, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        {
            switch (item.getItemId()) {
                case R.id.item_novo:
                    //Executa algo
                    break;
                case R.id. item_abrir:
                    //Executa algo
                    break;
                case R.id.item_salvar_copia:
                    //Executa algo
                    break;
                case R.id.item_salvar_como:
                    //Executa algo
                    break;
            }
            return super.onOptionsItemSelected(item);
        }
    }

}

