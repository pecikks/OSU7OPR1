public class Casopis extends Publikace{
    private int cisloVydani;

    public Casopis(String nazev, String autor, int rokVydani, int cisloVydani) {
        super(nazev, autor, rokVydani);
        this.cisloVydani = cisloVydani;
    }

    @Override
    public String getTyp() {
        return "Časopis";
    }

    @Override
    public String info() {
        return getTyp() + ": " + getNazev() + " - " + getAutor()
                + " (" + getRokVydani() + "), číslo " + cisloVydani;
    }

    @Override
    public String vypujc() {
        return getNazev() + ": časopis je půjčen na 14 dní.";
    }
}
