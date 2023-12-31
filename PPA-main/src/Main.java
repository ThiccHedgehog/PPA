import Dziedziczenie.Auto;
import Dziedziczenie.Jacht;
import Dziedziczenie.Pojazd;
import Dziedziczenie.Samolot;

import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {

   /* static void dodawanie(float a, float b){
     System.out.println(a+b);
    }
    static void odejmowanie(float a, float b){
            System.out.println(a - b);
    }
    static void mnozenie(float a, float b){
        System.out.println(a*b);
    }
    static void dzielenie(float a, float b){
        if(b == 0){
            System.out.println("Nie można dzielić przez 0");
        }else {
            System.out.println(a / b);
        }
    }*/
    public static void main(String[] args) {
       /* try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbę a");
            float a = scan.nextInt();
            System.out.println("Podaj liczbę b");
            float b = scan.nextInt();
            System.out.println("Co chcesz wykonać za działanie? 1-dodawanie 2-odejmowanie 3-mnożenie 4-dzielenie");
            int dzialanie = scan.nextInt();

            switch (dzialanie) {
                case 1:
                    dodawanie(a, b);
                    break;
                case 2:
                    odejmowanie(a, b);
                    break;
                case 3:
                    mnozenie(a, b);
                    break;
                case 4:
                    dzielenie(a, b);
                    break;
                default:
                    System.out.println("Wybrano nieistniejące działanie");
            }
        }catch(InputMismatchException e){
            System.out.println("Błąd");
        }

        String name2 = "Name";
        String name3 = new String(name2);

        System.out.println(name3 == name2);
        System.out.println(name3.equals(name2));

        System.out.println();*/

        Samochod samochod = new Samochod();
        samochod.setKolor("Niebieski");
        samochod.setMarka("BMW");
        samochod.setModel("A3");


        System.out.println(samochod);

        samochod.informacje();

        Auto auto = new Auto("Honda", "Civic");
        Samolot samolot = new Samolot("X","Y");
        Jacht jacht = new Jacht("Porsche","XD");
        useMakeNoise(auto);
        useMakeNoise(samolot);
        useMakeNoise(jacht);

    }

    private static void useMakeNoise(Pojazd pojazd) {
        pojazd.makeNoise();
    }

}