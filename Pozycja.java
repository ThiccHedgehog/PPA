import java.io.Serializable;

public class Pozycja implements Serializable {

    String nazwaTowaru;
    int ileSztuk;
    double cena;

    double cena_koncowa;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public int getIleSztuk() {
        return ileSztuk;
    }

    public void setIleSztuk(int ileSztuk) {
        this.ileSztuk = ileSztuk;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

public double obliczWartosc(){
        cena_koncowa = ileSztuk*cena;
        return cena_koncowa;
}


    double obliczWartoscZRabatem() {

        double cena_z_rabatem = 0.0;

        if (ileSztuk > 4 && ileSztuk < 10) {
            cena_z_rabatem = (ileSztuk * cena) * 0.95;
        }
        if (ileSztuk >= 11 && ileSztuk < 20) {
            cena_z_rabatem = (ileSztuk * cena)  * 0.90;
        } if(ileSztuk >= 11 && ileSztuk < 20) {
            cena_z_rabatem = (ileSztuk * cena) * 0.85;
        }else{
            cena_z_rabatem = cena_koncowa;
        }
        return cena_z_rabatem;
    }

    @Override
    public String toString() {
        return
                nazwaTowaru + " " +
                cena + " zł "
                + ileSztuk +" szt "
                + obliczWartosc() + " zł "
                + " cena z rabatem " + obliczWartoscZRabatem() + " zł ";
    }


}
