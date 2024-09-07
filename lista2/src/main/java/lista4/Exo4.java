package lista4;

public class Exo4 {

    public static void resolucao44() {

        int[] lista = new int[]{3,5,6,7,8,10,22,55,110};
        int count = 0;

        for (int i = 0; i < lista.length; i++) {

            if(ispar(lista[i])){
                count++;
            }
        }
        
        System.out.println("\tNesta lista temos "+count+" números pares ");

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
