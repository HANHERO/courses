package HW6;


public class Task7 {
    public static void main(String[] args) {
        String[] s = {"grtg","thrth","fwefww","rtgкекеthr"};
        int a = 0;
        for (int i = 0; i < s.length; i++) {
            if(a < s[i].length()){
                a = s[i].length();
            }

        }
        for (int i = 0; i < s.length; i++) {
            if(a==s[i].length()){
                System.out.println("Самая длинная строка: " + (i+1) + " и равна она "+ a +" элементов");
            }
        }
    }
}