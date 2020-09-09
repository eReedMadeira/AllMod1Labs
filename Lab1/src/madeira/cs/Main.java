package madeira.cs;

public class Main {

    public static void main(String[] args) {

               /*
         Instructions For Use
         ------
         Write a program that does the following
         I. Declare and instantiate three strings
            a. Print each string separately
         II. Re-assign a new value to the strings you declared
            a. Print the new strings separately
         III. Visit the link in the README.md section
            a. Find three string methods you like
            b. Use them however you so choose
       */

// Part I code below

                String Aurora;
                Aurora = "Hello, world.";
                System.out.println (Aurora);

                String Vivian;
                Vivian = "I am a computer.";
                System.out.println (Vivian);

                String Oliver;
                Oliver = "It might seem like I'm talking to you, but it's not really me.";
                System.out.println (Oliver);


// Part II code below

                Aurora = "The only reason I know how to say this is because Eliza wrote the code for it.";
                System.out.println (Aurora);

                Vivian = "Anyways, thank you for your time and have a nice day.";
                System.out.println (Vivian);

                Oliver = "Now, let's try some string methods!";
                System.out.println (Oliver);

// Part III code below

                Aurora.compareTo(Vivian);
                System.out.println(Aurora.compareTo(Vivian));

                Vivian.compareTo(Aurora);
                System.out.println(Vivian.compareTo(Aurora));

                Aurora.compareTo(Oliver);
                System.out.println(Aurora.compareTo(Oliver));

                Oliver.compareTo(Aurora);
                System.out.println(Oliver.compareTo(Aurora));

                Vivian.compareTo(Oliver);
                System.out.println(Vivian.compareTo(Oliver));

                Oliver.compareTo(Vivian);
                System.out.println (Oliver.compareTo(Vivian));


                Oliver.startsWith("Now");
                System.out.println (Oliver.startsWith("Now"));

                Vivian.startsWith ("Anyways, thank you");
                System.out.println (Vivian.startsWith ("Anyways, thank you"));

                Aurora.startsWith ("code for it.");
                System.out.println (Aurora.startsWith ("code for it."));


                Oliver.endsWith ("Now");
                System.out.println (Oliver.endsWith ("Now"));

                Vivian.endsWith ("Anyways, thank you");
                System.out.println (Vivian.endsWith ("Anyways, thank you"));

                Aurora.endsWith ("code for it.");
                System.out.println (Aurora.endsWith ("code for it."));


                Oliver.indexOf ('m');
                System.out.println ("The index of m in string Oliver is " +Oliver.indexOf ('m'));

                Vivian.indexOf ('m');
                System.out.println ("The index of m in string Vivian is " +Vivian.indexOf ('m'));

                Aurora.indexOf ('m');
                System.out.println ("The index of m in string Aurora is " +Aurora.indexOf ('m'));
    }
}
