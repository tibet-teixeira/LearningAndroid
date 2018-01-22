package com.tibetteixeira.sistemadecadastro;

import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ZoSo on 22/01/2018.
 */

public class TelaListagemUsuarios {
    MainActivity act;
    TelaPrincipal tela_principal;
    Button btAnterior, btProximo, btFechar;
    TextView txtNome, txtTelefone, txtEndereco, txtStatus;

    int index;

    public TelaListagemUsuarios(MainActivity act,TelaPrincipal tela_principal){
        this.act = act;
        this.tela_principal = tela_principal;
        index = 0;
    }

    public void carregaTela(){

        //Verica se ha registros inseridos
        if(act.getRegistros().size() == 0){
            AlertDialog.Builder dialogo = new AlertDialog.Builder(act);
            dialogo.setTitle("Aviso");
            dialogo.setMessage("Não existe nenhum registro cadastrado.");
            dialogo.setNeutralButton("Ok", null);
            dialogo.show();
            return;
        }
        act.setContentView(R.layout.listagem_usuarios_cadastros);
        btAnterior = (Button) act.findViewById(R.id.btAnterior);
        btProximo = (Button) act.findViewById(R.id.btProximo);
        btFechar = (Button) act.findViewById(R.id.btFechar);
        txtNome = (TextView) act.findViewById(R.id.txtNome);
        txtEndereco = (TextView) act.findViewById(R.id.txtEndereco);
        txtTelefone = (TextView) act.findViewById(R.id.txtTelefone);
        txtStatus = (TextView) act.findViewById(R.id.txtStatus);

        preencheCampos(index);
        atualizaStatus(index);

        btAnterior.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                if(index > 0){
                    index--;
                    preencheCampos(index);
                    atualizaStatus(index);
                }
            }
        });

        btProximo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                if(index < act.getRegistros().size() - 1){
                    index++;
                    preencheCampos(index);
                    atualizaStatus(index);

                }
            }
        });

        btFechar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                tela_principal.carregaTela();
            }
        });
    }

    private void preencheCampos(int idx){
        txtNome.setText(act.getRegistros().get(idx).getNome());
        txtTelefone.setText(act.getRegistros().get(idx).getTelefone());
        txtEndereco.setText(act.getRegistros().get(idx).getEndereco());
    }

    private void atualizaStatus(int idx){
        int total = act.getRegistros().size();
        txtStatus.setText("Registros: " + (idx + 1) + "/" + total);
    }
}
