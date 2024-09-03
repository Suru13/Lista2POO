
package com.lista2.lista;

import java.util.Scanner;

public class Exo3 {


    public static void resolucao23(){

        int escolha;

        Scanner scan = new Scanner(System.in);


        do {
            System.out.print("\tSeja bem vindo a banco da vida!!! \n\t1- Você tem mais de 65 anos? Se sim digite um (1)\n\t2- Você é deficiente? se sim digite dois (2) \n\t3- Você  é gestante? Se sim digite três (3) \n");
            System.out.print("Informe sua escolha: ");
            escolha = scan.nextInt();
            switch (escolha) {
                case 1:

                    System.out.println("\n\tFila preferencial ");
                      
                    break;

                case 2:

                    System.out.println("\n\tFila preferencial ");
                      
                    break;
                case 3:

                    System.out.println("\n\tFila preferencial ");
                      
                    break;
                
                case 0:
                    break;

                default:
                    System.out.println("\n\tFila commum ");
                    break;
            }

        } while ((escolha!=0));
   
    }

}
