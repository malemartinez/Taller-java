package Electrodomesticos;

public enum EnergyConsume {
    A(100) , B(80), C(60) , D(50) , E(30) , F(10);

    private final int price;
    EnergyConsume(int p ){
        price = p;
    }
    public int getPrice(){
        return price;
    }

}
