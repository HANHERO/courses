import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicSquare {
    public static void main(String[] args) throws IOException {
        boolean isMagic = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число строк магического квадрата: ");
        int numberOfLine = Integer.parseInt(br.readLine());
        int[][] square = new int[numberOfLine][numberOfLine];
        int[] horizontal = new int[numberOfLine];
        int[] vertical = new int[numberOfLine];
        int[] diagonal = new int[2];
        for (int i = 0; i < numberOfLine; i++) {
            System.out.println("Введите числа " + (i + 1) + " строки");
            for (int j = 0; j < numberOfLine; j++) {
                square[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("Ваш квадрат: ");
        for (int i = 0; i < numberOfLine; i++) {
            System.out.print("[");
            for (int j = 0; j < numberOfLine; j++) {
                System.out.print(" " + square[i][j] + " ");
            }
            System.out.println("]");
        }
        for (int i = 0; i < numberOfLine; i++) {
            diagonal[0] += square[i][i];
            diagonal[1] += square[numberOfLine - i - 1][i];
            for (int j = 0; j < numberOfLine; j++) {
                horizontal[i] += square[i][j];
                vertical[i] += square[j][i];
            }
        }
        for (int i = 0; i < numberOfLine - 1; i++) {
            if (!(horizontal[i] == horizontal[i + 1] && vertical[i] == vertical[i + 1] && diagonal[0] == diagonal[1] &&
                    horizontal[i] == vertical[i] && vertical[i] == diagonal[i])) {
                isMagic = false;
            } else {
                isMagic = true;
            }
        }
        System.out.println(isMagic ? "Является магическим." : "Не является магическим");
    }
}

