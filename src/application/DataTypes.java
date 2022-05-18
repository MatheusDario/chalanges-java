package application;

import java.util.Locale;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner sc = new Scanner(System.in);

        int i2 = sc.nextInt();
        double d2 = sc.nextDouble();
        sc.nextLine();
        String s2 = sc.nextLine();


        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s.concat(s2));

        sc.close();
    }
}
