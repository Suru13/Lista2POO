package lista3;


import java.util.Scanner;

public class Exo1 {


    public static void resolucao31(){

        int segundos;
        boolean seg;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número de segundos entre 1 e 59 por favor:  ");
        segundos = scan.nextInt();

        seg = (segundos < 1 || segundos > 59);//segundos recebe true ou false

        if(seg == true){

             System.out.println("\tErro ao digitar um número fora do escopo dos segundos!!!\n\tInforme por favor um número entre 1 e 59.");

        }
        else{

            for (int i = 1; i <= segundos; i++) {

                try {
                    Thread.sleep(1000); // Aguarda 1 segundo
                    
                    System.out.println("\tSegundos: " + i);
            
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
            }
            System.out.println("\tAcabou o tempo!!!!");
        }

           
    }

}

