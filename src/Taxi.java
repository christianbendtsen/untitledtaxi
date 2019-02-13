import java.util.ArrayList;

public class Taxi {

    public int number;
    long startTime;
    long endTime;
    long executionTime;

    public ArrayList<Taxi> listOfTaxi = new ArrayList<Taxi>();



    public void startTaxi(){


        long startTime = System.currentTimeMillis();
        System.out.println( "Elapsed milliseconds: " + executionTime );


    }

    public void stopTaxi(){
        long endTime = System.currentTimeMillis();
        
        long executionTime = (endTime - startTime)/ 1000; // in seconds

        System.out.println("Elapsed milliseconds: " + executionTime);

    }

    public void pauseTaxi(){


    }

    public void gratisTaxi(){

    }

    public void priser(){
    }

    //public void addTaxi(){
      //  listOfTaxi.add(Taxi);
    //}



    public void addDummyData(){
        listOfTaxi.add(new Taxi(1));
        listOfTaxi.add(new Taxi(2));
        listOfTaxi.add(new Taxi(3));
        listOfTaxi.add(new Taxi(4));
        listOfTaxi.add(new Taxi(5));
        listOfTaxi.add(new Taxi(6));
        listOfTaxi.add(new Taxi(7));
        listOfTaxi.add(new Taxi(8));
        listOfTaxi.add(new Taxi(9));
        listOfTaxi.add(new Taxi(10));
    }

    public Taxi(int number){
        this.number = number;
    }

    public Taxi(){}
}

yoyoyo