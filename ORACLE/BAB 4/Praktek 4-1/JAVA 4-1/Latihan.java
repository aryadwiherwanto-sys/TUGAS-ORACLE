import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // declare variables
        double gallons = 0;
        double liters = 0;

        // input from user
        System.out.print("Masukkan jumlah galon: ");
        gallons = in.nextDouble();

        // calculation
        liters = gallons * 3.785;

        // output
        System.out.println(gallons + " gallons equals " + liters + " liters");

        in.close();
    }
}
