package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conditional {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N >= 2 & N <= 5) {
            System.out.println("Not Weird");
        } else if (N >= 6 & N <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }



        br.close();
    }
}
