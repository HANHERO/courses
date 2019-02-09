package HW6;

import java.util.Random;

public class Task1 {
    public static void main(String[] args){
        Random random = new Random();
        String stroka = "оно работает";
        String newStroka = "";
        int numberOfWords = 1 + random.nextInt(10);
        for (int i = 0; i < numberOfWords; i++) {
            int lengthOfWord = 2 + random.nextInt(7 - 2 + 1);
            int j = 0;
            while (j < lengthOfWord) {
                int let = random.nextInt(stroka.length());
                if (stroka.charAt(let) != ' ') {
                    newStroka = newStroka + stroka.charAt(let);
                    j ++;
                }
            }
            newStroka += ' ';
        }
        System.out.println(newStroka);
    }
}