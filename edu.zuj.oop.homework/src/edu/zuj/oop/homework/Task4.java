
package edu.zuj.oop.homework;

import java.util.Scanner;


public class Task4 {
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("pleas enter how many * you want to drow your triangle");
        int n = s.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
