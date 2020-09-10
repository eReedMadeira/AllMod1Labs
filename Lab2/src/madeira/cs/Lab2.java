
package madeira.cs;

import java.util.Scanner;

/**
 * Author: Eliza_Reed
 * Date: 9/8/2020
 **/
public class Lab2 {
    public static void main(String[] args) {
        /*
            Instructions for Use
            ----
            Write a program that does the following
                I. Read your name
                    a. Print a greeting
                II. Read your favorite artist or author
                    a. Print your favorite song or book by that artist
                III. Read your age
                    a. Print the number of days you've been alive (an estimate is fine)
         */
        // Part I code below
        System.out.println ("Please enter your name.");
        Scanner myScanner = new Scanner(System.in);
        System.out.println ("Hello and welcome to my lab, " +myScanner.nextLine() +".");

        // Part II code below
        System.out.println ("Please enter my favorite singer to see my favorite song by that singer.");
        Scanner myScanner2 = new Scanner (System.in);
        String ScannerString = myScanner2.nextLine();
        System.out.println ("The Last Great American Dynasty is my favorite song by " +ScannerString +".");

        // Part III code below
        System.out.println ("Please enter my age in years to find out how many days I have been alive.");
        Scanner myScanner3 = new Scanner (System.in);
        String ScannerString2 = myScanner3.nextLine();
        System.out.println ("I am " +ScannerString2+ " years old and I have been alive for approximately 5,885 days." );

    }
}

