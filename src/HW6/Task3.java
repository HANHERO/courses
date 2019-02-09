package HW6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testString = br.readLine();
        boolean isPalindrome = true;
        testString = testString.replaceAll(" ", "");
        for (int i = 0; i < testString.length(); i++) {
            if (!(testString.charAt(i) == testString.charAt(testString.length() - 1 - i))) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "ЭТО ПОЛИНДРОМ" : "ЭТО НЕ ПОЛИНДРОМ");
    }
}