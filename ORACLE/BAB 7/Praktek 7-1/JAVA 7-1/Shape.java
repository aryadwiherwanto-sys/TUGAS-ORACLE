public class Shape {
    private int numSides;
    private boolean regular;

    public Shape() {
        numSides = 0;
        regular = false;
    }

    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    public int getNumSides() {
        return numSides;
    }

    public static void main(String[] args) {
        Shape bangun = new Shape(4, true);

        System.out.println("Jumlah sisi: " + bangun.getNumSides());
    }
}