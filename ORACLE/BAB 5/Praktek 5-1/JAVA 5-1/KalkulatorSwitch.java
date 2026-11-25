import java.util.Locale;
import java.util.Scanner;

public class KalkulatorSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        System.out.print("Angka pertama: ");
        double a = in.nextDouble();
        System.out.print("Operator (+, -, *, /, %): ");
        char op = in.next().charAt(0);
        System.out.print("Angka kedua: ");
        double b = in.nextDouble();

        double hasil = 0;
        boolean valid = true;

        switch (op) {
            case '+': hasil = a + b; break;
            case '-': hasil = a - b; break;
            case '*': hasil = a * b; break;
            case '/':
                if (b == 0) { valid = false; System.out.println("Tidak bisa membagi dengan nol."); }
                else hasil = a / b;
                break;
            case '%':
                if (b == 0) { valid = false; System.out.println("Tidak bisa modulus dengan nol."); }
                else hasil = a % b;
                break;
            default:
                valid = false;
                System.out.println("Operator tidak dikenal.");
        }

        if (valid) System.out.println("Hasil: " + hasil);
        in.close();
    }
}
