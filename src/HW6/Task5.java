package HW6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(), s_new = "";
        for (int i = 0; i <s.length() ; i++) {
            if (s_new.indexOf(s.charAt(i))==-1){
                s_new += s.charAt(i);
            }
        }
        System.out.println(s_new);
    }
}