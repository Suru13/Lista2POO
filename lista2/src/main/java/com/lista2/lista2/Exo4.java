package com.lista2.lista2;

import java.util.Scanner;

public class Exo4 {
    public static void resolucao4(){
        
        String nome, evento;
        int idade;

        Scanner scan = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.print("Digite o evento: ");
        evento = scan.nextLine();
		
        System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
       
        if(idade < 16){
            System.out.println("\t\nvocê tem "+idade+" anos. Você é menor de idade e não pode participar do evento " +evento+"!!!");

        }
        else if (idade >= 16 && idade <=18) {
            System.out.println("\t\nvocê tem "+idade+" anos. Você é menor de idade mas pode participar do evento com um dos seus responsáveis do evento" +evento+"!!");
        }
        else {

            System.out.println("\t\nvocê tem "+idade+" anos. Você é maior de idade então pode participar do evento " +evento+"!");

        }
        
    }

}
