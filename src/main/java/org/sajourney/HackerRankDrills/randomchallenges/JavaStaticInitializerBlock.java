package org.sajourney.HackerRankDrills.randomchallenges;
import java.io.*;
import java.util.*;

public class JavaStaticInitializerBlock {


        static int B,H;
        static{
            Scanner scan = new Scanner(System.in);
            B = scan.nextInt();
            H = scan.nextInt();
            scan.close();
        }

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            if((B>=-100 && B<=100) && (H>=-100 && H<=100) ){
                if ((B<=0) || (H<=0) ){
                    System.out.print("java.lang.Exception: Breadth and height must be positive");
                } else{
                    int area=B*H;
                    System.out.print(area);
                }


            }


    }

}
