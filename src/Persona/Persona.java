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
    final static String[] letrasDNI = {
            "T", "R", "W","A","G","M","Y","F","P","D","X","B","N","J",
            "Z", "S", "Q","V","H","L","C","K","E"
    };

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
        System.out.println("Tu valor IMC: " + (int) IMC);
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
            return 2;
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
        String mensaje = "Nombre: " + this.nombre +
                "\nEdad: " + this.edad + "\nSexo: " + this.sexo
                + "\nPeso: " + this.peso + "\nAltura: " + this.altura
                + "\nDNI: " + this.DNI;
        System.out.println(mensaje);
        return mensaje;
    }

    //https://www.letranif.com/formula-para-calcular-nif/
    private String generaDNI(){
        //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
        int number = (int) Math.floor((Math.random()*(99999999 - 10000000)+ 10000000)); //numero aleatorio
        int mod = number % 23;
        String letra = letrasDNI[mod];
        return number + "-"+ letra;
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

