package Series;

public class Main {

    public static void main(String[] args) {

        Series[ ] ArraySeries = new Series[5];
        VideoJuegos[ ] ArrayVideoJuegos = new VideoJuegos[5];

        ArraySeries[0]= new Series( "HSM", 10,"infantil","Kenny Ortega" );
        ArraySeries[1]= new Series(" PLL ", 7, "suspenso", "Jenny Graves");
        ArraySeries[2]= new Series("TVD", 8,"ficcion", "July Pec");
        ArraySeries[3]= new Series("Legacies", 4, "ficcion", "July Pec");
        ArraySeries[4]= new Series("TO", 12, "Vampiros", "Ni me acuerdo");

        ArrayVideoJuegos[0]= new VideoJuegos("LOL", 50,"Historico", "Nintendo" );
        ArrayVideoJuegos[1]= new VideoJuegos("Cars", 20);
        ArrayVideoJuegos[2]= new VideoJuegos(" Mario Bros", 55, "infantil", "nintendo");
        ArrayVideoJuegos[3]= new VideoJuegos("Crash", 60);
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


        //contar quien tiene mas horas estimadas y temporadas
        Series mayorTemporadas = new Series();
        VideoJuegos mayorHoras = new VideoJuegos();
        for (int i = 0; i < ArraySeries.length ; i++) {
            if(ArraySeries[i].compareTo( mayorTemporadas )){
                mayorTemporadas = ArraySeries[i];
            }
        }
        System.out.println(mayorTemporadas.toString());

        for (int i = 0; i <  ArrayVideoJuegos.length ; i++) {
            if( ArrayVideoJuegos[i].compareTo( mayorHoras )){
                mayorHoras = ArrayVideoJuegos[i];
            }
        }
        System.out.println(mayorHoras.toString());


    }
}
