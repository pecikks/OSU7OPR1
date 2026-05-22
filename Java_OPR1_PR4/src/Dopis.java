public class Dopis extends Zasilka{
    private boolean prioritni;

    public Dopis(String id, String prijemce, String mesto, double hmotnostKg, double zakladniCena, boolean prioritni) {
        super(id, prijemce, mesto, hmotnostKg, zakladniCena);
        this.prioritni = prioritni;
    }

    @Override
    public String getTyp() {
        return "Dopis";
    }

    @Override
    public String popis() {
        String prioritaText = prioritni ? " - prioritní" : " - běžný";
        return super.popis() + prioritaText;
    }

    @Override
    public double vypocitejZakladniCenu() {
        double cena = super.vypocitejZakladniCenu();

        if (prioritni) {
            cena += 30;
        }
        return cena;
    }
}
