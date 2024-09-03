package com.lista2.lista1;

import java.util.Scanner;

public class Exo4 {
    public static void resolucao14(){
        int numero1;
		System.out.print("Digite um número: ");
		Scanner scan = new Scanner(System.in);
		numero1 = scan.nextInt();
		System.out.println("\n\tO antecessor do número digitado é -> "+(numero1-1));

		System.out.println("\tO número digitado é               -> "+numero1);

		System.out.println("\tO sucessor do número digitado é   -> "+(numero1 + 1)+"\n");
		
    }
}
