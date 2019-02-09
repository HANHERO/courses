package HW6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int calc_a = 0;
        int calc_A = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                calc_a++;
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                calc_A++;
            }
        }
        System.out.println("Заглавных букв - "+calc_A);
        System.out.println("Строчных букв - "+ calc_a);
    }
}