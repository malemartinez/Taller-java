import java.util.Scanner;

public class LettersCounter {
    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza ";
        String frase1 = frase.replaceAll("a", "e");
        System.out.println(frase1);

        System.out.println("Ingrese una frase adicional a la siguente: " + frase);
        Scanner reader = new Scanner(System.in);
        String frase2 = reader.nextLine();
        String nuevaFrase = frase.concat(frase2);
        System.out.println(nuevaFrase);
    }
}
