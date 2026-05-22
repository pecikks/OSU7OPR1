public class Publikace {
    protected String nazev;
    protected String autor;
    protected int rokVydani;

    public Publikace(String nazev, String autor, int rokVydani) {
        this.nazev = nazev;
        this.autor = autor;
        this.rokVydani = rokVydani;
    }

    public String getNazev() {
        return nazev;
    }

    public String getAutor() {
        return autor;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public String getTyp() {
        return "Publikace";
    }

    public String info() {
        return nazev + " - " + autor + " (" + rokVydani + ")";
    }

    public String vypujc() {
        return "Publikace byla vypůjčena.";
    }
}
