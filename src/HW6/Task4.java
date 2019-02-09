package HW6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayList<Integer> mass = new ArrayList<Integer>();
        for (int i = 0; i <s.length() ; i++) {
            String s_int = "";
            char a = s.charAt(i);
            while (a>='0'&&a<='9') {
                s_int += a;
                i++;
                if (i<s.length()){
                    a=s.charAt(i);
                } else break;
            }
            if (!s_int.equals("")){
                mass.add(Integer.parseInt(s_int));
            }
        }
        System.out.println(mass);
    }
}