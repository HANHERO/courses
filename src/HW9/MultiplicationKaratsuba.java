package HW9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationKaratsuba {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(karatsubaMultiplication(Long.parseLong(br.readLine()), Long.parseLong(br.readLine())));
    }

    private static long karatsubaMultiplication(long i, long j) {
        if (i < 10 || j < 10) {
            return i * j;
        }

        double n = Long.toString(i).length();

        long a = (long) (i / Math.pow(10, Math.floor(n / 2d)));
        long b = (long) (i % Math.pow(10, Math.floor(n / 2d)));
        long c = (long) (j / Math.pow(10, Math.floor(n / 2d)));
        long d = (long) (j % Math.pow(10, Math.floor(n / 2d)));

        long first = karatsubaMultiplication(a, c);

        long second = karatsubaMultiplication(b, d);

        long third = karatsubaMultiplication(a + b, c + d);

        return (long) (
                (first * Math.pow(10, Math.floor(n / 2d) * 2)) + ((third - second - first)
                        * Math.pow(10, Math.floor(n / 2))) + second);

    }
}