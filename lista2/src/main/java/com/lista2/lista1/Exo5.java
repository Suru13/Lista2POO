package com.lista2.lista1;

import java.util.Scanner;

public class Exo5 {

    public static void resolucao15(){
        
        double area_do_terreno,valor_do_metro_quadrado,valor_do_terreno;

		Scanner scan = new Scanner(System.in);
        System.out.print("Digite a área do terreno: ");
        area_do_terreno = scan.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        valor_do_metro_quadrado = scan.nextDouble();
        valor_do_terreno = area_do_terreno *valor_do_metro_quadrado;
        String valor_terreno_format = String.format("%.2f", valor_do_terreno);
        String valor_dometroq_format = String.format("%.2f", valor_do_metro_quadrado);
        String area_terreno_format = String.format("%.2f", area_do_terreno);
        
		System.out.println("\n\tA área do terreno é: " +area_terreno_format+ " m2 e o valor do metro quadrado é : R$" +valor_dometroq_format+ "\n\n\tO valor desse terreno é: R$"+valor_terreno_format+"\n");	
    }

}
