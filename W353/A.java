package LeetCode_Contest.W353;

import java.util.*;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0) {

            int n = sc.nextInt();
            int num = sc.nextInt();

            System.out.println(theMaximumAchievableX(num, n));
        }
    }

    public static int theMaximumAchievableX(int num, int t) {

        return num+t+t;
    }
}