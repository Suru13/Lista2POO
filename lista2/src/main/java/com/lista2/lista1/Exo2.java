package com.lista2.lista1;

import java.util.Scanner;

public class Exo2 {

    public static void resolucao12(){
        
        String nome,sobrenome;

		System.out.print("Digite seu nome: ");
		Scanner scan = new Scanner(System.in);
		nome = scan.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = scan.nextLine();
        System.out.println(" Olá, " +nome+ " " +sobrenome+ ".");
    }

}
