package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PascalsTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число строк треугольника: ");
        int n = Integer.parseInt(br.readLine());
        int[][] triangle = new int[n][n];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][0] = 1;
                triangle[i][triangle[i].length - 1] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (!(triangle[i][j] == 1)) {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }
        for (int x = 0; x < triangle.length; x++) {
            for (int y = 0; y < triangle[x].length; y++) {
                System.out.print(triangle[x][y] + " ");
            }
            System.out.println();
        }
    }
}