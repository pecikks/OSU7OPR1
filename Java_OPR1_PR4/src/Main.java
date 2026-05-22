public class Main {
    public static void main(String[] args) {
        Zasilka dopis1 = new Dopis(
                "D001",
                "Jan Novák",
                "Praha",
                0.2,
                50,
                true
        );

        Zasilka dopis2 = new Dopis(
                "D002",
                "Lucie Černá",
                "Plzeň",
                0.1,
                45,
                false
        );

        Zasilka balik1 = new Balik(
                "B001",
                "Eva Malá",
                "Brno",
                3.5,
                100,
                true
        );

        Zasilka balik2 = new Balik(
                "B002",
                "Tomáš Veselý",
                "Liberec",
                6.0,
                140,
                false
        );

        Zasilka potraviny1 = new Potraviny(
                "P001",
                "Petr Svoboda",
                "Ostrava",
                4.0,
                100,
                true
        );

        Objednavka objednavka = new Objednavka("OBJ-2026-01");

        objednavka.pridejZasilku(dopis1);
        objednavka.pridejZasilku(dopis2);
        objednavka.pridejZasilku(balik1);
        objednavka.pridejZasilku(balik2);
        objednavka.pridejZasilku(potraviny1);

        objednavka.pridejZasilku(
                new Balik("B001", "Duplicitní balík", "Praha", 2.0, 80, false)
        );

        System.out.println("=== KURÝRNÍ DORUČOVACÍ SLUŽBA ===");
        System.out.println();

        objednavka.setStrategie(new StandartniDoruceni());
        objednavka.vypisObjednavku();

        System.out.println();
        System.out.println("Změna strategie na: Expresní doručení");
        objednavka.setStrategie(new ExpresniDoruceni());
        objednavka.vypisObjednavku();

        System.out.println();
        System.out.println("Změna strategie na: Osobní odběr");
        objednavka.setStrategie(new OsobniOdber());
        objednavka.vypisObjednavku();

        System.out.println();
        System.out.println("Změna strategie na: Víkendové doručení");
        objednavka.setStrategie(new VikendoveDoruceni());
        objednavka.vypisObjednavku();

        System.out.println();
        System.out.println("=== HLEDÁNÍ ZÁSILKY ===");

        Zasilka nalezena = objednavka.najdiZasilkuPodleId("P001");

        if (nalezena != null) {
            System.out.println("Nalezena zásilka: " + nalezena.popis());
        } else {
            System.out.println("Zásilka nebyla nalezena.");
        }

        Zasilka nenalezena = objednavka.najdiZasilkuPodleId("X999");

        if (nenalezena != null) {
            System.out.println("Nalezena zásilka: " + nenalezena.popis());
        } else {
            System.out.println("Zásilka X999 nebyla nalezena.");
        }
    }
}
