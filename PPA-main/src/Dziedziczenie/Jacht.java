package Dziedziczenie;

public class Jacht extends Pojazd{
    public Jacht(String marka, String model) {
        super(marka, model);
    }

    @Override
    public void makeNoise() {
        System.out.println("Plum Plum");
    }
}


