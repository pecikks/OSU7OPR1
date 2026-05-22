public class Kolo extends Vybaveni{
    private String typKola;
    private boolean elektrokolo;

    public Kolo(String id, String nazev, double cenaZaDen, boolean dostupne, String typKola, boolean elektrokolo) {
        super(id, nazev, cenaZaDen, dostupne);
        this.typKola = typKola;
        this.elektrokolo = elektrokolo;
    }

    @Override
    public String predstavSe() {
        String elekroText = elektrokolo ? "ano" : "ne";

        return "Kolo" + getId() + " - " + getNazev()
                + ", typ: " + typKola
                + ", elektrokolo: " + elekroText
                + ", cena/den: " + getCenaZaDen() + " Kč";
    }

    @Override
    public double vypocitejCenu(int pocetDni) {
        if (pocetDni <= 0) {
            return 0;
        }

        double cena = getCenaZaDen() * pocetDni;

        if (elektrokolo) {
            cena += 150 * pocetDni;
        }
        return cena;
    }

    @Override
    public String infoPronajmu(int pocetDni) {
        return getNazev() + " na " + pocetDni + " dny: "
                + vypocitejCenu(pocetDni) + " Kč";
    }
}
