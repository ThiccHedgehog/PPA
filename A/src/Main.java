import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Kapibara kapibara = new Kapibara("ssak", "Feluś", "5");
        Dziobak dziobak = new Dziobak("ssak", "Staś", "7");
        Pies pies = new Pies("ssak", "Antek", "8");
        Kot kot = new Kot("ssak", "Filemon", "6");

for(Zwierzęta zwierzęta: Zwierzęta.Lista){
    System.out.println(zwierzęta);
    zwierzęta.makeNoise();
    zwierzęta.test();
}


    }
 }