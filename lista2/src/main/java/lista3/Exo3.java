package lista3;

import java.util.Scanner;

public class Exo3 {

    public static void resolucao33(){

        int num1,num2,menor,maior;

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        num1 = scan.nextInt();
        System.out.print("Informe o segundo número: ");
        num2 = scan.nextInt();
        if(num1<num2){
            menor = num1;
            maior = num2;
        }
        else{
            menor = num2;
            maior = num1;
        }
        System.out.println("\tOs números pares entre "+menor+" e "+maior+" são:");
        for (int i = menor; i <= maior ; i++) {

            if(ispar(i)){
                System.out.print("\t"+i);
            }
        }
        /*
        tentando uma outra forma

        if(ispar(menor)){
            for (int i = menor ; i<=mior ; i+=2){
                System.out.print("\t"+i);
            }
        }
         */
    }

    public static boolean ispar(int numero){

        if(numero%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
