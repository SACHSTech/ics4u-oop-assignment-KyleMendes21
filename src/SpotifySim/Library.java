package SpotifySim;
import SpotifySim.Song;
import java.util.ArrayList;
import java.io.*;

public class Library {

  // instance variables
  private String name;
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

  /**
  * Setter method that will give newName value
  *
  * @param newName name of the song
  */
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

  /**
  * Adds song to array library list
  *
  * @param newSong the name of the instance of the Song class that will be added
  */
  public ArrayList addSong(Song newSong) {
    Library.add(newSong);
    return Library;
  }
  
  /**
  * Removes song from array library list
  *
  * @param song the name of the instance of the Song class that will be removed
  */
  public void removeSong(Song song) {

    for(int ii = 0; ii < Library.size(); ii++) {
      if(Library.get(ii).equals(song)) {
        Library.remove(ii);
      }
    
    }
  }  
}