package com.s2it.avaliacaotecnica.questao8;

import org.junit.Assert;
import org.junit.Test;

public class NumeroTest {

    @Test
    public void testeSeRetornoForMaiorQueMilDeveRetornarMenosUm() {

        // Definição
        int a = 2547;
        int b = 985;
        Integer retornoEsperado = -1;

        // Ação
        Numero numero = new Numero();


        // Resultado
        Assert.assertEquals(retornoEsperado, numero.c(a, b));

    }


    @Test
    public void testPrimeiroNumeroDeADeveSerPrimeiroNumeroDeCPrimeiroNumeroDeBDeveSerSegundoNumeroDeC() {

        // Definição
        Integer a = 5;
        Integer b = 8;
        Integer retornoEsperado = 58;

        // Ação
        Numero numero = new Numero();


        // Resultado
        Assert.assertEquals(retornoEsperado, numero.c(a, b));

    }

    @Test
    public void testPrimeiroNumeroDeADeveSerPrimeiroNumeroDeCPrimeiroNumeroDeBDeveSerSegundoNumeroDeCAssimSucessivamente() {

        // Definição
        Integer a = 843;
        Integer b = 761;
        Integer retornoEsperado = 874631;

        // Ação
        Numero numero = new Numero();


        // Resultado
        Assert.assertEquals(retornoEsperado, numero.c(a, b));

    }

    @Test
    public void testNumerosAouBSejamDiferentesDeveCompletarCComRestanteDosNumerosDoInteiroMaior() {

        // Definição
        Integer a = 1025;
        Integer b = 51;
        Integer retornoEsperado = 150125;

        // Ação
        Numero numero = new Numero();


        // Resultado
        Assert.assertEquals(retornoEsperado, numero.c(a, b));

    }

}
