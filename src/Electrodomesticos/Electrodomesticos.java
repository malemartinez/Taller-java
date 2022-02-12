package Electrodomesticos;


public class Electrodomesticos {
    protected double BasePrice;
    protected String color;
    protected char energyConsume;
    protected double weight;

    static final AvailableColors COLOR= AvailableColors.blanco;
    static final char ENERGYCONSUME= 'F';
    static final double BASEPRICE= 100;
    static final double WEIGTH= 5;

    public Electrodomesticos(double basePrice, AvailableColors color, char energyConsume, double weight) {
        this.BasePrice = basePrice;
        this.color = this.comprobarColor(color);
        this.energyConsume = this.comprobarConsumoEnergetico(energyConsume);
        this.weight = weight;
    }

    public Electrodomesticos(double basePrice, double weight ){
        this.BasePrice = basePrice;
        this.weight = weight;
        this.color = String.valueOf(COLOR);
        this.energyConsume = ENERGYCONSUME;
    }
    public Electrodomesticos(){
        this.BasePrice = BASEPRICE;
        this.color = String.valueOf(COLOR);
        this.energyConsume = ENERGYCONSUME;
        this.weight = WEIGTH;
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
    /*private char comprobarConsumoEnergetico( char l){
        if (l == 'A' || l== 'B' || l== 'C' || l== 'D' || l== 'E'){
            return l;
        }else {
            return ENERGYCONSUME;
        }
    }*/
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

    public precioFinal(){

    }



}
