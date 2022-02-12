package Persona;

import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese Nombre de la persona");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        System.out.println("Ingrese edad de la persona");
        Scanner reader1 = new Scanner(System.in);
        int age = Integer.parseInt(reader.nextLine());
        System.out.println("Ingrese sexo de la persona M o H");
        Scanner reader2 = new Scanner(System.in);
        char sex = reader2.nextLine().charAt(0);
        System.out.println("Ingrese peso de la persona");
        Scanner reader3 = new Scanner(System.in);
        double weigth = Double.parseDouble(reader.nextLine());
        System.out.println("Ingrese altura de la persona");
        Scanner reader4 = new Scanner(System.in);
        double height = Double.parseDouble(reader.nextLine());

        Persona person1 = new Persona(name,age,sex,weigth,height
        );

    }
}
/*

        Ahora, crea una clase ejecutable que haga lo siguiente:
        •	Pide por teclado el nombre, la edad, sexo, peso y altura.
        •	Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
        •	Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
        •	Indicar para cada objeto si es mayor de edad.
        •	Por último, mostrar la información de cada objeto.*/