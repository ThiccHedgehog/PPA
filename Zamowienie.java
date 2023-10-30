import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zamowienie implements Serializable {

    public static List<Pozycja> pozycje = new ArrayList<Pozycja>();

    int ileDodanych;
    int maksRozmiar;


    public Zamowienie() {
        maksRozmiar = 10;
    }

    public Zamowienie(int maksRozmiar) {

    }

    public void dodajPozycje(Pozycja p) {
        boolean istnieje = false;

        for (Pozycja existing : pozycje) {
            if (existing.getNazwaTowaru().equals(p.getNazwaTowaru())) {
                existing.setIleSztuk(existing.getIleSztuk() + p.getIleSztuk());
                istnieje = true;
                break;
            }
        }

        if (!istnieje) {
            pozycje.add(p);
        }
    }


    public double obliczSumęCen() {
        double suma = 0;
        for (Pozycja pozycja : pozycje) {
            suma += pozycja.obliczWartosc();
        }
        return suma;
    }



    public double obliczSumęCenZRabatem() {
        double suma_z_rabatem = 0;
        for (Pozycja pozycja : pozycje) {
            suma_z_rabatem += pozycja.obliczWartoscZRabatem();
        }
        return suma_z_rabatem;
    }

    public double ileRabatu(){
        double rabat = 0;
        rabat = obliczSumęCen() - obliczSumęCenZRabatem();
        return rabat;
    }

public void usunPozycje(int p){
        pozycje.remove(p);
}

    public void edytujPozycje(int index) {
        if (index >= 0 && index < pozycje.size()) {
            System.out.println("Co chcesz");
            System.out.println("1 Zmiana nazwy");
            System.out.println("2 Zmiana ilości");
            System.out.println("3 Zmiana ceny");
            System.out.println("4 Nic");

            Pozycja p = pozycje.get(index);
            Scanner scanner = new Scanner(System.in);

            int wybor = scanner.nextInt();
            scanner.nextLine();

            switch (wybor) {
                case 1:
                    System.out.println("Podaj nową nazwę");
                    String nowaNazwaTowaru = scanner.nextLine();
                    p.setNazwaTowaru(nowaNazwaTowaru);
                    break;
                case 2:
                    System.out.println("Podaj nową ilość");
                    int nowaIleSztuk = scanner.nextInt();
                    p.setIleSztuk(nowaIleSztuk);
                    break;
                case 3:
                    System.out.println("Podaj nową cenę");
                    double nowaCena = scanner.nextDouble();
                    p.setCena(nowaCena);
                    break;
                default:
                    break;
            }
        } else {
            System.out.println();
        }
    }


    @Override
    public String toString() {
        System.out.println("Zamówienie:");
        for (Pozycja p : pozycje) {
            System.out.println(p);
        }
        return "Cena bez rabatu wynosi " + String.valueOf(obliczSumęCen()) + " zł cena z rabatami wynosi " + obliczSumęCenZRabatem() + " zł rabat wynosi " + ileRabatu() + " zł ";
    }

    public static void zapiszZamowienie(Zamowienie z, String nazwaPliku) throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream("testy");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(z);
            System.out.println("Zamówienie zostało zapisane w pliku: " + nazwaPliku);
        }
    }
}





