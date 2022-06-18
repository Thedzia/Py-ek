import java.util.concurrent.CopyOnWriteArrayList;

public class Koszyk {
    private final Katalog katalog = new Katalog();
    private final List<Zamowienie> zamowienie = new CopyOnWriteArrayList<>();

    public void ZlozZamowienie(String nazwaProduktu, int NumerZamowienia) {
        Produkt produkt = katalog.lookup(nazwaProduktu);
        Zamowienie zamowienie = new Zamowienie(NumerZamowienia, produkt);
        zamowienia.add(zamowienie);
    }

    public void procesowanie() {
        for (Zamowienie zamowienie : zamowienie) {
            zamowienie.procesowanieZamowienia();
        }
    }

    public String raport() {
        return "Wszystkich produktów: " + katalog.ZrobioneProdukty();
    }
}
