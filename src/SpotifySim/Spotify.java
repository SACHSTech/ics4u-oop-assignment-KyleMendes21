package SpotifySim;
import java.io.*;
import java.util.ArrayList;
import SpotifySim.Songs;
import SpotifySim.Albums;
import SpotifySim.Playlist;
import SpotifySim.Favourites;

public class Spotify {
  public static void main(String[] args) throws IOException {
    //ArrayList <Song> Songst = new ArrayList <Song>();
    User user1 = new User("KyleM21", "Hello123");
    System.out.println(user1);

    Song Spirits = new Song("Spirits", "Strumbellas", "Mays 2020", "New", true);
    Song Selfish = new Song("Selfish", "Madison Beer", "June 2020", "Chilling", false);
    Song Easy = new Song("Easy", "Camilla Cabello", "August", "New", false);
    Song Lose = new Song("Lose you to love me", "Selena Gomez", "June", "New", false);
    Song Youbroke = new Song("You broke me first", "Tate McRae", "May", "New", false);
    Song Stuck = new Song("Stuck with U", "Ariana Grande ft Justin Bieber", "May", "Chilling", false);
    Song Mad = new Song("Mad at Disney", "Salem ilese", "May", "Cool Stuff", false);
    Song ThisCity = new Song("This City", "Sam Fischer", "June", "Cool Stuff", false);

    Albums New = new Albums("New");
    Albums Chilling = new Albums("Chilling");
    Albums CoolStuff = new Albums("Cool Stuff");

    System.out.println(Spirits);
    System.out.println(Selfish);
    System.out.println(Easy);
    System.out.println(Lose);
    System.out.println(Youbroke);
    System.out.println(Stuck);
    System.out.println(Mad);
    System.out.println(ThisCity);
    
    New.addSong(Spirits);
    Chilling.addSong(Selfish);
    New.addSong(Easy);
    New.addSong(Lose);
    New.addSong(Youbroke);
    Chilling.addSong(Stuck);
    CoolStuff.addSong(Mad);
    CoolStuff.addSong(ThisCity);

    System.out.println(New);
    System.out.println(Chilling);
    System.out.println(CoolStuff);


  }
}
