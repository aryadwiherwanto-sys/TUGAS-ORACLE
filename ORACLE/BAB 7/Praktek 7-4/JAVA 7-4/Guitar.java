public class Guitar extends StringInstrument {
    private boolean electric;

    public Guitar(String name, double price, int numStrings, boolean electric) {
        super(name, price, numStrings);
        this.electric = electric;
    }

    public boolean isElectric() { return electric; }

    // Bisa menjalankan Guitar.java secara langsung
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Yamaha", 3000000, 6, true);

        System.out.println("Nama gitar: " + guitar.getName());
        System.out.println("Jumlah senar: " + guitar.getNumStrings());
        System.out.println("Gitar elektrik: " + guitar.isElectric());
        System.out.println("Harga: Rp" + guitar.getPrice());
    }
}
