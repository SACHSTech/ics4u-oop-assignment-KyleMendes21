package SpotifySim;
import java.io.*;
import java.util.ArrayList;
import SpotifySim.Song;
import SpotifySim.Library;
//import Spotify.User;

public class Playlist extends Library {

  /** 
  * Playlist constructor. Creates an instance of the object for Playlist. 
  *
  * @param setName - a string that shows the name of the song
  */
  public Playlist(String setName) {
    super(setName);
  }

  /** 
  * Gettor method that returns getName() 
  *
  * @return getName()
  */
  public String getName() {
    return getName();
  }

  /**
  * Setter method that will give newName value
  *
  * @param newName name of the song
  */
  public void setName(String newName) {
    super.setName(newName);
  }
  
  /** 
  * Getter method that returns the library array list 
  * 
  * @return Library array list
  */
  public ArrayList getLibrary() {
    return super.getLibrary();
  }

  /**
  * Adds song to array library list
  *
  * @param newSong the name of the instance of the Song class that will be added
  * @param collection the name of the instance of the Playlist class 
  */
  public ArrayList addSong(Song newSong, Playlist collection) {
    return super.addSong(newSong);
  }

  /**
  * Removes song from array library list
  *
  * @param song the name of the instance of the Song class that will be removed
  */
  public void removeSong(Song song) {
    super.removeSong(song);
  }

  /** 
  * toString method that returns playlist information 
  *
  * @param getName() - a string that shows the name of the song
  * @param getLibrary() - an ArrayList that shows all the songs in the playlist
  */
  public String toString() {
    return super.getName() + " " + super.getLibrary();
  }
}

/*package SpotifySim;
import java.util.ArrayList;
import SpotifySim.Song;
import SpotifySim.Songs;

public class Playlist extends Songs {
  private String name;
  private String artist;
  private int i = 0;
  private ArrayList<Song> Songst = new ArrayList<Song>();

  public Playlist(String setName, String setArtist){
    name = setName;
    artist = setArtist;
  }
  
  public void setArtist(String newArtist){
    artist = newArtist;
  }

  public String getArtist(){
    return artist;
  }

  public void addSong(Song newSong){
    Songst.add(i, newSong);
    i = i + 1;
  }

  public ArrayList getSongs(){
    return Songst;
  }

  public String toString(){
    return name + " " + artist + " " + Songst;
  }


/*
  public Playlist(String setName) {
    name = setName;
  }

  public ArrayList getSongs() {
    return Songs;
  }

  public void addSong(Song newSong) {
    Songs.add(i, newSong);
    i = i + 1;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return name + " " + Songs;
  }
*/

