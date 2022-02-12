import java.util.Scanner;

public class NumbersTwoToTwo {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner reader = new Scanner(System.in);
        int n  = Integer.parseInt(reader.nextLine());
        for ( int i = n; i <= 1000; i++) {
            if( i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
