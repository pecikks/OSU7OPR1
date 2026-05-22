public class EBook extends Publikace {
    private double velikostMB;

    public EBook(String nazev, String autor, int rokVydani, double velikostMB) {
        super(nazev, autor, rokVydani);
        this.velikostMB = velikostMB;
    }

    @Override
    public String getTyp() {
        return "E-book";
    }

    @Override
    public String info() {
        return getTyp() + ": " + getNazev() + " - " + getAutor()
                + " (" + getRokVydani() + "), " + velikostMB + " MB";
    }

    @Override
    public String vypujc() {
        return getNazev() + ": e-book byl zpřístupněn online.";
    }
}
