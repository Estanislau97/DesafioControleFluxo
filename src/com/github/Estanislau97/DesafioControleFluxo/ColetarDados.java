package com.github.Estanislau97.DesafioControleFluxo;

public class ColetarDados {
    private int parametroUm;
    private int parametroDois;
    private FunctionAndCalc valorRetornado;
    public Exceptions exceptions;

    public Exceptions getExceptions(){
        return exceptions;
    }

    public void setExceptions(Exceptions exceptions){
        this.exceptions = exceptions;

    }
    public FunctionAndCalc getValorRetornado(){
        return valorRetornado;
    }
    public void setValorRetornado(FunctionAndCalc valorRetornado){

    }
    public int getParametroUm(){
        return  parametroUm;
    }
    public void setParametroUm(int parametroUm){
        this.parametroUm = parametroUm;
    }
    public int getParametroDois(){
        return  parametroDois;
    }
    public void setParametroDois(int parametroDois){
        this.parametroDois = parametroDois;
    }
}
