package com.lista2.lista1;

import java.util.Scanner;

public class Exo3 {
    public static void resolucao13(){
        double valor,dollar;
        int escolha;

        Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor en R$: ");
		valor = scan.nextDouble();
        dollar = (valor/5.25);
        String dollarformat = String.format("%.2f", dollar);
        String valorformat = String.format("%.2f", valor);

        System.out.print("Digite sua escolha: \n 1-  BRL -> USD \n 2-  R$ -> $ \n ");

        escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                System.out.println(""+valorformat+" BRL" + " igual a "+dollarformat+" USD");
                break;
            case 2:
                System.out.println(" R$"+valorformat+" igual a $" +dollarformat);
                break;   
            default:
                throw new AssertionError();
        }
    }
    
}
