package Persona;

public class Persona {
    private String nombre = "";
    private  int edad = 0;
    private int DNI;
    private char sexo = 'H';
    private double peso, altura = 0;

    final static int BP = -1;
    final static int PI = 0;
    final static int SP = 1;

    public Persona(String nombre, int edad,char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public  Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }
    public Persona(){
        System.out.println("Recuerda ponerle despues nombre a esta persona");
    }

    //metodos
    public int CalcularIMC(){
        double IMC = (this.peso / (Math.pow(this.altura, 2)));
        if(IMC < 20){
            System.out.println("Bajo de peso");
            return BP;
        }else if(IMC >=20 && IMC <= 25){
            System.out.println("peso Ideal");
            return PI;
        }else{
            System.out.println("Sobrepeso");
            return SP;
        }

    }

    public boolean esMayorDeEdad(){
        if(this.edad >= 18){
            System.out.println("Usted es mayor de edad");
            return true;
        }else{
            return  false;
        }
    }

    private void comprobarSexo(char sexo){
        if( sexo != 'H' || sexo != 'M'){
             this.sexo = 'H';
        }
    }
    public String toString(){
        return "";
    }

    private  String generaDNI(){
        String Numbers = "";
        String DIN = "";
        for (int i = 0; i < 8; i++) {
            int number = (int) Math.floor((Math.random()*9));
            DIN = Numbers.concat(String.valueOf(number));
            Numbers = DIN;
            System.out.println(DIN);
        }

        return DIN ;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

