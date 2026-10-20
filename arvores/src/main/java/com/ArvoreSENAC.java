package com;

import com.arvores.ArvoreBase;
import com.arvores.NoArvore;

public class ArvoreSENAC extends ArvoreBase {
    @Override 
    public void demonstrar(){
        NoArvore<String> senac = new NoArvore("SENAC");
        definirRaiz(senac);
        
        NoArvore<String> disciplinas = new NoArvore<String>("Disciplinas");

        senac.adicionarFilho(disciplinas);

        NoArvore<String> contas = new NoArvore("Contas");
        financeiro.adicionarFilho(contas);

        exibirResumo();
    }

}
