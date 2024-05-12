package com.github.Estanislau97.DesafioControleFluxo;

public class FunctionAndCalc {
    public static int contar(ColetarDados coletarDados) throws Exceptions{
        int numUm = coletarDados.getParametroUm();
        int numDois = coletarDados.getParametroDois();
        if (numUm > numDois){
            throw new Exceptions();
        }
        int cont = numDois - numUm;
        for (int i = 1; i <= cont; i++){
            System.out.println(i);
        }
        return  cont;
    }
}
