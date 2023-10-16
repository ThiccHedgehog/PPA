public class Samochod {
    private String marka;
    private String model;
    private String kolor;

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
    public String getKolor() {
        return kolor;
    }
    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Twój samochód to:{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    public void informacje(){
        System.out.println(kolor);
        System.out.println(marka);
        System.out.println(model);
    }
}
