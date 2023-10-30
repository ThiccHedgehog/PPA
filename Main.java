import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.Math;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


       /* Kapibara kapibara = new Kapibara("ssak", "Feluś", "5");
                Dziobak dziobak = new Dziobak("ssak", "Staś", "7");
                Pies pies = new Pies("ssak", "Antek", "8");
                Kot kot = new Kot("ssak", "Filemon", "6");

                for(Zwierzęta zwierzęta: Zwierzęta.Lista){
                System.out.println(zwierzęta);
                zwierzęta.makeNoise();
                zwierzęta.test();
                }*/

public class Main {
    public static void main(String[] args) throws IOException {




        Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
        System.out.println(p1);
        Pozycja p2 = new Pozycja("Cukier", 3, 4);
        System.out.println(p2);
        Pozycja p3 = new Pozycja("Cukier", 5, 4);
        System.out.println(p3);
        Pozycja p4 = new Pozycja("Pomarańcz", 15, 8);
        System.out.println(p4);

        Zamowienie z = new Zamowienie(20);
        z.dodajPozycje(p1);
        z.dodajPozycje(p2);
        z.dodajPozycje(p3);
        z.dodajPozycje(p4);
        //z.usunPozycje(0);
        //z.edytujPozycje(1);
        System.out.println(z);


        try {
            Zamowienie.zapiszZamowienie(z, "testy");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 }