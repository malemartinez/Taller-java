import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        double n;
        do {
            System.out.println("Ingrese un numero");
            Scanner reader = new Scanner(System.in);
            n = Double.parseDouble(reader.nextLine());

        }while(n < 0);
        System.out.println("El numero ingresado es: "+ n);
    }
}
