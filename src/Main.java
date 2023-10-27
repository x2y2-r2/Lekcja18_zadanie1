import restauracja.Kelnerka;
import restauracja.Restauracja;
import restauracja.Stolik;

public class Main {
//    Na konsoli powinno pojawić się:
//      "Calkowity dochod restauracji:"
//      650.0
//      Dochod Sabiny:
//      100.0
//      Dochod Katarzyny:
//      200.0
//      Dochod Antoniny:
//      300.0
//      Dochod Haliny:
//      50.0

    public static void main(String[] args) {
        Restauracja restauracja = new Restauracja();

        restauracja.ustawKelnerkeIStolik(new Kelnerka("Sabina"), new Stolik(100));
        restauracja.ustawKelnerkeIStolik(new Kelnerka("Katarzyna"), new Stolik(200));
        restauracja.ustawKelnerkeIStolik(new Kelnerka("Antonina"), new Stolik(300));
        restauracja.ustawKelnerkeIStolik(new Kelnerka("Halina"), new Stolik(50));

//        System.out.println("Testy");
//        System.out.println("----------------------");
//        System.out.println();


        System.out.println("Calkowity dochod restauracji:");
        System.out.println(restauracja.pobierzCalkowityDochod());

        System.out.println("Dochod Sabiny:");
        System.out.println(restauracja.pobierzDochodKelnerki("Sabina"));

        System.out.println("Dochod Katarzyny:");
        System.out.println(restauracja.pobierzDochodKelnerki("Katarzyna"));

        System.out.println("Dochod Antoniny:");
        System.out.println(restauracja.pobierzDochodKelnerki("Antonina"));

        System.out.println("Dochod Haliny:");
        System.out.println(restauracja.pobierzDochodKelnerki("Halina"));
    }
}