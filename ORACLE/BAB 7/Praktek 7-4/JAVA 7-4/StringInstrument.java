public class StringInstrument extends Instrument {
    private int numStrings;

    public StringInstrument(String name, double price, int numStrings) {
        super(name, price);
        this.numStrings = numStrings;
    }

    public int getNumStrings() { return numStrings; }

    // Bisa menjalankan StringInstrument.java secara langsung
    public static void main(String[] args) {
        StringInstrument instrument = new StringInstrument("Biola", 2000000, 4);

        System.out.println("Nama alat musik: " + instrument.getName());
        System.out.println("Jumlah senar: " + instrument.getNumStrings());
        System.out.println("Harga: Rp" + instrument.getPrice());
    }
}
