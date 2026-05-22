public class Potraviny extends Zasilka{
    private boolean chlazene;

    public Potraviny(String id, String prijemce, String mesto, double hmotnostKg, double zakladniCena, boolean chlazene) {
        super(id, prijemce, mesto, hmotnostKg, zakladniCena);
        this.chlazene = chlazene;
    }

    @Override
    public String getTyp() {
        return "Potraviny";
    }

    @Override
    public String popis() {
        String chlazeneText = chlazene ? " - chlazené" : " - nechlazené";
        return super.popis() + chlazeneText;
    }

    @Override
    public double vypocitejZakladniCenu() {
        double cena = super.vypocitejZakladniCenu();

        if (chlazene) {
            cena += 80;
        }
        return cena;
    }
}
