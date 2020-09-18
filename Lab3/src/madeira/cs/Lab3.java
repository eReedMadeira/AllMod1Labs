package madeira.cs;
// eReed
import java.util.Scanner;

public class Lab3 {

    /*
        Grade and comments below
        ------------------------
        Some notes of improvement:
            - I would try to check for upper/lowercase versions of the month
            - You could ask the user for the current date to eliminate the large number of
            cases in part III
        All in all: excellent. Love the comments and attention to detail

        10/10
        
    */

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

// Creating a scanner for the user to input their age and declaring the input as an integer
Scanner ageScanner = new Scanner(System.in);
int age = ageScanner.nextInt();

// Checking if the age is over 16 to see if they can drive with a permit, and over 18 to see if they can get a license.
if (age < 18) {
    if (age < 16)
        System.out.println ("You're not old enough to drive legally in the US.");
    else
        System.out.println ("In most US states, you can drive legally with a learner's permit or junior license.");
}
else {
   System.out.println ("You're old enough to drive legally in the US if you have a license.");
}

// Checking if their age is over 18 to see if they can get a tattoo.
if (age >= 18) {
    System.out.println ("You're old enough to get a tattoo, for better or worse.");
}
else {
    System.out.println ("You're not old enough to get a tattoo, but that's probably for the best.");
}


// Checking if their age is over 37 to see if they can run for president.
if (age >= 37) {
    System.out.println ("You're old enough to run for president of the US. (Start planning your campaign now!)");
}
else {
    System.out.println ("In case you were thinking about it, you're not old enough to run for president of the US.");
}

        // Part II code below
// A scanner for the user to enter their birth month.
System.out.println ("Please enter your birth month.");
Scanner monthScanner = new Scanner (System.in);
String month = monthScanner.nextLine();

// And here we have a group of if/else if/else statements based on what their birth month is.
// For each month, there is a statement with its season, number of days, and possible astrological signs.
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

// Else statement just in case the user enters input that isn't a month.
else {
  System.out.println ("Sorry, I didn't recognize that as a month.");
}

        // Part III code below


// Multiplying the value of their age in years by 365 to get the number of days for the years leading up to this one.
int days1 = (age * 365);

System.out.println ("Please enter the day of the month you were born.");
// Scanner for the user to enter their birth day.
Scanner dayScanner = new Scanner (System.in);
// Declaring the input as an integer.
int birthday = dayScanner.nextInt();

/*
This series of if/else if/else  statements specifies what to print for each month. For dates that have passed,
it takes the amount of days that have passed in the years leading up to this one (days1) and adds it to the number of
days that have passed since their most recent birthday. This number of days is created by taking the number of days that
have already passed this year and subtracting the number of days that passed before their birthday this year.
 */
// Please keep in mind that this code was written on September 16, 2020, and will be slightly out of date.
if (month.equals("January") && birthday <= 31) {
    System.out.println ("You have been alive for about "+(days1 + 260 - birthday) +" days.");
}
else if (month.equals("February") && birthday <= 29) {
    System.out.println ("You have been alive for about " +(days1 + 260 - birthday - 31) +" days.");
}
else if (month.equals ("March") && birthday <= 31) {
    System.out.println ("You have been alive for about " +(days1 + 260 - birthday - 60) +" days.");
}
else if (month.equals ("April") && birthday <= 30) {
    System.out.println ("You have been alive for about " +(days1 + 260 - birthday - 91) +" days");
}
else if (month.equals ("May") && birthday <= 31) {
    System.out.println ("You have been alive for about " +(days1 + 260 - birthday - 121) +" days.");
}
else if (month.equals ("June") && birthday <= 30) {
    System.out.println ("You have been alive for about " +(days1 + 260 - birthday - 152) +" days.");
}
else if (month.equals ("July") && birthday <= 31) {
    System.out.println ("You have been alive for about " +(days1 + 260 - birthday - 182) +" days.");
}
else if (month.equals ("August") && birthday <= 31) {
    System.out.println ("You have been alive for about " +(days1 + 260 - birthday - 213) +" days.");
}
/*
September is weird because we're in it right now, so it transitions in the middle of the month from dates that have
already happened to dates that have not. In the beginning of the month, we use the same formula as before. For
today's date, we simply add days1 to the amount of days that have already passed in 2020. For days after today in
September, we add days1 to 365 (a whole year) and then subtract birthday - 16 to subtract the number of days that will
pass before their birthday.
 */
else if (month.equals ("September") && birthday <= 30) {
    if (birthday < 16) {
        System.out.println ("You have been alive for about " +(days1 + 365 - birthday - 244) +" days.");
    }
    else if (birthday == 16) {
        System.out.println ("Happy birthday! You have been alive for about " +(days1 + 260) +" days.");
    }
    else {
        System.out.println ("You have been alive for about " +(days1 + 365 + (birthday - 16)) +" days.");
    }
/*
In October, we begin with dates that have not happened yet, and we have to change our formula to find the amount of
days the user has been alive. We have to take days1 and add it to the number of days that have passed since their most
recent birthday. (We can get that number of days by adding the number of days that has passed in 2020 to the number
of days between their last birthday and the beginning of 2020.)
 */
}
else if (month.equals ("October") && birthday <= 31) {
    System.out.println ("You have been alive for about " +(days1 + 260 + (92 - birthday)) +" days.");
}
else if (month.equals ("November") && birthday <= 30) {
    System.out.println ("You have been alive for about " +(days1 + 260 + (61 - birthday)) +" days.");
}
else if (month.equals ("December") && birthday <= 31) {
    System.out.println ("You have been alive for about " +(days1 + 260 + (31 - birthday)) +" days.");
}
// Else statement just in case the user enters input that isn't a month, or a birthday that doesn't exist.
else {
    System.out.println ("Sorry, it looks like you entered invalid input.");
}




    }
}
