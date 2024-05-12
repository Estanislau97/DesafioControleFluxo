package com.github.Estanislau97.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ColetarDados calc = new ColetarDados();

            System.out.println("informe o primeiro parâmetro: ");
            int numUm = scanner.nextInt();
            calc.setParametroUm(numUm);

            System.out.println("Informe o segundo parâmetro: ");
            int numDois = scanner.nextInt();
            calc.setParametroDois(numDois);

            try{
                FunctionAndCalc.contar(calc);
            }catch (Exceptions e){
                System.out.println(e.getMessage());
            }

        }

    }


