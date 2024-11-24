package Inlämningsuppgift;

public class Loggikklass {
    // Variabler för att lagra statistik
    private int antalRader = 0;
    private int antalTecken = 0;
    private int antalord = 0;
    private String längstaOrd = "";


    //Return true om raden innehåller "stop", annars false

    public boolean ProccerLine(String rad){
        if (rad.equalsIgnoreCase("stop")){
            return true;
        }
        // Räknar hur många antal rader
        antalRader++;
        // Räknar hur många antal ord
        antalTecken+=rad.length();

        // Dela upp raden i ord baserat på mellanslag
        String[] ord =rad.split("\\s+");
        antalord += ord.length;

        //Hitta det längsta ordet

        for (String o :ord){
            if (o.length()> längstaOrd.length()){
                längstaOrd =o;
            }
        }
        return false;

    }
    //Retur antal rader

    public int getAntalRader(){
        return antalRader;
        }

    //Retur antal ord
    public int getAntalord() {
        return antalord;
    }
    //Retur antal tecken
    public int getAntalTecken() {
        return antalTecken;
    }
    //Retur lägsta ordet
    public String getLängstaOrd() {
        return längstaOrd;
    }



}
