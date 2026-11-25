public class Instrument {
    private String name;
    private double price;
    private boolean onSale;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
        this.onSale = false;
    }

    public String getName() { return name; }
    public boolean isOnSale() { return onSale; }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    // Jika onSale, harga 15% lebih murah
    public double getPrice() {
        if (onSale) {
            return price * 0.85;
        }
        return price;
    }

    // Diskon karyawan: 25% dari harga awal
    public double getEmployeePrice() {
        return price * 0.75;
    }

    // Bisa menjalankan Instrument.java secara langsung
    public static void main(String[] args) {
        Instrument instrument = new Instrument("Piano", 5000000);

        System.out.println("Nama alat musik: " + instrument.getName());
        System.out.println("Harga normal: Rp" + instrument.getPrice());
        System.out.println("Harga karyawan: Rp" + instrument.getEmployeePrice());

        instrument.setOnSale(true);
        System.out.println("Sedang diskon: " + instrument.isOnSale());
        System.out.println("Harga setelah diskon: Rp" + instrument.getPrice());
    }
}
