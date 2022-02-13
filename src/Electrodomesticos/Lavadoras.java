package Electrodomesticos;

public class Lavadoras extends Electrodomesticos{
    private int carga;

    final static int CARGA = 5;

    public Lavadoras(double basePrice, AvailableColors color, EnergyConsume energyConsume, double weight, int carga) {
        super(basePrice, color, energyConsume, weight);
        this.carga = carga;
    }

    public Lavadoras(double basePrice, double weight ) {
        super(basePrice, weight);
        this.carga = CARGA;
    }

    public Lavadoras() {
        super();
        this.carga = CARGA;
    }

    public int getCarga() {
        return carga;
    }
    //metodo de precio final

    @Override
    public double precioFinal() {
        double finalPrice = super.precioFinal();
        if (this.carga > 30) {
            finalPrice += 50;
        }
        return  finalPrice;
    }
}
