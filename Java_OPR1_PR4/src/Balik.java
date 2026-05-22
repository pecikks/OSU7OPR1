public class Balik extends Zasilka{
    private boolean krehke;

    public Balik(String id, String prijemce, String mesto, double hmotnostKg, double zakladniCena, boolean krehke) {
        super(id, prijemce, mesto, hmotnostKg, zakladniCena);
        this.krehke = krehke;
    }

    @Override
    public String getTyp() {
        return "Balík";
    }

    @Override
    public String popis() {
        String krehkeText = krehke ? " - křehké" : " - běžné";
        return super.popis() + krehkeText;
    }

    @Override
    public double vypocitejZakladniCenu() {
        double cena = super.vypocitejZakladniCenu();

        if (krehke) {
            cena += 50;
        }
        return cena;
    }
}
