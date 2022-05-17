package application;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int controller = 1;
           for(int i=1; 1<=num; i++) {
               while (controller <= 10) {
                   System.out.println(num + " X " + controller +" = " + num * controller);
                   controller ++;
               }
           }

           sc.close();
    }
}
