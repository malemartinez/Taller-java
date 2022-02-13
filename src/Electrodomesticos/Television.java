package Electrodomesticos;

public class Television extends Electrodomesticos{

    private double resolucion;
    private boolean sintonizadorTDT;

    final double RESOLUCION = 20;
    final boolean SINTONIZADOR = false;

    public Television(int basePrice, AvailableColors color, EnergyConsume energyConsume, double weight, double resolucion, boolean sintonizadorTDT) {
        super(basePrice, color, energyConsume, weight);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(int basePrice, double weight) {
        super(basePrice, weight);
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = SINTONIZADOR;
    }

    public Television() {
        super();
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = SINTONIZADOR;

    }

    //metodos get

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double finalPrice = super.precioFinal();
        if(this.resolucion > 40){
            finalPrice += (finalPrice*0.3) ;
        }
        if(this.sintonizadorTDT){
            finalPrice += 50;
        }
        return finalPrice;
    }
}
