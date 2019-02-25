package HW2;

public class Polinom {
    public static void main(String[] args) {
        boolean firstelem = false;
        System.out.print("f(x1,x2,x3) = ");
        String[] forOut = {"1", "x3", "x2", "x2x3", "x1", "x1x3", "x1x2", "x1x2x3"};
        int[][] triangle = new int[8][8];
        triangle[0] = new int[]{0, 0, 0, 1, 0, 1, 1, 1};
        for (int i = 0; i < triangle.length - 1; i++) {
            for (int j = 0; j < triangle[i].length - 1; j++) {
                triangle[i + 1][j] = triangle[i][j] ^ triangle[i][j + 1];
            }
        }
        for (int i = 0; i < 8; i++) {
            if (triangle[i][0] == 1) {
                if (firstelem) {
                    System.out.print(" ⊕ ");
                }
                System.out.print(forOut[i]);
                firstelem = true;
            }
        }
    }
}
