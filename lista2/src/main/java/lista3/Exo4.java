package lista3;

import java.util.Scanner;

public class Exo4 {

    public static void resolucao34(){

        int escolha, advinha;
    

        Scanner scan = new Scanner(System.in);

        System.out.println("\n\t Jogo da advinhação!!!\n");

        System.out.println("O jogador 1 pode escolher um número para iniciar o jogo   ");
        escolha = scan.nextInt();


        do {
            System.out.println("O jogador 2 pode digitar  um número para advinhar   ");
            advinha = scan.nextInt();
            double razao = advinha/(escolha*1.0);
            if(razao == 1){
                System.out.println("\tParabéns!!! Acertou!\n");
            } else if ((razao <= 0.9999) && (razao >= 0.8)){
                System.out.println("\tTá frio!!\n");
            } else if ((razao <= 1.2) && (razao >= 1.0001)){
                System.out.println("\tTá quente!!\n");
            } else if ((razao < 0.8) && (razao >= 0.6)){
                System.out.println("\tQuase lá!!\n");
            } else if ((razao < 1.2) && (razao >= 1.4)){
                System.out.println("\tQuase lá!!\n");
            } else if ( (razao > 1.4)){
                System.out.println("\tMuito alto!\n");
            }else {
                System.out.println("\t\nMuito baixo!!");
            }
            
        } while (advinha!=escolha);

    }


}
