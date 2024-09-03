package com.lista2.lista1;

import java.util.Scanner;

public class Exo1 {
    public static void resolucao11(){
        int numero1;
		int numero2;
		System.out.print("Digite o numero1: \n");
		Scanner scan = new Scanner(System.in);
		numero1 = scan.nextInt();
		System.out.print("O primeiro número é: "+numero1+"\n");

		System.out.print("Digite o numero2: \n");
		numero2 = scan.nextInt();
		System.out.print("O primeiro número é: "+numero2+"\n");

		System.out.print("A soma é : "+(numero1 + numero2)+"\n");
		
    }

}
