import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.Math;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException {




        Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
        System.out.println(p1);
        Pozycja p2 = new Pozycja("Cukier", 3, 4);
        System.out.println(p2);
        Pozycja p3 = new Pozycja("Cukier", 5, 4);
        System.out.println(p3);
        Pozycja p4 = new Pozycja("Pomarancz", 15, 8);
        System.out.println(p4);

        Zamowienie z = new Zamowienie(20);
        z.dodajPozycje(p1);
        z.dodajPozycje(p2);
        z.dodajPozycje(p3);
        z.dodajPozycje(p4);
        z.usunPozycje(0);
        z.edytujPozycje(1);
        System.out.println(z);
        z.zapiszZamowienie(z, "nowy plik.txt");
    }
 }