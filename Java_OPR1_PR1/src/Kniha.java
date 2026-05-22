public class Kniha extends Publikace{
    private int pocetStran;

    public Kniha(String nazev, String autor, int rokVydani, int pocetStran) {
        super(nazev, autor, rokVydani);
        this.pocetStran = pocetStran;
    }

    @Override
    public String getTyp() {
        return "Kniha";
    }

    @Override
    public String info() {
        return getTyp() + ": " + getNazev() + " - " + getAutor()
                + " (" + getRokVydani() + "), " + pocetStran + " stran";
    }

    @Override
    public String vypujc() {
        return getNazev() + ": kniha je půjčena na 30 dní.";
    }
}
