import java.util.Scanner;

public class ComparePhrases {

    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner reader = new Scanner(System.in);
        String frase1 = reader.nextLine();

        System.out.println("Ingrese otra frase");
        Scanner reader1 = new Scanner(System.in);
        String frase2 = reader1.nextLine();

        //comparar las frases y si no son iguales mostrar sus diferencias

        boolean diferentes = false;
        int mayorFrase = (frase1.length() > frase2.length())? frase2.length():frase1.length();
        for (int i = 0; i < mayorFrase ; i++) {
            char caracter1 = frase1.charAt (i);
            char caracter2 = frase2.charAt (i);

            if(caracter1 != caracter2){
                diferentes = true;
                System.out.println("caracterer diferente frase 1: "+ caracter1 + " "+  "caracterer diferente frase 2: "+ caracter2);
            }
        }
        if(diferentes){
            System.out.println("son diferentes");
        }else{
            System.out.println("son iguales");
        }



    }
}
