/*
Gebrauchsanweisung
-------
Write a program that does the following
I. Creates a new class named Artist.
a. Artist should have 3 member variables
    (a)i. name
    (a)ii. album
    (a)iii. twitterHandle
    (a)iv. rating
II. Creates 6 methods to set & get each of these values + 1 main method
III. Uses the main method to open the text file artistList.txt
IV. Constructs an Artist for each of the entries in the list & adds them to an Array
a. This will require: reading the size of the list and constructing the list to match
V. Print each artist entry
a. Make sure that you've constructed a rating member too! This is not in the file!
*/

package madeira.cs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Superlab {
    public static void main(String[] args) {
        /*

            Eliza -
            This is super work! You made appropriate use of class methods
            and provided clear instructions to the user. Only suggestions are:
            1. Make more use of loops to cut down on the amount of code
            2. Use dynamic objects (i.e. Arrays of objects) rather than constructing many

            Regardless, you should be proud of this...proper programming!   
        */

        // Creating an instance of Artist for each artist
        Artist billieEilish = new Artist();
        Artist earthGang = new Artist();
        Artist glassAnimals = new Artist();
        Artist theArcticMonkeys = new Artist();
        Artist theStrokes = new Artist();

        try {
            // Creating a new file - the artistlist.txt file with the information in it
            File artistFile = new File ("C:\\Users\\Peter Wallace Local\\Downloads\\artistList.txt");

            // Creating a scanner to read the file
            Scanner fileReader = new Scanner(artistFile);

            // Setting up the integer in the first line of the file as the number of artists
            int numArtists = fileReader.nextInt();
            String temp = fileReader.nextLine();

            // Creating an array with the information in the file
            String [] fullLinesFromFile = new String [numArtists];
            int i = 0;
            while (fileReader.hasNextLine()) {
                fullLinesFromFile[i] = fileReader.nextLine();
                i++;
            }
            fileReader.close();

            // Setting the artist names, albums, and twitter handles using the information from the file
            String [] firstArtist = fullLinesFromFile[0].split(",");
            billieEilish.setArtistName(firstArtist[0]);
            billieEilish.setAlbum (firstArtist[1]);
            billieEilish.setTwitterHandle(firstArtist[2]);

            // (Repeating for the other four artists)
            String [] secondArtist = fullLinesFromFile[1].split(",");
            earthGang.setArtistName(secondArtist[0]);
            earthGang.setAlbum (secondArtist[1]);
            earthGang.setTwitterHandle(secondArtist[2]);

            String [] thirdArtist = fullLinesFromFile[2].split(",");
            glassAnimals.setArtistName(thirdArtist[0]);
            glassAnimals.setAlbum (thirdArtist[1]);
            glassAnimals.setTwitterHandle(thirdArtist[2]);

            String [] fourthArtist = fullLinesFromFile[3].split(",");
            theArcticMonkeys.setArtistName(fourthArtist[0]);
            theArcticMonkeys.setAlbum(fourthArtist[1]);
            theArcticMonkeys.setTwitterHandle(fourthArtist[2]);

            String [] fifthArtist = fullLinesFromFile[4].split(",");
            theStrokes.setArtistName(fifthArtist[0]);
            theStrokes.setAlbum(fifthArtist[1]);
            theStrokes.setTwitterHandle(fifthArtist[2]);




            // Using the methods I've created in the Artist class to get the names, albums, and twitter handles
            System.out.println ("Name: " +billieEilish.getArtistName());
            System.out.println ("Album: " +billieEilish.getAlbum());
            System.out.println ("Twitter Handle: " +billieEilish.getTwitterHandle());
            // Creating a scanner so that the user can rate the artist
            System.out.println ("Please rate " +firstArtist[0] +" out of ten.");
            Scanner billieScanner = new Scanner (System.in);
            // Setting the rating as the input
            billieEilish.setRating (billieScanner.nextInt());
            // Printing the user rating using the number the user has entered
            System.out.println ("User rating: " +billieEilish.getRating());


            //(Repeat for the other four artists)
            System.out.println ("Name: " +earthGang.getArtistName());
            System.out.println ("Album: " +earthGang.getAlbum());
            System.out.println ("Twitter Handle: " +earthGang.getTwitterHandle());
            System.out.println ("Please rate " +secondArtist[0] +" out of ten.");
            Scanner earthScanner = new Scanner (System.in);
            earthGang.setRating (earthScanner.nextInt());
            System.out.println ("User rating: " +earthGang.getRating());


            System.out.println ("Name: " +glassAnimals.getArtistName());
            System.out.println ("Album: " +glassAnimals.getAlbum());
            System.out.println ("Twitter Handle: " +glassAnimals.getTwitterHandle());
            System.out.println ("Please rate " +thirdArtist[0] +" out of ten.");
            Scanner glassScanner = new Scanner (System.in);
            glassAnimals.setRating (glassScanner.nextInt());
            System.out.println ("User rating: " +glassAnimals.getRating());


            System.out.println ("Name: " +theArcticMonkeys.getArtistName());
            System.out.println ("Album: " +theArcticMonkeys.getAlbum());
            System.out.println ("Twitter Handle: " +theArcticMonkeys.getTwitterHandle());
            System.out.println ("Please rate " +fourthArtist[0] +" out of ten.");
            Scanner arcticScanner = new Scanner (System.in);
            theArcticMonkeys.setRating (arcticScanner.nextInt());
            System.out.println ("User rating: " +theArcticMonkeys.getRating());


            System.out.println ("Name: " +theStrokes.getArtistName());
            System.out.println ("Album: " +theStrokes.getArtistName());
            System.out.println ("Twitter Handle: " +theStrokes.getTwitterHandle());
            System.out.println ("Please rate " +fifthArtist[0] +" out of ten.");
            Scanner strokesScanner = new Scanner (System.in);
            theStrokes.setRating (strokesScanner.nextInt());
            System.out.println ("User rating: " +theStrokes.getRating());
        }

        // Catch statement in case the program can't find the file
        catch (FileNotFoundException e) {
            System.out.println ("An error occurred.");
            e.printStackTrace();
        }


// End of class Superlab
    }
}

// New class Artist
class Artist {
    // Declaring name, album, twitterHandle, and rating
    String name;
    String album;
    String twitterHandle;
    int rating;
    /*
    Base values for name, album, twitterHandle, and rating, so that it's easy to tell if there's a mistake in the code
    because if there is, the values will print as N/A or 0 instead of the set value.
     */
    public Artist () {
        name = "N/A";
        album = "N/A";
        twitterHandle = "N/A";
        rating = 0;
    }
    // Methods to set and get the artist name
    public void setArtistName (String newName) {
        name = newName;
    }
    public String getArtistName () {
        return name;
    }
    // Repeat for album, twitterHandle, and rating
    public void setAlbum (String newAlbum) {
        album = newAlbum;
    }
    public String getAlbum () {
        return album;
    }
    public void setTwitterHandle (String newTwitterHandle) {
        twitterHandle = newTwitterHandle;
    }
    public String getTwitterHandle () {
        return twitterHandle;
    }
    public void setRating (int newRating) {
        rating = newRating;
    }
    public int getRating () {
        return rating;
    }
}