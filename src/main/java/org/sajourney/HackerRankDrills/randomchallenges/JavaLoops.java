package org.sajourney.HackerRankDrills.randomchallenges;

import java.util.Scanner;

public class JavaLoops {
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int sum = a+b;
                for(int j=n;j>=1;j--){
                    b=2*b;
                    System.out.print(sum+" ");
                    sum = sum + b;

                }
                System.out.println(" ");

            }
            in.close();
        }



}
