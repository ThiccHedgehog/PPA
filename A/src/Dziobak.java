public class Dziobak extends Zwierzęta {
    public Dziobak(String rasa, String imie, String wiek) {
        super(rasa, imie, wiek);
    }
    @Override
    public void makeNoise() {
        System.out.println("Wydaję odgłos Dziob dziob");
    }
}
