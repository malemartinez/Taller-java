import java.util.Scanner;

public class MenuCine {
    public static void main(String[] args) {
        System.out.println("Menú de gestión cinemátográfica");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. NUEVO ACTOR");
            System.out.println("2. BUSCAR ACTOR");
            System.out.println("3. ELIMINAR ACTOR");
            System.out.println("4. MODIFICAR ACTOR");
            System.out.println("5. VER TODOS LOS ACTORES");
            System.out.println("6. VER PELICULAS DE LOS ACTORES");
            System.out.println("7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8. Salir");


            Scanner reader = new Scanner(System.in);
            response = Integer.valueOf(reader.nextLine());

            switch (response){
                case 1:
                    System.out.println("Ingresar nuevo actor");
                    break;
                case 2:
                    System.out.println("Buscar actor");
                    break;
                case 3:
                    System.out.println("Eliminando un actor");
                    break;
                case 4:
                    System.out.println("Modificando actor");
                    break;
                case 5:
                    System.out.println("Lista de actores");
                    break;
                case 6:
                    System.out.println("Peliculas de actores");
                    break;
                case 7:
                    System.out.println("Categorias");
                    break;
                case 8:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("¡Opción incorrecta! : Vuelve a intentarlo");
            }
        }while (response != 8);
    }
}
