public class Lyze extends Vybaveni{
    private int delkaCm;
    private boolean detske;

    public Lyze(String id, String nazev, double cenaZaDen, boolean dostupne, int delkaCm, boolean detske) {
        super(id, nazev, cenaZaDen, dostupne);
        this.delkaCm = delkaCm;
        this.detske = detske;
    }

    @Override
    public String predstavSe() {
        String detskeText = detske ? "ano" : "ne";

        return "Lyže " + getId() + " - " + getNazev()
                + ", délka: " + delkaCm + " cm"
                + ", dětské: " + detskeText
                + ", cena/den: " + getCenaZaDen() + " Kč";
    }

    @Override
    public double vypocitejCenu(int pocetDni) {
        if (pocetDni <= 0) {
            return 0;
        }

        double cena = getCenaZaDen() * pocetDni;

        if (detske) {
            cena *= 0.8;
        }
        return cena;
    }

    @Override
    public String infoPronajmu(int pocetDni) {
        return getNazev() + " na " + pocetDni + " dny: "
                + vypocitejCenu(pocetDni) + " Kč";
    }
}
