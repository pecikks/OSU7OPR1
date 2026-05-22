public class StandartniDoruceni implements DorucovaciStrategie{
    @Override
    public String getNazev() {
        return "Standartní doručení";
    }

    @Override
    public double spocitejCenuDoruceni(Zasilka zasilka) {
        return 60 + zasilka.getHmotnostKg() * 5;
    }

    @Override
    public String doruc(Zasilka zasilka) {
        return zasilka.getId() + ": doručeno běžným kurýrem";
    }
}
