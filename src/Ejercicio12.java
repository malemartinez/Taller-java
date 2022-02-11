import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        //int a = 50;
        //int b = 50;
        System.out.println("ingrese el numero 1 a comparar");
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        System.out.println("ingrese el numero 2 a comparar");
        Scanner reader2 = new Scanner(System.in);
        int b = reader2.nextInt();

        if(a>b){
            System.out.println("numero mayor: "+ a);
        }else if(a<b){
            System.out.println("numero mayor: "+ b);
        }else{
            System.out.println("Ambos numeros son iguales");
        }
    }
}
