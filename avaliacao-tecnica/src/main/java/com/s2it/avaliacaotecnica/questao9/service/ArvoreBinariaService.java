package com.s2it.avaliacaotecnica.questao9.service;

import com.s2it.avaliacaotecnica.questao9.model.ArvoreBinaria;

public class ArvoreBinariaService {

    public int getValoresSomados(ArvoreBinaria arvoreBinaria){
        return somarValores(arvoreBinaria);
    }

    private int somarValores(ArvoreBinaria arvoreBinaria) {

        if (arvoreBinaria == null) {
            return 0;
        }

        return arvoreBinaria.getValor() + somarValores(arvoreBinaria.getDireita()) + somarValores(arvoreBinaria.getEsquerda());
    }

}
