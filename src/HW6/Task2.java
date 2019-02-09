package HW6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testWord = br.readLine();
        boolean isIdentifier = true;

        if (testWord.charAt(0) >= 'a' && testWord.charAt(0) <= 'z'
                || testWord.charAt(0) >= 'A' && testWord.charAt(0) <= 'Z' || testWord.charAt(0) == '_') {

            for (int i = 1; i < testWord.length(); i++) {
                if (!(testWord.charAt(i) >= 'a' && testWord.charAt(i) <= 'z'
                        || testWord.charAt(i) >= 'A' && testWord.charAt(i) <= 'Z' || testWord.charAt(i) == '_'
                        || testWord.charAt(i) >= '0' && testWord.charAt(i) <= '9')) {
                    isIdentifier = false;
                }
            }
        } else {
            isIdentifier = false;
        }
        System.out.println(testWord + " - " + (isIdentifier ? "является идентификатором" : "не является идентификатором"));
    }
}