package com.s2it.avaliacaotecnica.questao9;

import com.s2it.avaliacaotecnica.questao9.model.ArvoreBinaria;
import com.s2it.avaliacaotecnica.questao9.service.ArvoreBinariaService;
import org.junit.Assert;
import org.junit.Test;

public class ArvoreBinariaTest {


    @Test
    public void arvoreBinariaDeveRetornarValorDoNo() {

        // Definição
        int retornoEsperado = 10;
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.setValor(retornoEsperado);


        // Ação
        ArvoreBinariaService service = new ArvoreBinariaService();

        // Resultado
        Assert.assertEquals(retornoEsperado, service.getValoresSomados(arvoreBinaria));

    }

    @Test
    public void arvoreBinariaComUmNoDeveRetornarValorDaSoma() {

        // Definição
        int retornoEsperado = 15;

        ArvoreBinaria arvoreBinariaDireita = new ArvoreBinaria();
        arvoreBinariaDireita.setValor(8);

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.setValor(7);
        arvoreBinaria.setDireita(arvoreBinariaDireita);


        // Ação
        ArvoreBinariaService service = new ArvoreBinariaService();

        // Resultado
        Assert.assertEquals(retornoEsperado, service.getValoresSomados(arvoreBinaria));

    }

    @Test
    public void arvoreBinariaComDoisNosDeveRetornarValorDaSoma() {

        // Definição
        int retornoEsperado = 30;

        ArvoreBinaria arvoreBinariaDireita = new ArvoreBinaria();
        arvoreBinariaDireita.setValor(8);

        ArvoreBinaria arvoreBinariaEsquerda = new ArvoreBinaria();
        arvoreBinariaEsquerda.setValor(15);

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.setValor(7);
        arvoreBinaria.setDireita(arvoreBinariaDireita);
        arvoreBinaria.setEsquerda(arvoreBinariaEsquerda);


        // Ação
        ArvoreBinariaService service = new ArvoreBinariaService();

        // Resultado
        Assert.assertEquals(retornoEsperado, service.getValoresSomados(arvoreBinaria));

    }
}
