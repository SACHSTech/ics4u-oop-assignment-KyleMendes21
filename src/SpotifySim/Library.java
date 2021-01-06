package SpotifySim;
import SpotifySim.Song;
import java.util.ArrayList;
import java.io.*;

public abstract class Library {

  private String name;
  private int i = 0;
  private ArrayList <Song> Library = new ArrayList<Song>();

  public Library(String setName) {
    name = setName;
  }

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  public ArrayList getLibrary() {
    return Library;
  }

  public ArrayList addSong(Song newSong) {
    Library.add(i, newSong);
    i = i + 1;
    return Library;
  }
  
  public void removeSong(Song song) {
    Song check;

    for(int ii = 0; ii < Library.size(); ii++) {
      check = Library.get(ii);
      if(check == song) {
        Library.remove(ii);
        break;
      }
    }
  }


 // public abstract ArrayList getSongs();
  
}