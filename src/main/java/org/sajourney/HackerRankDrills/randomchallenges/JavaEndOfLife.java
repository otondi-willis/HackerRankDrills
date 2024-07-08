package org.sajourney.HackerRankDrills.randomchallenges;

import java.util.Scanner;

public class JavaEndOfLife {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i=1;

        while(scan.hasNext()){
            System.out.println(i + " " + scan.nextLine());
            i++;
        }


    }
}
