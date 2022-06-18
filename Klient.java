public class Klient {
    public static void main(String[] args) {
        System1 system = new System1();

        system.ZlozZamowienie("Suszarka Dyson", 20);
        system.ZlozZamowienie("Prostownica Remington", 27);
        system.ZlozZamowienie("Lokówka Babylis", 30);
        system.ZlozZamowienie("Termoloki Remington", 15);

        system.procesowanie();

        System.out.println(system.raport());

    }
}
