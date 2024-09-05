package lista3;

import java.util.Scanner;

public class Exo5 {

    
    public static final String Login = "Admin1";
    public static final String Senha = "Adm123@";
    public static final int tentativas_max = 3;

    public static void resolucao35() {

        String login, senha;

        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < tentativas_max; i++) {

            System.out.print("Digite seu login: ");
            login = scan.nextLine();
            System.out.print("Digite sua senha: ");
            senha = scan.nextLine();
            if((login.equals(Login)) && (senha.equals(Senha))){

                System.out.println("\n\tAcesso com sucesso!!!\n");

            }
              else if ((login.equals(Login))) {

                System.out.println("\n\tSenha incorreta!!!\n");
                
            } else if (senha.equals(Senha)) {

                System.out.println("\n\tLogin incorreta!!!\n");
            } else{

                System.out.println("\n\tLogin e senha incorreta!!!\n");
            }

            if(i==1){
                System.out.println("\n\tÚltima tentativa, mais um erro e seu acesso será bloqueado!");
            }
            if(i==2){
                System.out.println("\n\tAcesso bloqueado após 3 tentativas!!!");
            }
              
        }

        
    }

}
