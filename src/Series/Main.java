package Series;

public class Main {

    public static void main(String[] args) {

        Series[ ] ArraySeries = new Series[5];
        VideoJuegos[ ] ArrayVideoJuegos = new VideoJuegos[5];

        ArraySeries[0]= new Series();
        ArraySeries[1]= new Series();
        ArraySeries[2]= new Series();
        ArraySeries[3]= new Series();
        ArraySeries[4]= new Series();

        ArrayVideoJuegos[0]= new VideoJuegos();
        ArrayVideoJuegos[1]= new VideoJuegos();
        ArrayVideoJuegos[2]= new VideoJuegos();
        ArrayVideoJuegos[3]= new VideoJuegos();
        ArrayVideoJuegos[4]= new VideoJuegos();

        ArraySeries[2].entregar();
        ArraySeries[4].entregar();
        ArrayVideoJuegos[0].entregar();
        ArrayVideoJuegos[3].entregar();

        int numberSeries = 0;
        int numberJuegos = 0;

        for (int i = 0; i < ArraySeries.length; i++) {
            if (ArraySeries[i].isEntregable()){
                numberSeries ++;
                System.out.println(ArraySeries[i]);
            }if(ArrayVideoJuegos[i].isEntregable()){
                numberJuegos++;
                System.out.println(ArrayVideoJuegos[i]);
            }

        }
        System.out.println("El numero de Series entregadas es: " + numberSeries);
        System.out.println("El numero de VideoJuegos entregadas es: " + numberJuegos);

    }
}
