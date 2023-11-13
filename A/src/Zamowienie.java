import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zamowienie implements Serializable {

    public static List<Pozycja> pozycje = new ArrayList<Pozycja>();


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


    public double obliczSumeCen() {
        double suma = 0;
        for (Pozycja pozycja : pozycje) {
            suma += pozycja.obliczWartosc();
        }
        return suma;
    }



    public double obliczSumeCenZRabatem() {
        double suma_z_rabatem = 0;
        for (Pozycja pozycja : pozycje) {
            suma_z_rabatem += pozycja.obliczWartoscZRabatem();
        }
        return suma_z_rabatem;
    }

    public double ileRabatu(){
        double rabat = 0;
        rabat = obliczSumeCen() - obliczSumeCenZRabatem();
        return rabat;
    }

public void usunPozycje(int p){
        pozycje.remove(p);
}

    public void edytujPozycje(int index) {
        if (index >= 0 && index < pozycje.size()) {
            System.out.println("Co chcesz");
            System.out.println("1 Zmiana nazwy");
            System.out.println("2 Zmiana ilosci");
            System.out.println("3 Zmiana ceny");
            System.out.println("4 Nic");

            Pozycja p = pozycje.get(index);
            Scanner scanner = new Scanner(System.in);

            int wybor = scanner.nextInt();
            scanner.nextLine();

            switch (wybor) {
                case 1:
                    System.out.println("Podaj nową nazwe");
                    String nowaNazwaTowaru = scanner.nextLine();
                    p.setNazwaTowaru(nowaNazwaTowaru);
                    break;
                case 2:
                    System.out.println("Podaj nową ilosci");
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
        System.out.println("Zamowienie:");
        for (Pozycja p : pozycje) {
            System.out.println(p);
        }
        return "Cena bez rabatu wynosi " + String.valueOf(obliczSumeCen()) + " zl cena z rabatami wynosi " + obliczSumeCenZRabatem() + " zl rabat wynosi " + ileRabatu() + " zl ";
    }

    public void zapiszZamowienie(String nazwaPliku) throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream(nazwaPliku);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            String wiadomoscDoZapisu = "Cos " + this.maksRozmiar + " dded";

            out.writeBytes(wiadomoscDoZapisu);
            System.out.println("Zamowienie zostalo zapisane w pliku: " + nazwaPliku);
        }
    }
    public Zamowienie wczytajZamowienie(String nazwaPliku) throws IOException, ClassNotFoundException {
        try (FileInputStream fileIn = new FileInputStream(nazwaPliku);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Zamowienie z = (Zamowienie) in.readObject();
            System.out.println("Zamowienie zostalo wczytane z pliku: " + nazwaPliku);
            return z;
        }
    }
}





