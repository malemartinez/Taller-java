import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        System.out.println("ingrese el radio del circulo");
        Scanner reader = new Scanner(System.in);
        Double r = Double.parseDouble(reader.nextLine());
        double area = Math.pow(r, 2)  * (Math.PI);
        System.out.println("Area del circulo: " + area);
    }
}
