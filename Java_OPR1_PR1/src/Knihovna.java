import java.util.ArrayList;

public class Knihovna {
    private ArrayList<Publikace> publikace;

    public Knihovna() {
        publikace = new ArrayList<>();
    }

    public void pridejPublikaci(Publikace p) {
        publikace.add(p);
    }

    public void vypisVsechny() {
        for (Publikace p : publikace) {
            System.out.println(p.info());
        }
    }

    public void vypujcVsechny() {
        for (Publikace p : publikace) {
            System.out.println(p.vypujc());
        }
    }

    public Publikace najdiPodleNazvu(String nazev) {
        for (Publikace p : publikace) {
            if (p.getNazev().equals(nazev)) {
                return p;
            }
        }
        return null;
    }
}
