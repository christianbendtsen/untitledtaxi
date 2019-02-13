import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu {


    public void startmenu() {

        Taxi taxi = new Taxi();
        long start;
        long slut;
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to Damn Fast Taxis\n" +
                    "(1) Start a taxi\n" +
                    "(2) Stop a taxi\n" +
                    "(3) Pause a ride\n" +
                    "(4) Ask for price\n" +
                    "(5) Free ride\n" +
                    "(6) Exit\n" +
                    "Choose a <number> and hit “enter”:");


            //switch case til at sende bruger videre til ønsket platform i programmet

            int in = scanner.nextInt();

            switch (in) {

                case 1:
                    taxi.setStartTime();
                    //taxi.startTaxi();
                case 2:
                    taxi.setEndTime();
                    taxi.setExecutionTime(taxi.getStartTime(), taxi.getEndTime());
                    System.out.println("Damn Fast Taxi");
                    System.out.println("--------------");
                    System.out.println("Time: " + decimalFormat.format(((taxi.setExecutionTime(taxi.getStartTime(), taxi.getEndTime())/100)*0.1)) + " seconds");
                    Pris pris = new Pris(2.25);
                    System.out.println("Price per. second: 2.25 dollars");
                    System.out.println("Total price " + pris.udregnPris(taxi.getStartTime(), taxi.getEndTime()) + " dollars\n");//taxi.stopTaxi();
                    break;
                case 3:
                    break;
                case 4:
                    taxi.priser();
                    break;
                case 5:
                    taxi.setEndTime();
                    taxi.setExecutionTime(taxi.getStartTime(), taxi.getEndTime());
                    System.out.println("Damn Fast Taxi");
                    System.out.println("--------------");
                    System.out.println("Time: " + decimalFormat.format(((taxi.setExecutionTime(taxi.getStartTime(), taxi.getEndTime())/100)*0.1)) + " seconds");
                    Pris pris2 = new Pris(0);
                    System.out.println("Price per. second: 0 dollars");
                    System.out.println("Total price " + pris2.udregnPrisFreeRide(taxi.getStartTime(), taxi.getEndTime()) + " dollars\n");//taxi.stopTaxi();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Vi forstår ikke dit ønske. Prøv venlgist igen"); //Hvis brugeren trykker et invalidt nummer ind, vil startMenu starte forfra igen
                    break;
        }
    }


    }
}
