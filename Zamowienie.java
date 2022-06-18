public class Zamowienie {
    private final int NumerZamowienia;
    private final Produkt produkt;

    public Zamowienie(int NumerZamowienia, Produkt produkt) {
        this.NumerZamowienia = NumerZamowienia;
        this.produkt = produkt;
    }

    public void procesowanieZamowienia() {
        System.out.println("Pozycja: " + produkt + "ilość: " + NumerZamowienia);
    }
}
