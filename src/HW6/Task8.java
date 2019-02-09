package HW6;


public class Task8 {
    public static void main(String[] args) {
        String s = "ssa ewhg bgb bfdbvcccc";
        String[] slovaStroki = s.split(" ");
        int max = 0;
        for (int i = 0; i < slovaStroki.length; i++) {
            if (max < slovaStroki[i].length()) {
                max = slovaStroki[i].length();
            }
        }
        for (int i = 0; i < slovaStroki.length; i++) {
            if (max == slovaStroki[i].length()) {
                System.out.println(slovaStroki[i]);
                break;
            }
        }
    }
}