package Dziedziczenie;

public class Auto extends Pojazd {
    public Auto(String marka, String model){
        super(marka, model);
    }
    @Override
    public void makeNoise() {
        System.out.println("Woof Woof");
    }
}
