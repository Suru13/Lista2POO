package com.lista2.lista2;

import java.util.Scanner;

public class Exo7 {

    public static void resolucao7(){
        int numero1,numero2,valor;

        Scanner scan = new Scanner(System.in);

		System.out.print("Digite o numero1: ");
		
		numero1 = scan.nextInt();

		System.out.print("Digite o numero2 (divisor): ");

		numero2 = scan.nextInt();

        valor = (numero1%numero2);

        if(valor == 0){

            System.out.println("\n\tO número " +numero2+ " é um divisor de " +numero1+"\n");
        }
        else{

            System.out.println("\n\tO número " +numero2+ " não é um divisor de " +numero1+"\n");
        }

    }
}
