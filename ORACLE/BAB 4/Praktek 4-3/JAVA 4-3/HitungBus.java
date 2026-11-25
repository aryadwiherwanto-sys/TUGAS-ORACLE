import java.util.Scanner;

public class HitungBus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int orang, bus, van;

        System.out.print("Jumlah orang: ");
        orang = input.nextInt();

        bus = orang / 45;
        van = orang % 45;

        System.out.println("Jumlah bus: " + bus);
        System.out.println("Jumlah orang naik van: " + van);
    }
}
