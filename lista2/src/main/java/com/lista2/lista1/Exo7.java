package com.lista2.lista1;

import java.util.Scanner;

public class Exo7 {
       public static void resolucao17(){
        
        String nome_aluno,disciplina;
        //double nota1,nota2,nota3,nota4;
        double[]notas  = new double[4];
        double total_notas=0,media_notas;

		System.out.print("Digite o nome do aluno: ");
		Scanner scan = new Scanner(System.in);
		nome_aluno = scan.nextLine();
        System.out.print("Digite a disciplina do aluno: ");
        disciplina = scan.nextLine();
        
        for(int i=0; i < 4; i++){
            System.out.print("Digite a nota"+(i+1)+" do aluno: ");
            notas[i] = scan.nextDouble();
            total_notas+=notas[i];
        }

        media_notas = total_notas/notas.length;
        String medformat = String.format("%.2f", media_notas);
        

		System.out.println("\t\nA média do aluno cujo nome é: " +nome_aluno+ " na disciplina " +disciplina+ " é -> " +medformat+"\n");
    }

}
