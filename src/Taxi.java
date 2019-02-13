import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Taxi {

    public int number;
    private long startTime;
    private long endTime;
    private long executionTime;


    public ArrayList<Taxi> listOfTaxi = new ArrayList<Taxi>();

    public long getStartTime(){

        return startTime;
    }

    public long setStartTime(){

        return startTime = System.currentTimeMillis();

    }

    public long getEndTime(){

        return endTime;
    }

    public long setEndTime(){

        endTime = System.currentTimeMillis();
        return endTime;
    }

    public long getExecutionTime(){

        return executionTime;
    }

    public void setExecutionTime(long startTime, long endTime) {
        executionTime = (endTime-startTime)/1000;
        System.out.println("Elapsed Seconds: " + executionTime);
    }

    public Taxi(long startTime, long endTime){

        this.startTime=startTime;
        this.endTime=endTime;
    }

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

    public Taxi(){

    }
}
