package Electrodomesticos;
import static Electrodomesticos.AvailableColors.*;
import static Electrodomesticos.EnergyConsume.*;

public class Main {

    public static void main(String[] args) {
        Electrodomesticos[] arrayElectrodomesticos = new Electrodomesticos[10];
        arrayElectrodomesticos[0] = new Lavadoras( 120, gris, C, 100, 10);
        arrayElectrodomesticos[1] = new Television();
        arrayElectrodomesticos[2] = new Electrodomesticos();
        arrayElectrodomesticos[3] = new Lavadoras( 200, 50 );
        arrayElectrodomesticos[4] = new Television( 100, rojo, B, 10, 30, true);
        arrayElectrodomesticos[5] = new Lavadoras();
        arrayElectrodomesticos[6] = new Television( 180, azul, E, 25 , 40, false );
        arrayElectrodomesticos[7] = new Electrodomesticos( 250, negro, D, 20 );
        arrayElectrodomesticos[8] = new Television( 200, 15 );
        arrayElectrodomesticos[9] = new Lavadoras();

        double priceWasher = 0;
        double priceTV = 0;
        double priceElectro =0;
        for ( Electrodomesticos element: arrayElectrodomesticos  ) {
            System.out.println(element.precioFinal());

            priceElectro += element.precioFinal();

            if( element instanceof  Lavadoras ){
                priceWasher += element.precioFinal();

            }else if(element instanceof  Television ){
                priceTV += element.precioFinal();
            }
        }
        //mostrar el precio de cada clase
        System.out.println(" El precio total de todas las lavadoras es: " + priceWasher);
        System.out.println(" El precio total de todos los TV es: " + priceTV);
        System.out.println(" El precio total de todos los Electrodomesticos es: " + priceElectro);



    }
}
