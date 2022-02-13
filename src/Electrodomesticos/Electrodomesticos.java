package Electrodomesticos;
import static Electrodomesticos.EnergyConsume.*;

import static Electrodomesticos.AvailableColors.*;

public class Electrodomesticos {

    protected double BasePrice;
    protected String color;
    protected char energyConsume;
    protected double weight;

    static final AvailableColors COLOR= blanco;
    static final EnergyConsume ENERGYCONSUME= F ;
    static final double BASEPRICE= 100;
    static final double WEIGHT= 5;

    public Electrodomesticos(double basePrice, AvailableColors color, EnergyConsume energyConsume, double weight) {
        this.BasePrice = basePrice;
        this.color = this.comprobarColor(color);
        this.energyConsume = this.comprobarConsumoEnergetico(energyConsume);
        this.weight = weight;
    }

    public Electrodomesticos(double basePrice, double weight ){
        this.BasePrice = basePrice;
        this.weight = weight;
        this.color = String.valueOf(COLOR);
        this.energyConsume = String.valueOf(ENERGYCONSUME).charAt(0);
    }
    public Electrodomesticos(){
        this.BasePrice = BASEPRICE;
        this.color = String.valueOf(COLOR);
        this.energyConsume = String.valueOf(ENERGYCONSUME).charAt(0);
        this.weight = WEIGHT;
    }
    //metodos get de todos los atributos
    public double getBasePrice() {
        return BasePrice;
    }

    public String getColor() {
        return color;
    }

    public char getEnergyConsume() {
        return energyConsume;
    }

    public double getWeight() {
        return weight;
    }
    //metodos comprobadores
    private char comprobarConsumoEnergetico( EnergyConsume l){
        char letra = '0';
        for ( EnergyConsume consume: EnergyConsume.values()) {
            if ( l == consume){
                letra = String.valueOf(consume).charAt(0);
            }
        }
        return letra;
    }
    private String comprobarColor(AvailableColors c){
        String colorFinal = "";
        for ( AvailableColors color : AvailableColors.values()) {
            if( c == color){
                colorFinal = String.valueOf(color);
            }else {
                colorFinal = String.valueOf(COLOR);
            }
        }
        return colorFinal;
    }

    public double precioFinal(){
       EnergyConsume letra =EnergyConsume.valueOf (String.valueOf((this.energyConsume)));
       double precio = letra.getPrice();
       double precioFinal = 0;
       if(this.weight <= 19){
           precioFinal = precio + this.BasePrice + 10;
       }else if(this.weight >= 20 && this.weight <= 49 ){
           precioFinal = precio + this.BasePrice + 50;
       }else if(this.weight >= 50 && this.weight <= 79 ){
           precioFinal = precio + this.BasePrice + 80;
       }else if(this.weight >= 80){
           precioFinal = precio + this.BasePrice + 100;
       }
       return precioFinal ;
    }



}
