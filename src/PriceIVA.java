import java.util.Scanner;

public class PriceIVA {
    public static void main(String[] args) {
        final Double IVA = 0.21;

        System.out.println("ingrese el precio sin impuestos");
        Scanner reader = new Scanner(System.in);
        Double p = Double.parseDouble(reader.nextLine());
        Double FinalPrice = p + (p  * IVA);
        System.out.println("El precio final es: "+ FinalPrice);
    }
}
