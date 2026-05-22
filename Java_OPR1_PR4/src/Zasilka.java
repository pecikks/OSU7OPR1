import java.util.Objects;

public abstract class Zasilka {
    private String id;
    private String prijemce;
    private String mesto;
    private double hmotnostKg;
    private double zakladniCena;

    public Zasilka(String id, String prijemce, String mesto, double hmotnostKg, double zakladniCena) {
        this.id = id;
        this.prijemce = prijemce;
        this.mesto = mesto;
        this.hmotnostKg = hmotnostKg;
        this.zakladniCena = zakladniCena;
    }

    public String getId() {
        return id;
    }

    public String getPrijemce() {
        return prijemce;
    }

    public String getMesto() {
        return mesto;
    }

    public double getHmotnostKg() {
        return hmotnostKg;
    }

    public double getZakladniCena() {
        return zakladniCena;
    }

    public abstract String getTyp();

    public String popis() {
        return getTyp() + " " + id + " pro " + prijemce
                + ", " + mesto + ", " + hmotnostKg + " kg";
    }

    public double vypocitejZakladniCenu() {
        return zakladniCena + hmotnostKg * 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zasilka)) return false;

        Zasilka zasilka = (Zasilka) o;
        return Objects.equals(id, zasilka.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
