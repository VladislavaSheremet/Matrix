import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {

        int n = 0, m=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        n = in.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        m = in.nextInt();

        int[][] matrix  = new int[n][m];

        System.out.println("Введите элементов матрицы: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
            System.out.println();
        }

        System.out.println("Введенная Вами матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int minEl = matrix[0][0], k=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(minEl > matrix[i][j]){
                    minEl = matrix[i][j];
                    k = i;
                }
            }
        }
        System.out.println("Индекс строки с минимальным элементом: " + k);

        int maxEl = matrix[0][0], h=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(minEl < matrix[i][j]){
                    maxEl = matrix[i][j];
                    h = j;
                }
            }
        }
        System.out.println("Индекс столбца с максимальным элементом: " + h);

    }
}