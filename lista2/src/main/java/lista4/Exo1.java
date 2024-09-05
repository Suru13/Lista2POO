
package lista4;

import java.util.Scanner;

public class Exo1 {

    public static void resolucao41() {

        int num_vendas_dia;
        boolean fechar = false;
        double total = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("\tInforme o número de vendas do dia: ");
        num_vendas_dia = scan.nextInt();

        double[] valor = new double[num_vendas_dia];
        
        for(int i = 0 ; i < valor.length ; i++) {

            System.out.print("Informe o valor desta venda ou digite 0 para fechar o caixa: ");

            valor[i] = scan.nextInt();
            
            total+=valor[i];
            
        }
        String fechamento = String.format("%.2f", total);

        System.out.println("\tFechamento -> R$"+fechamento);
        
    }

}
