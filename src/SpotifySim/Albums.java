package SpotifySim;
import java.io.*;
import java.util.ArrayList;
import SpotifySim.Song;
import SpotifySim.Library;

public class Albums extends Library {

  // instance variables
  private String artist;
  private ArrayList<Song> Library = new ArrayList<Song>();

  /** 
  * Albums constructor. Creates an instance of the object for Albums. 
  *
  * @param setName - a string that shows the name of the song
  * @param artist - a string that shows the artist of the song

  */
  public Albums(String setName, String newArtist){
    super(setName);
    artist = newArtist;
  }

  /** 
  * Gettor method that returns getName() 
  *
  * @return getName()
  */
  public String getName() {
    return super.getName();
  }

  /** 
  * Gettor method that returns the artist 
  *
  * @return the artist
  */
  public String getArtist() {
    return artist;
  }

  /**
  * Adds song to array library list
  *
  * @param newSong the name of the instance of the Song class that will be added
  */
  public ArrayList addSong(Song newSong) {
    Library = super.addSong(newSong);
    return Library;
  }

  /** 
  * Gettor method that returns the library array list
  *
  * @return library list
  */
  public ArrayList getLibrary() {
    return Library;
  }

  /** 
  * toString method that returns album information 
  *
  * @param getName() - a string that shows the name of the song
  * @param getArtist() - a string that shows the artist of the song
  * @param Library - an ArrayList that shows all the songs in the album
  */
  public String toString() {
    return super.getName() + " by " + artist + " " + Library;
  }
}