package com.s2it.avaliacaotecnica.questao8;

import lombok.Data;

@Data
public class Numero {


    public Integer c (int a, int b){

        char[] arrayA = String.valueOf(a).toCharArray();
        char[] arrayB = String.valueOf(b).toCharArray();

        int total = arrayA.length + arrayB.length;

        int retorno = -1;

        if(total < 7){
            retorno = montarSequencia(arrayA, arrayB, total);
        }

        return retorno;
    }

    private int montarSequencia(char[] arrayA, char[] arrayB, int total) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < total ; i++){
            if(arrayA.length > i){
                sb.append(arrayA[i]);
            }

            if(arrayB.length > i){
                sb.append(arrayB[i]);
            }
        }

        return Integer.parseInt(sb.toString());
    }

}
