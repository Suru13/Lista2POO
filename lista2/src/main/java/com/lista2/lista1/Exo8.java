package com.lista2.lista1;

import java.util.Scanner;

public class Exo8 {

    public static void resolucao18(){
        
        double graus,fahrenheit;

		Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celcius: ");
        graus = scan.nextDouble();
        fahrenheit = (graus * 1.8) + 32;
        String fahrenheitformat = String.format("%.2f", fahrenheit);
        String grausformat = String.format("%.2f", graus);
        
		System.out.println("\n\tA temperatura de " +grausformat+ "°C (graus Celcius) é igual a " +fahrenheitformat+ "°F (graus Fahrenheit).\n");	
    }

}
