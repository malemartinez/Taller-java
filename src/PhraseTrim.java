import java.util.Scanner;

public class PhraseTrim {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase linda");
        Scanner reader = new Scanner(System.in);
        String frase = (reader.nextLine());
        String Frase1 = frase.replaceAll(" ","");
        System.out.println(Frase1);
    }
}
