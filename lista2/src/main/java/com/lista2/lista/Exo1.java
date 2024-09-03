
package com.lista2.lista;

import java.util.Scanner;

public class Exo1 {

    public static void resolucao21(){
        int num,num2;
		System.out.print("Digite um numéro: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

        num2= num %2;

        if(num == 0){
            System.out.print("0\n");
            System.exit(0);
        } 
        if(num2 != 0){
            System.out.print("O número inserido "+num+" é impar!!!\n");

        } else{
            System.out.print("O número inserido "+num+" é par!!\n");
        }
        
    }

}
