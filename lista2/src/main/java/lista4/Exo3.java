package lista4;

import java.util.Scanner;

public class Exo3 {

    public static void resolucao43() {

        int num_vendas_dia;
        boolean fechar = false;
        double total = 0,maior,menor;

        Scanner scan = new Scanner(System.in);

        System.out.println("\tInforme o número de vendas do dia: ");
        num_vendas_dia = scan.nextInt();

        double[] valor = new double[num_vendas_dia];
        
        for(int i = 0 ; i < valor.length ; i++) {

            System.out.print("\tInforme o valor desta venda ou digite 0 para fechar o caixa: ");

            valor[i] = scan.nextInt();

            total+=valor[i];
            
        }
        maior = valor[0];
        menor = valor[0];

        for (int i = 1; i < valor.length; i++) {
            
            if(valor[i] > maior){
                maior = valor[i];
                
            } 
            if (valor[i] < menor){
                menor = valor[i];
            }
        }

        
        String fechamento = String.format("%.2f", total);
        String menorvalor = String.format("%.2f", menor);
        String maiorvalor = String.format("%.2f", maior);

        System.out.println("\tFechamento -> R$"+fechamento+" O menor valor é R$"+menorvalor+" e o maior valor é R$ "+maiorvalor);
        System.out.println("Ticket médio do dia é: "+(total/valor.length));
        
    }

}
