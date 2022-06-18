public class Katalog {
    private Map<String, Produkt> produkt = new HashMap<>();

    public Produkt lookup(String NazwaProduktu) {
        if (!produkt.containsKey(NazwaProduktu)) {
            produkt.put(NazwaProduktu, new Produkt(NazwaProduktu));

        }
        return produkt.get(NazwaProduktu);
    }

    public int ZrobioneProdukty() {
        return produkt.ilosc();
    }
}
