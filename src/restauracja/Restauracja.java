package restauracja;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Restauracja {
    Map<Kelnerka, Stolik> kelnerkiZeStolikami;

    public Restauracja() {
        this.kelnerkiZeStolikami = new HashMap<>();
    }

    public void ustawKelnerkeIStolik(Kelnerka kelnerka, Stolik stolik) {
        this.kelnerkiZeStolikami.put(kelnerka, stolik);
    }

    public double pobierzCalkowityDochod(){
        double suma = 0;
        for (Stolik stolik : kelnerkiZeStolikami.values()) {
            suma += stolik.cenaZamowien;
        }
        return suma;
    }

    public double pobierzDochodKelnerki(String imie) {

       return kelnerkiZeStolikami.get(new Kelnerka(imie)).cenaZamowien;
    }
}