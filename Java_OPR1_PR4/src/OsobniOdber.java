public class OsobniOdber implements DorucovaciStrategie{

    @Override
    public String getNazev() {
        return "Osobní odběr";
    }

    @Override
    public double spocitejCenuDoruceni(Zasilka zasilka) {
        return 0;
    }

    @Override
    public String doruc(Zasilka zasilka) {
        return zasilka.getId() + ": připraveno k vyzvednutí na pobočce";
    }
}
