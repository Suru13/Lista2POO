
package com.lista2.lista;

import java.util.Scanner;

public class Exo5 {

    public static final String Login = "Admin1";
    public static final String Senha = "Adm123@";

    public static void resolucao25(){
        
        String login, senha;
        boolean acesso_liberado =  false;

        Scanner scan = new Scanner(System.in);


        do {
            System.out.print("Digite seu login: ");
            login = scan.nextLine();
            System.out.print("Digite sua senha: ");
            senha = scan.nextLine();
            if((login.equals(Login)) && (senha.equals(Senha))){

                acesso_liberado = true;

                System.out.println("\n\tAcesso com sucesso!!!\n");

            }
            else if ((login.equals(Login))) {

                System.out.println("\n\tSenha incorreta!!!\n");
                
            } else if (senha.equals(Senha)){

                System.out.println("\n\tLogin incorreta!!!\n");
            } else {
                System.out.println("\n\tLogin e senha incorreta!!!\n");
            }
            
        } while (acesso_liberado != true);

		
    
    }

}
