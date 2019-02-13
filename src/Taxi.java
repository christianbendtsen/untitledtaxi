import java.util.ArrayList;

public class Taxi {

    public int number;
    public boolean inUse = false;
    long startTime;
    long endTime;
    long executionTime;




    public void startTaxi(){

        if (getListOfTaxi().size()>=1){
            long startTime = System.currentTimeMillis();
            System.out.println( "Elapsed milliseconds: " + executionTime );
        }

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



    public Taxi(){}
}

