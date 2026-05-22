public class Vybaveni implements Pronajimatele{
    private String id;
    private String nazev;
    private double cenaZaDen;
    private boolean dostupne;

    public Vybaveni(String id, String nazev, double cenaZaDen, boolean dostupne) {
        this.id = id;
        this.nazev = nazev;
        this.cenaZaDen = cenaZaDen;
        this.dostupne = dostupne;
    }

    public String getId() {
        return id;
    }

    public String getNazev() {
        return nazev;
    }

    public double getCenaZaDen() {
        return cenaZaDen;
    }

    public boolean jeDostupne() {
        return dostupne;
    }

    public void nastavDostupnost(boolean dostupne) {
        this.dostupne = dostupne;
    }

    public String predstavSe() {
        return id + " - " + nazev + ", cena/den: " + cenaZaDen + " Kč";
    }

    @Override
    public double vypocitejCenu(int pocetDni) {
        if (pocetDni <= 0) {
            return 0;
        }
        return cenaZaDen * pocetDni;
    }

    @Override
    public String infoPronajmu(int pocetDni) {
        return nazev + " na " + pocetDni + " dny: "
                + vypocitejCenu(pocetDni) + " Kč";
    }
}
