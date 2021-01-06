package SpotifySim;
import java.util.ArrayList;
import java.io.*;
import SpotifySim.Playlist;
import SpotifySim.Song;

public class Favourites extends Albums {
  private ArrayList <Song> Songst = new ArrayList <Song> ();

  public Favourites() {
    super("Favourites");
  }

  public void addSong(Song newSong) {
    super.addSong(newSong);
  }

  public void removeSong(Song song) {
    Song Status;

    for(int i = 0; i < Songst.size(); i++) {
      Status = Songst.get(i);
      if(Status == song) {
        Songst.remove(i);
        break;
      }
    }
  }

  public String getName() {
    return "Favourites";
  }

  public ArrayList getSongs() {
    return super.getSongs();
  }
}