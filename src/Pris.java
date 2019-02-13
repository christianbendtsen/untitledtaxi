public class Pris{

    private double sekundPris = 2.25;
    private double freeRide = 0;

    public Pris(double sekundPris){

        this.sekundPris=sekundPris;
    }
    public double udregnPris (long startTime, long endTime ){

        double totalpris = ((endTime - startTime)/1000)*sekundPris;
        return totalpris;

    }

    public double udregnPrisFreeRide (long startTime, long endTime ){

        double totalpris = ((endTime - startTime)/1000)*freeRide;
        return totalpris;

    }
}