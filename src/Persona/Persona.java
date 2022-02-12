package Persona;

public class Persona {
    private String nombre = "";
    private  int edad = 0;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    final static int BP = -1;
    final static int PI = 0;
    final static int SP = 1;

    public Persona(String nombre, int edad,char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = this.comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.DNI = this.generaDNI();
    }
    public  Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = this.comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
        this.DNI = this.generaDNI();

    }
    public Persona(){
        this.DNI = this.generaDNI();
    }

    //metodos
    public int CalcularIMC() {
        double IMC = (this.peso / (Math.pow(this.altura, 2)));
        if (IMC < 20) {
            System.out.println("Bajo de peso");
            return BP;
        } else if (IMC >= 20 && IMC <= 25) {
            System.out.println("peso Ideal");
            return PI;
        } else if (IMC > 25) {
            System.out.println("Sobrepeso");
            return SP;
        }else {
            System.out.println("No hay datos para sacar el IMC");
            return 0;
        }

    }



    public boolean esMayorDeEdad(){
        if(this.edad >= 18){
            System.out.println("Usted es mayor de edad");
            return true;
        }else{
            System.out.println("Estas muy chiquis aun");
            return  false;
        }
    }

    private char comprobarSexo(char sexo){
        switch (sexo){
            case 'M':
                return 'M';
            default: return 'H';
        }
    }
    public String toString(){
        String mensaje = "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nSexo: " + this.sexo + "\nPeso: " + this.peso + "\nAltura: " + this.altura + "\nDNI: " + this.DNI;
        System.out.println(mensaje);
        return mensaje;
    }

    private String generaDNI(){
        String Numbers = "";
        String DIN = "";
        for (int i = 0; i < 8; i++) {
            int number = (int) Math.floor((Math.random()*9)); //numero aleatorio
            char number1 = (char) (number + 65); //lo paso a char
            DIN = Numbers.concat(Character.toString(number1)); //lo concateno en otra variable
            Numbers = DIN;
        }
        return DIN;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = this.comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

