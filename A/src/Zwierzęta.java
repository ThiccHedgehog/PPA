import java.util.ArrayList;
import java.util.List;

public class Zwierzęta {
    String rasa;
    String imie;
    String wiek;

    public static List<Zwierzęta> Lista = new ArrayList<>();
    public Zwierzęta(String rasa, String imie, String wiek){
        this.rasa = rasa;
        this.imie = imie;
        this.wiek = wiek;

        Lista.add(this);
    }
    public String getRasa(){return rasa;}

    public void setRasa(String rasa){this.rasa = rasa;}

    public String getImie(){return imie;}

    public void setImie(String imie){this.imie = imie;}

    public String getWiek(){return wiek;}

    public void setWiek(String wiek){this.wiek = wiek;}


    public void makeNoise(){
        System.out.println("Wydaję odgłos hau hau");

    }

    public void test(){
        System.out.println("Moje imie to " + imie + ". Mam " + wiek + " lat i jestem " + rasa);
    }

}


