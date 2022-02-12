package Persona;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese Nombre de la persona");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        System.out.println("Ingrese edad de la persona");
        Scanner reader1 = new Scanner(System.in);
        int age = Integer.parseInt(reader1.nextLine());
        System.out.println("Ingrese sexo de la persona M o H");
        Scanner reader2 = new Scanner(System.in);
        char sex = reader2.nextLine().charAt(0);
        System.out.println(sex);
        System.out.println("Ingrese peso de la persona");
        Scanner reader3 = new Scanner(System.in);
        double weigth = Double.parseDouble(reader3.nextLine());
        System.out.println("Ingrese altura de la persona");
        Scanner reader4 = new Scanner(System.in);
        double height = Double.parseDouble(reader4.nextLine());

        Persona person1 = new Persona(name,age,sex,weigth,height);
        Persona person2 = new Persona(name,age,sex);
        Persona person3 = new Persona();

        //estableciendo los valores faltantes de los objetos
        person2.setPeso(50);
        person2.setAltura(1.65);

        person3.setEdad(25);
        person3.setAltura(1.58);
        person3.setPeso(45);
        person3.setNombre("Alejandra");
        person3.setSexo('M');

        //comprobando peso
        person1.CalcularIMC();
        person2.CalcularIMC();
        person3.CalcularIMC();

        //indicando si es mayor de edad
        person1.esMayorDeEdad();
        person2.esMayorDeEdad();
        person3.esMayorDeEdad();

        //mostrando la info de los objetos
        person1.toString();
        person2.toString();
        person3.toString();


    }
}
