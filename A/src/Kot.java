public class Kot extends Zwierzęta {
    public Kot(String rasa, String imie, String wiek) {
    super(rasa, imie, wiek);
    }

    @Override
    public void makeNoise() {
        System.out.println("Wydaję odgłos Miau miau");
    }
}
