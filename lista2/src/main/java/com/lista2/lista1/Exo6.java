package com.lista2.lista1;

import java.util.Scanner;

public class Exo6 {

     public static void resolucao16(){
        
        double distancia_percorrida,totalcombustivel_gasto,consumo_medio;

		Scanner scan = new Scanner(System.in);
        System.out.print("Digite a distância percorrida em kilomêtro (km): ");
        distancia_percorrida = scan.nextDouble();
        System.out.print("Digite o total gasto em combustível litro (l): ");
        totalcombustivel_gasto = scan.nextDouble();
        consumo_medio=  distancia_percorrida / totalcombustivel_gasto;
        String ditanciapformat = String.format("%.2f", distancia_percorrida);
        String totalcombformat = String.format("%.2f", totalcombustivel_gasto);
        String consmedformat = String.format("%.2f", consumo_medio);
        
		System.out.println("\n\t1- A distância percorrida       -> " +ditanciapformat+ "\tkm. \n\t2- O tatal gasto em combustível -> " +totalcombformat+ "\tl.\n\tO consumo médio deste vehiculo  -> "+consmedformat+"\tkm/l\n");	
    }

}
