import java.util.ArrayList;

public class Pujcovna {
    private ArrayList<Vybaveni> vybaveni;

    public Pujcovna() {
        vybaveni = new ArrayList<>();
    }

    public void pridejVybaveni(Vybaveni v) {
        vybaveni.add(v);
    }

    public void vypisNabidku() {
        for (Vybaveni v : vybaveni) {
            System.out.println(v.predstavSe());
        }
    }

    public Vybaveni najdiPodleId(String id) {
        for (Vybaveni v : vybaveni) {
            if (v.getId().equals(id)) {
                return v;
            }
        }
        return null;
    }

    public void vypisDostupne() {
        for (Vybaveni v : vybaveni) {
            if (v.jeDostupne()) {
                System.out.println(v.getId() + " - " + v.getNazev());
            }
        }
    }

    public void pujcVybaveni(String id) {
        Vybaveni v = najdiPodleId(id);

        if (v != null && v.jeDostupne()) {
            v.nastavDostupnost(false);
            System.out.println("Vybaveni bylo půjčeno: " + v.getNazev());
        } else if (v != null) {
            System.out.println("Vybavení není dostupné: " + v.getNazev());
        } else {
            System.out.println("Vybavení s ID " + id + " nebylo nalezeno.");
        }
    }

    public void vratVybaveni(String id) {
        Vybaveni v = najdiPodleId(id);

        if (v != null) {
            v.nastavDostupnost(true);
            System.out.println("Vybavení bylo vráceno: " + v.getNazev());
        } else {
            System.out.println("Vybavení s ID " + id + " nebylo nalezeno.");
        }
    }

    public ArrayList<Vybaveni> getVybaveni() {
        return vybaveni;
    }
}
