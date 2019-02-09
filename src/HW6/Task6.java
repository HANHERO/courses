package HW6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String ps = br.readLine();
        String nps = br.readLine();
        s = s.replaceAll(ps, nps);
        System.out.println(s);
    }
}