package Inlämningsuppgift;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class loggkklasstest {
    @Test


    public void testCountett(){
        // skapa ett objekt av
        Loggikklass loggik = new Loggikklass();
        // skicka in "hej"
        loggik.ProccerLine("hej");

        //Hämta antalet rader
        int actual = loggik.getAntalRader();
        int expected =1;

        // kontollera att rad = 1
        assertEquals(
                expected,actual, "antalet reder ska vara 1 efter att ha skickat i en rad"
        );


    }
    @Test
    public void testCounttvå() {
        // skapa ett objekt av
        Loggikklass loggik = new Loggikklass();
        // skicka in "hej"
        loggik.ProccerLine("hej");
        loggik.ProccerLine("hejsan");

        //Hämta antalet rader
        int actual = loggik.getAntalRader();
        int expected = 2;

        // kontollera att rad = 1
        assertEquals(
                expected, actual, "antalet reder ska vara 2 efter att ha skickat i en rad"
        );
    }
    @Test
    public void testCounttre() {
        // skapa ett objekt av
        Loggikklass loggik = new Loggikklass();
        // skicka in "hej"
        loggik.ProccerLine("");

        //Hämta antalet rader
        int actual = loggik.getAntalRader();
        int expected = 1;

        // kontollera att rad = 1
        assertEquals(
                expected, actual, "antalet reder ska vara 1 även om en tom"
        );
    }


    }
