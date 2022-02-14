import java.util.Scanner;

public class DiasDeLaSemana {

    public static void main(String[] args) {
        System.out.println("Ingrese el dia de la semana en que estas");

        Scanner reader = new Scanner(System.in);
        String diaIngresado = reader.nextLine().toLowerCase();

        switch (diaIngresado){
            case "lunes":
                System.out.println("día laboral");
                break;
            case "martes":
                System.out.println("dia laboral");
                break;
            case "miercoles":
                System.out.println("dia laboral");
                break;
            case "jueves":
                System.out.println("día laboral");
                break;
            case "viernes":
                System.out.println("día laboral");
                break;
            case "sabado":
                System.out.println("Descansa baby!! No es un día laboral");
                break;
            case "domingo":
                System.out.println("!Hoy tambien puedes descansar! No es un día laboral");
                break;
        }

    }
}

