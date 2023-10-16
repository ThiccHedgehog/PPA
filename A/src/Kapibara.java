public class Kapibara extends Zwierzęta {
    public Kapibara(String rasa, String imie, String wiek) {
        super(rasa, imie, wiek);
    }
    @Override
    public void makeNoise() {
        System.out.println("Wydaję odgłos Kapi Kapi");
    }
}
