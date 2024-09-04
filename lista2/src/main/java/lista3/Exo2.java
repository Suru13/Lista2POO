package lista3;

import java.util.Scanner;

public class Exo2 {


    public static void resolucao32(){

        int numtab;

        Scanner scan = new Scanner(System.in);
    
        System.out.print("Informe o número da tabuada por favor: ");
        numtab = scan.nextInt();

        System.out.println("\n\tTabuada de "+numtab+"\n");

        for(int i = 0; i <= 12;i++){

            System.out.println("\t" +i+ "  x  "+numtab+"  =  "+(numtab*i));
        }
    }

}
