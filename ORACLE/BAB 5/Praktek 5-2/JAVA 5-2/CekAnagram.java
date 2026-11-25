import java.util.Scanner;

public class CekAnagram {
    static int[] hitung(String s) {
        int[] jumlah = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (Character.isLetterOrDigit(c) && c < 128) {
                jumlah[c]++;
            }
        }
        return jumlah;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("String pertama: ");
        String a = in.nextLine();
        System.out.print("String kedua: ");
        String b = in.nextLine();

        int[] ha = hitung(a);
        int[] hb = hitung(b);

        boolean anagram = true;
        for (int i = 0; i < ha.length; i++) {
            if (ha[i] != hb[i]) {
                anagram = false;
                break;
            }
        }

        if (anagram) System.out.println("\"" + a + "\" adalah anagram dari \"" + b + "\".");
        else System.out.println("\"" + a + "\" BUKAN anagram dari \"" + b + "\".");
        in.close();
    }
}