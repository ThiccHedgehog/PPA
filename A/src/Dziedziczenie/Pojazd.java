package Dziedziczenie;

public class Pojazd {


    String marka;
    String model;

    public Pojazd(String marka, String model){
        this.marka = marka;
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void makeNoise(){
        System.out.println("brum brum");
    }
}
