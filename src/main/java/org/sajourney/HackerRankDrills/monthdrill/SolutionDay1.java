package org.sajourney.HackerRankDrills.monthdrill;

import java.util.*;


public class SolutionDay1 {
        public static void main(String[] args) {
            int i = 4;
            double d = 4.0;
            String s = "HackerRank ";

            Scanner scan = new Scanner(System.in);

            int j = scan.nextInt();
            double f = scan.nextDouble();
            scan.nextLine();
            String t = scan.nextLine();

            System.out.println(i + j);
            System.out.printf("%.1f%n",(d+f));
            System.out.println(s +""+ t);

            scan.close();
        }


}
