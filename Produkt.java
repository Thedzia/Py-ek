public class Produkt {

    private final String nazwa;

    public Produkt(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
