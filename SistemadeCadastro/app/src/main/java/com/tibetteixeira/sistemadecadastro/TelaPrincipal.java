package com.tibetteixeira.sistemadecadastro;

/**
 * Created by ZoSo on 22/01/2018.
 */

import android.view.View;
import android.widget.Button;

public class TelaPrincipal {

    MainActivity act;

    Button btCadastrarUsuario;
    Button btListarUsuarios;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;

    public TelaPrincipal(MainActivity act){
        this.act = act;
    }

    public void carregaTela(){
        act.setContentView(R.layout.activity_main);
        btCadastrarUsuario = (Button) act.findViewById(R.id.btCadastrar);
        btListarUsuarios = (Button) act.findViewById(R.id.btListarUsuarios);

        btCadastrarUsuario.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                tela_cadastro.carregaTela();
            }
        });

        btListarUsuarios.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                tela_listagem.carregaTela();
            }
        });
    }
    
    public void setTelaCadastro(TelaCadastroUsuario tela_cadastro){
        this.tela_cadastro = tela_cadastro;
    }

    public void setTelaListagem(TelaListagemUsuarios tela_listagem){
        this.tela_listagem = tela_listagem;
    }
}
