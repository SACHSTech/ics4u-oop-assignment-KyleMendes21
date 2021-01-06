package SpotifySim;
import SpotifySim.Song;
import java.util.ArrayList;
import java.io.*;

public abstract class Library {

  private String name;
  private int i = 0;
  private ArrayList <Song> Library = new ArrayList<Song>();

  public Library(String newName) {
    name = newName;
  }

  public void setName(String newName) {
    name = newName;
  }

  public ArrayList getSongs() {
    return Songs;
  }

  public ArrayList addSong(Song newSong) {
    Songs.add(i, newSong);
    i = i + 1;
    return Songs
  }
  
  public void removeSong(Song song) {
    Song check;

    for(int ii = 0; ii < Songs.size(); ii++) {
      check = Songs.get(ii);
      if(check == song) {
        Songs.remove(ii);
        break;
      }
    }
  }


 // public abstract ArrayList getSongs();
  
}