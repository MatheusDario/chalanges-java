package application;

import java.util.Scanner;

public class LoopsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();

        for(int i=0; i<Q; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();
            int calc = A;
            for(int j=0; j<N; j++) {
                calc+=(Math.pow(2,j)*B);
                System.out.print(calc+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
