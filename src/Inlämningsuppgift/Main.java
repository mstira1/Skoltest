package Inlämningsuppgift;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loggikklass stats = new Loggikklass();

        System.out.println("Ange text rad för rad . Skriv 'stop' för att avsluta.");

        while (true){
            String input = scanner.nextLine();

            // om användaren skriver "Stop eller stop, avsluta loopen

            if (stats.ProccerLine(input)){
                break;
            }

        }
        System.out.println(stats.getAntalRader()+ " = Antal rader");
        System.out.println(stats.getAntalTecken()+ " = Antal tecken");
        System.out.println(stats.getAntalord()+ " = Antal ord") ;
        System.out.println(stats.getLängstaOrd()+ " = Längsta ordet");

    }
}
