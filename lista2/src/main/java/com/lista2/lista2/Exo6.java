package com.lista2.lista2;

import java.util.Scanner;

public class Exo6 {

    public static void resolucao6(){
        
        String nome_aluno,disciplina;
        //double nota1,nota2,nota3,nota4;
        double[]notas  = new double[2];
        double total_notas = 0;

		System.out.print("Digite o nome do aluno: ");
		Scanner scan = new Scanner(System.in);
		nome_aluno = scan.nextLine();
        System.out.print("Digite a disciplina do aluno: ");
        disciplina = scan.nextLine();

        for(int i = 0; i < notas.length; i++){
            System.out.print("Digite a nota da P"+(i+1)+" do aluno: ");
            notas[i] = scan.nextDouble();
            total_notas+=notas[i];
        }

        double media = total_notas/notas.length;

        if(media < 6){
            double nota_recp,maior_nota;
            System.out.print("Digite sua nota de recuoeração do aluno: ");
            nota_recp = scan.nextDouble();
            if(notas[0]< notas[1]){
                maior_nota = notas[1];
            }
            else {
                maior_nota = notas[0];
            }

            double nova_media = (maior_nota + nota_recp)/notas.length;
            System.out.println("\n\tA média do aluno: " +nome_aluno+ " " +disciplina+ " é -> " +(nova_media)+"\n");
        }
        else{
            System.out.println("\n\tA média do aluno: " +nome_aluno+ " " +disciplina+ " é -> " +(media)+" \n\tAluno aprovado!!!\n");
        }
		
    }

}
