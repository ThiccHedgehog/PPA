public class Pies extends Zwierzęta{
    public Pies(String rasa, String imie, String wiek) {
        super(rasa, imie, wiek);
    }
    @Override
    public void makeNoise() {
        System.out.println("Wydaję odgłos Szczek szczek");

    }
}
