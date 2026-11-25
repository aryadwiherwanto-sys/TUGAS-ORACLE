
public class Nomor1 {
    public static void main(String[] args) {
        long[][] matrix = {
            {5, 5, 5},
            {5, 5, 5},
            {5, 5, 5},
            {5, 5, 5}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
