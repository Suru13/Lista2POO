
package com.lista2.lista2;

import java.util.Scanner;


public class Exo2 {
    
    public static void resolucao2(){
        int numero1;
		int numero2;
		System.out.print("Digite o numero1: ");
		Scanner scan = new Scanner(System.in);
		numero1 = scan.nextInt();

		System.out.print("Digite o numero2: ");
		numero2 = scan.nextInt();
        if(numero1 < numero2 ){

            System.out.print("O maior é: "+numero2+"\n");

        }
        else{

            System.out.print("O maior é  : "+numero1+"\n");

        }
		

		
		

    }



}
