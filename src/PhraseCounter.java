import java.util.Scanner;

public class PhraseCounter {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase linda");
        Scanner reader = new Scanner(System.in);
        String frase = (reader.nextLine());

        //contar la longitud de los caracteres
        System.out.println(frase.length());
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        int espacios = 0;
        for (int index = 0; index < frase.length() ; index++) {
            System.out.println(frase.charAt(index));
            switch (frase.charAt(index)){
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                case ' ':
                    espacios++;


            }

        }
        System.out.println(" Tiene " + a + "vocales a");
        System.out.println(" Tiene " + e + "vocales e");
        System.out.println(" Tiene " + i + "vocales i");
        System.out.println(" Tiene " + o + "vocales o");
        System.out.println(" Tiene " + u + "vocales u");
    }
}
