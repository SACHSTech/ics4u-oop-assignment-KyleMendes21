package SpotifySim;
import java.io.*;
import java.util.ArrayList;
import SpotifySim.Library;
import SpotifySim.Albums;
import SpotifySim.Playlist;
//import SpotifySim.Favourites;

public class Spotify {
  public static void main(String[] args) throws IOException {
     BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

     String inputUser;
     String inputPass;
     String Menuchoice;

    //ArrayList <Song> Songst = new ArrayList <Song>();
    System.out.println();
    System.out.println(" * * *  * * *  * * *  * * *  * * *  * * *  *   *");
    System.out.println(" *      *   *  *   *    *      *    *      *   *");
    System.out.println(" *      *   *  *   *    *      *    *      *   *");
    System.out.println(" * * *  * * *  *   *    *      *    * *    * * *");
    System.out.println("     *  *      *   *    *      *    *          *");
    System.out.println("     *  *      *   *    *      *    *          *");
    System.out.println(" * * *  *      * * *    *    * * *  *          *");
    System.out.println();

    System.out.println("Please enter your username and password to access your account.");
    System.out.println("Username: ");
    inputUser = keyboard.readLine();
    System.out.println("Password: ");
    inputPass = keyboard.readLine();

    User usercheck = new User(inputUser, intputPass);
    
    /*
    if (usercheck = user1) {
      System.out.println("ENTER");
    } else {
      System.out.println("WRONG");
    }
    */


    User user1 = new User("KyleM21", "Hello123");
    System.out.println(user1);
    System.out.println();
    
    // Songs
    Song Spirits = new Song("Spirits", "Strumbellas", "2016", "New", "NONE", true);
    Song Selfish = new Song("Selfish", "Madison Beer", "February 2020", "Chilling", "NONE", false);
    Song Easy = new Song("Easy", "Camilla Cabello", "October 2019", "New", "NONE", false);
    Song Lose = new Song("Lose you to love me", "Selena Gomez", "October 2019", "New", "NONE", false);
    Song Youbroke = new Song("You broke me first", "Tate McRae", "April 2020", "New", "NONE", false);
    Song Stuck = new Song("Stuck with U", "Ariana Grande ft Justin Bieber", "May 2020", "Chilling", "NONE", false);
    Song Mad = new Song("Mad at Disney", "Salem ilese", "July 2020", "Cool Stuff", "NONE", false);
    Song ThisCity = new Song("This City", "Sam Fischer", "January 2018", "Cool Stuff", "NONE", false);

    // Album Songs
    Song Cool = new Song("Cool", "Dua Lipa", "March 2020", "NONE", "Future Nostalgia", false);
    Song Physical = new Song("Physical", "Dua Lipa", "March 2020", "NONE", "Future Nostalgia", false);
    Song Hallucinate = new Song("Hallucinate", "Dua Lipa", "March 2020", "NONE", "Future Nostalgia", false);

    // Create album and add songs
    Albums Future = new Albums("Future Nostalgia", "Dua Lipa");

    Future.addSong(Cool);
    Future.addSong(Physical);
    Future.addSong(Hallucinate);

    // Create Playlist    
    Playlist New = new Playlist("New");
    Playlist Chilling = new Playlist("Chilling");
    Playlist CoolStuff = new Playlist("Cool Stuff");

    // Print out songs
    System.out.println("YOUR LIBRARY");
    System.out.println("*************************************************************");
    System.out.println(Spirits);
    System.out.println(Selfish);
    System.out.println(Easy);
    System.out.println(Lose);
    System.out.println(Youbroke);
    System.out.println(Stuck);
    System.out.println(Mad);
    System.out.println(ThisCity);
    System.out.println(Cool);
    System.out.println(Physical);
    System.out.println(Hallucinate);
    System.out.println();
    
    // Add Songs to playlist
    New.addSong(Spirits);
    Chilling.addSong(Selfish);
    New.addSong(Easy);
    New.addSong(Lose);
    New.addSong(Youbroke);
    Chilling.addSong(Stuck);
    CoolStuff.addSong(Mad);
    CoolStuff.addSong(ThisCity);

    // Print Albums and Playlist
    System.out.println("ALBUM FUTURE");
    System.out.println("*************************************************************");
    System.out.println(Future);
    System.out.println();
    System.out.println("PLAYLIST NEW");
    System.out.println("*************************************************************");
    System.out.println(New);
    System.out.println();
    System.out.println("PLAYLIST CHILLING");
    System.out.println("*************************************************************");
    System.out.println(Chilling);
    System.out.println();
    System.out.println("PLAYLIST COOLSTUFF");
    System.out.println("*************************************************************");
    System.out.println(CoolStuff);
    System.out.println();

    System.out.println("PLAYLIST NEW UPDATED");
    System.out.println("*************************************************************");
    New.removeSong(Lose);
    System.out.println(New);
    System.out.println();

    System.out.println("Thank You for visiting spotify!");
    

  }
}
