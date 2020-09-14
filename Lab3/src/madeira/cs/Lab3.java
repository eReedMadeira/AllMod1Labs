package madeira.cs;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
	 /*
           Instructions For Use
           ------
           Write a program that does the following
           I. Reads the user's age and prints if they're permitted to:
              a. Drive
	          b. Get a tattoo
              c. Run for President of the United States
           II. Reads the user's birthday month and prints:
              a. Their astrological sign
	          b. The season of said month
              c. The number of days in the month
           III. Prints the estimated value of their age in days.
       */

        // Part I code below
System.out.println ("Please enter your age in years.");

Scanner ageScanner = new Scanner(System.in);
int age = ageScanner.nextInt();

if (age < 18) {
    if (age < 16)
        System.out.println ("You're not old enough to drive legally in the US.");
    else
        System.out.println ("In most US states, you can drive legally with a learner's permit or junior license.");

}
else {
   System.out.println ("You're old enough to drive legally in the US if you have a license.");
}

if (age >= 18) {
    System.out.println ("You're old enough to get a tattoo, for better or worse.");
}
else {
    System.out.println ("You're not old enough to get a tattoo, but that's probably for the best.");
}

if (age >= 37) {
    System.out.println ("You're old enough to run for president of the US. (Start planning your campaign now!)");
}
else {
    System.out.println ("In case you were thinking about it, you're not old enough to run for president of the US.");
}
        // Part II code below
System.out.println ("Please enter your birth month.");
Scanner monthScanner = new Scanner (System.in);
String month = monthScanner.nextLine();


if (month.equals("January")) {
    System.out.println("January is in the winter, and it has 31 days.");
    System.out.println("You're either a Capricorn or an Aquarius.");
        }
else if (month.equals("February")) {
    System.out.println ("February is in the winter, and it has 28 days, 29 on leap years.");
    System.out.println ("You're either an Aquarius or a Pisces.");
}
else if (month.equals("March")) {
    System.out.println ("March is in the spring, and it has 31 days.");
    System.out.println ("You're either a Pisces or an Aries.");
}
else if (month.equals ("April")) {
    System.out.println ("April is in the spring, and it has 30 days.");
    System.out.println ("You're either an Aries or a Taurus.");
}
else if (month.equals ("May")) {
    System.out.println ("May is in the spring, and it has 31 days.");
    System.out.println ("You're either a Taurus or a Gemini.");
}
else if (month.equals ("June")) {
    System.out.println ("June is in the summer, and it has 30 days.");
    System.out.println ("You're either a Gemini or a Cancer.");
}
else if (month.equals ("July")) {
    System.out.println ("July is in the summer, and it has 31 days.");
    System.out.println ("You're either a Cancer or a Leo.");
}
else if (month.equals ("August")) {
    System.out.println ("August is in the summer, and it has 31 days.");
    System.out.println ("You're either a Leo or a Virgo.");
}
else if (month.equals ("September")) {
    System.out.println ("September is in the fall, and it has 30 days.");
    System.out.println ("You're either a Virgo or a Libra.");
}
else if (month.equals ("October")) {
    System.out.println ("October is in the fall, and it has 31 days.");
    System.out.println ("You're either a Libra or a Scorpio.");
}
else if (month.equals ("November")) {
    System.out.println ("November is in the fall, and it has 30 days.");
    System.out.println ("You're either a Scorpio or a Sagittarius.");
}
else if (month.equals ("December")) {
    System.out.println ("December is in the winter, and it has 31 days.");
    System.out.println ("You're either a Sagittarius or a Capricorn.");
}
else {
  System.out.println ("Sorry, I didn't recognize that as a month.");
}

        // Part III code below
System.out.println ("Please enter your age in years.");
Scanner ageScanner2 = new Scanner (System.in);
int age2 = ageScanner2.nextInt();

int days = (age2 * 365);

System.out.println ("You have been alive for approximately " +days +" days.");
    }
}
