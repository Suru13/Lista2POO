
package lista3;

import java.util.Scanner;

public class Exo7 {

    public static void resolucao37() {

        Scanner scan = new Scanner(System.in);

        int altura,largura;
        boolean isrectangle;
        System.out.print("\n\tInforme a altura do retangulo: ");
        altura = scan.nextInt();
        System.out.print("\n\tInforme a largura do retangulo: ");
        largura = scan.nextInt();

        isrectangle = (altura==largura);

        if (isrectangle) {

            System.out.println("\n\tA largura e a altura são iguais isso é um quadrado. Não vou consiguir construir um retângulo :):):)\n");
            return;

        } else {

            System.out.println("\n\tVamos construir seu retangulo de largura: "+largura+" e de altura: "+altura+"\n");

            for (int i = 0; i < altura; i++) {

                for (int j = 0; j < largura; j++) {
                    
                    System.out.print("*");
                }
                System.out.println();
            }

        }
  
    }

}
