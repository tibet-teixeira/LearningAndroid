package com.tibetteixeira.sistemadecadastro;

import android.app.*;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ZoSo on 22/01/2018.
 */

public class TelaCadastroUsuario {
    MainActivity act;
    EditText fieldName, fieldAddress, fieldPhone;
    Button btCadastrar, btCancelar;
    TelaPrincipal tela_principal;

    public TelaCadastroUsuario(MainActivity act, TelaPrincipal tela_principal){
        this.act = act;
        this.tela_principal = tela_principal;
    }


    public void carregaTela(){
        act.setContentView(R.layout.cadastro_usuario);
        fieldName = (EditText) act.findViewById(R.id.fieldName);
        fieldPhone = (EditText) act.findViewById(R.id.fieldPhone);
        fieldAddress = (EditText) act.findViewById(R.id.fieldAddress);
        btCadastrar = (Button) act.findViewById(R.id.btCadastrar);
        btCancelar = (Button) act.findViewById(R.id.btCancelar);

        btCadastrar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                AlertDialog.Builder dialogo = new AlertDialog.Builder(act);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Cadastrar usuário?");
                dialogo.setNegativeButton("Não", null);
                dialogo.setPositiveButton("Sim", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which){
                        String nome = fieldName.getText().toString();
                        String telefone = fieldPhone.getText().toString();
                        String endereco = fieldAddress.getText().toString();

                        act.getRegistros().add(new Registro(nome, telefone, endereco));
                        act.exibirMensagem("Cadastro efetuado com sucesso.");
                        tela_principal.carregaTela();
                    }
                });
                dialogo.show();
            }
        });

        btCancelar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                AlertDialog.Builder dialogo = new AlertDialog.Builder(act);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Cancelar cadastro?");
                dialogo.setNegativeButton("Não", null);
                dialogo.setPositiveButton("Sim", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which){
                         tela_principal.carregaTela();
                    }
                });
                dialogo.show();
            }
        });
    }
}
