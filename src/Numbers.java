import java.util.ArrayList;

public class Numbers {

    static ArrayList<Integer> par = new ArrayList<Integer>();
    static ArrayList<Integer> impar = new ArrayList<Integer>();

    public static void NumberWithFor(){
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                par.add(i);
            }else{
                impar.add(i);
            }
        }
        System.out.println( impar );
        System.out.println( par );
    }

    public static void NumberWithWhile(){
        int contador = 1;
        while( contador <= 100 ){
            if (contador % 2 == 0){
                par.add(contador);
            }else{
                impar.add(contador);
            }
            contador++;
        }
        System.out.println( impar );
        System.out.println( par );
    }

    public static void main(String[] args) {
        Numbers.NumberWithFor();
        //Numbers.NumberWithWhile();
    }
}
