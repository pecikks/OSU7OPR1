public class ExpresniDoruceni implements DorucovaciStrategie{
    @Override
    public String getNazev() {
        return "Expresní doručení";
    }

    @Override
    public double spocitejCenuDoruceni(Zasilka zasilka) {
        return 120 + zasilka.getHmotnostKg() * 15;
    }

    @Override
    public String doruc(Zasilka zasilka) {
        return zasilka.getId() + ": doručeno expresně do druhého dne";
    }
}
