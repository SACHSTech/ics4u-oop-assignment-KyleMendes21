package SpotifySim;
import SpotifySim.Song;
import java.util.ArrayList;
import java.io.*;

public abstract class Library {

  // instance variables
  private String name;
  private int i = 0;
  private ArrayList <Song> Library = new ArrayList<Song>();

  /** 
  * Library constructor. Creates an instance of the object for Library. 
  *
  * @param name - a string that shows the name of the song
  */
  public Library(String setName) {
    name = setName;
  }

  /** 
  * Getter method that returns the name of the song 
  * 
  * @return name
  */
  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  /** 
  * Getter method that returns the library array list 
  * 
  * @return Library array list
  */
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
}