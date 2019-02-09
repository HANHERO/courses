package HW6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] mass = s.split(" ");
        for (int i = 0; i < mass.length ; i++) {
            System.out.print(mass[i]);
            if(!mass[i].equals("")) {
                System.out.print(" ");
            }
        }
    }
}