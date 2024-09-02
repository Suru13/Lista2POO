
package com.lista2.lista2;

import java.util.Scanner;

public class Exo5 {

    public static final String Login = "Admin1";
    public static final String Senha = "Adm123@";

    public static void resolucao5(){
        
        String login, senha;

        Scanner scan = new Scanner(System.in);

		System.out.print("Digite seu login: ");
        login = scan.nextLine();
        System.out.print("Digite sua senha: ");
        senha = scan.nextLine();
        if((login.equals(Login))&& (senha.equals(Senha))){

            System.out.println("\tAcesso com sucesso!!!\n");

        }
        else if ((login.equals(Login)) && !(senha.equals(Senha))) {

            System.out.println("\tSenha incorreta!!!\n");
            
        }else{

            System.out.println("\tLogin incorreta!!!\n");
        }
    
    }

}
