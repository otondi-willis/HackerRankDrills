package org.sajourney.HackerRankDrills.randomchallenges;

import java.util.Scanner;

public class Int2String {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if ((n>=-100) && (n <=100)){
            String s = Integer.toString(n);
            System.out.print("Good job");
        } else{
            System.out.print("Wrong answer");
        }
    }



}
