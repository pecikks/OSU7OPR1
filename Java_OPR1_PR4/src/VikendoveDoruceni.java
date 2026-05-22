public class VikendoveDoruceni implements DorucovaciStrategie{
    @Override
    public String getNazev() {
        return "Víkendové doručení";
    }

    @Override
    public double spocitejCenuDoruceni(Zasilka zasilka) {
        return 180 + zasilka.getHmotnostKg() * 20;
    }

    @Override
    public String doruc(Zasilka zasilka) {
        return zasilka.getId() + ": doručeno o víkendu";
    }
}
