
package lista3;

import java.util.Scanner;

public class Exo6 {

    public static void resolucao36() {

        Scanner scan = new Scanner(System.in);

        int andar;
        System.out.print("\t\nInforme o número de andadres: ");
        andar = scan.nextInt();

        for (int i = 1; i <= andar; i++) {

            for (int j = 0; j < andar-i; j++) {
                System.out.print(" ");
                
            }

            for (int k = 0; k < ((2*i)-1); k++){
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}
