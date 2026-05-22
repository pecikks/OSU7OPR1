import java.util.ArrayList;

public class Objednavka {
    private String cisloObjednavky;
    private ArrayList<Zasilka> zasilky;
    private DorucovaciStrategie strategie;

    public Objednavka(String cisloObjednavky) {
        this.cisloObjednavky = cisloObjednavky;
        this.zasilky = new ArrayList<>();
    }

    public Zasilka najdiZasilkuPodleId(String id) {
        for (Zasilka zasilka : zasilky) {
            if (zasilka.getId().equals(id)) {
                return zasilka;
            }
        }
        return null;
    }

    public void pridejZasilku(Zasilka zasilka) {
        if (najdiZasilkuPodleId(zasilka.getId()) != null) {
            System.out.println("Zásilka s ID " + zasilka.getId() + " už v objednávce existuje.");
        }
        zasilky.add(zasilka);
    }

    public void setStrategie(DorucovaciStrategie strategie) {
        this.strategie = strategie;
    }

    public double spocitejCelkovouCenu() {
        if (strategie == null) {
            System.out.println("Objednávka nemá nastevnou doručovací strategii.");
            return 0;
        }

        double celkem = 0;

        for (Zasilka zasilka : zasilky) {
            celkem += zasilka.vypocitejZakladniCenu();
            celkem += strategie.spocitejCenuDoruceni(zasilka);
        }

        return celkem;
    }

    public void vypisObjednavku() {
        System.out.println("Objednávka " + cisloObjednavky);

        if (strategie == null) {
            System.out.println("Strategie: není nastavena");
            System.out.println("-----------------------------------");
            System.out.println("Nelze spočítat cenu doručení.");
            return;
        }

        System.out.println("Strategie: " + strategie.getNazev());
        System.out.println("-----------------------------------");

        for (Zasilka zasilka : zasilky) {
            double cenaZasilky = zasilka.vypocitejZakladniCenu();
            double cenaDoruceni = strategie.spocitejCenuDoruceni(zasilka);

            System.out.println(zasilka.popis());
            System.out.println("Cena zásilky: " + cenaZasilky
                    + " Kč, doručení: " + cenaDoruceni + " Kč");
            System.out.println(strategie.doruc(zasilka));
            System.out.println();
        }

        System.out.println("-----------------------------------");
        System.out.println("Celkem: " + spocitejCelkovouCenu() + " Kč");
    }
}
