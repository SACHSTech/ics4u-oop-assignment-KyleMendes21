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
     int choice = 50004040; 
     String choice2;
     int iii = 0;
     int iiii = 0;

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
    System.out.print("Username: ");
    inputUser = keyboard.readLine();
    System.out.print("Password: ");
    inputPass = keyboard.readLine();

    // Songs
    Song Spirits = new Song("Spirits", "Strumbellas", "2016", "New", "NONE");
    Song Selfish = new Song("Selfish", "Madison Beer", "February 2020", "Chilling", "NONE");
    Song Easy = new Song("Easy", "Camilla Cabello", "October 2019", "New", "NONE");
    Song Lose = new Song("Lose you to love me", "Selena Gomez", "October 2019", "New", "NONE");
    Song Youbroke = new Song("You broke me first", "Tate McRae", "April 2020", "New", "NONE");
    Song Stuck = new Song("Stuck with U", "Ariana Grande ft Justin Bieber", "May 2020", "Chilling", "NONE");
    Song Mad = new Song("Mad at Disney", "Salem ilese", "July 2020", "Cool Stuff", "NONE");
    Song ThisCity = new Song("This City", "Sam Fischer", "January 2018", "Cool Stuff", "NONE");

    // Album Songs
    Song Cool = new Song("Cool", "Dua Lipa", "March 2020", "NONE", "Future Nostalgia");
    Song Physical = new Song("Physical", "Dua Lipa", "March 2020", "NONE", "Future Nostalgia");
    Song Hallucinate = new Song("Hallucinate", "Dua Lipa", "March 2020", "NONE", "Future Nostalgia");

    // Episodes
    Episode ep1 = new Episode("1 Million from snapchat", "View with David Dobrik", "May 2020", "Podcast", "NONE");
    Episode ep2 = new Episode("Pizza company", "View with David Dobrik", "June 2020", "Podcast", "NONE");
    Episode ep3 = new Episode("Doubling the bank", "View with David Dobrik", "April 2020", "Podcast", "NONE");
    Episode ep4 = new Episode("Life with me", "View with David Dobrik", "September 2020", "Podcast", "NONE");

    // Create album and add songs
    Albums Future = new Albums("Future Nostalgia", "Dua Lipa");

    Future.addSong(Cool);
    Future.addSong(Physical);
    Future.addSong(Hallucinate);

    // Create Playlist    
    Playlist New = new Playlist("New");
    Playlist Chilling = new Playlist("Chilling");
    Playlist CoolStuff = new Playlist("Cool Stuff");
    
    // Add Songs to playlist
    New.addSong(Spirits);
    Chilling.addSong(Selfish);
    New.addSong(Easy);
    New.addSong(Lose);
    New.addSong(Youbroke);
    Chilling.addSong(Stuck);
    CoolStuff.addSong(Mad);
    CoolStuff.addSong(ThisCity);


    while (choice != 5) {
      if (inputUser.equals("KyleM21") && inputPass.equals("Hello123")) {

        User user1 = new User("KyleM21", "Hello123");
        if (iiii == 1) {
          System.out.println(user1);
          System.out.println();
          iiii = iiii + 1;
        }

        System.out.println("Main Menu");
        System.out.println("Please choose from the following:");
        System.out.println("1 - View your library");
        System.out.println("2 - View your albums  ");
        System.out.println("3 - View your playlists");
        System.out.println("4 - View your podcasts");
        System.out.println("5 - Log off");
        choice = Integer.parseInt(keyboard.readLine());

        if(choice == 1) {
          System.out.println("YOUR LIBRARY");
          System.out.println ("*************************************************************");
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
        } 
        else if (choice == 2) {
          System.out.println("ALBUM FUTURE");
          System.out.println("*************************************************************");
          System.out.println(Future);
          System.out.println();
        } 
        else if (choice == 3) {
          System.out.println("Please choose a playlist from the following:");
          System.out.println("1 - New");
          System.out.println("2 - Chilling ");
          System.out.println("3 - Cool Stuff");
          choice2 = keyboard.readLine();

          if (choice2.equals("1")) {
            System.out.println("PLAYLIST NEW");
            System.out.println("*************************************************************");
            System.out.println(New);
            System.out.println();
          } 
          else if (choice2.equals("2")) {
            System.out.println("PLAYLIST CHILLING");
            System.out.println("*************************************************************");
            System.out.println(Chilling);
            System.out.println();
          } 
          else if (choice2.equals("3")) {
            System.out.println("PLAYLIST COOL STUFF");
            System.out.println("*************************************************************");
            System.out.println(CoolStuff);
            System.out.println();
          } 
          else {
            System.out.println("Invalid Option");
          }
        } 
        else if (choice == 4) {
          System.out.println("YOUR PODCASTS");
          System.out.println("*************************************************************");
          System.out.println(ep1);
          System.out.println(ep2);
          System.out.println(ep3);
          System.out.println(ep4);
          System.out.println();
        }
        else if (choice == 5) {
          System.out.println("Thank you for using spotify!");
        } 
        else {
          System.out.println("Invalid Option");
        }

      } 
    
      else {
        System.out.println("INVALID USERNAME/PASSWORD PLEASE TRY AGAIN");
        iii = iii + 1;
        if(iii == 5) {
          System.out.println("YOU HAVE ATTEMPTED TO MANY TIMES. PLEASE EXIT AND TRY AGAIN LATER");
        }
      }
    }
    
    System.out.println("Logging off. Nice seeing you 666!");

/*
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
   */ 

  }

}
