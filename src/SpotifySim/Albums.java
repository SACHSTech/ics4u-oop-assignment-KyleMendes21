package SpotifySim;
import java.io.*;
import java.util.ArrayList;
import SpotifySim.Song;
import SpotifySim.Songs;

public class Albums extends Library {
  private String name;
  private String artist;
  private ArrayList<Song> Library = new ArrayList<Song>();

  public Albums(String newName, String newArtist){
    super(newName, newArtist);
  }

  public String getName() {
    return name;
  }

  public String getArtist() {
    return artist;
  }

  public ArrayList addSong(Song newSong) {
    Library = super.addSong(newSong);
    return Library;
  }

  public ArrayList getLibrary() {
    return Library;
  }

  public String toString() {
    return name + " " + Library;
  }


}

/*
  public void addSong(Song newSong) {
    Songst.add(i, newSong);
    i = i + 1;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return name + " " + Songst;
  }
*/



/*
package SpotifySim;
import SpotifySim.Song;
import SpotifySim.Library;
import java.util.ArrayList;

public class Albums extends Library{
  private String artist;
  private ArrayList <Song> Songs = new ArrayList<Song>();
  
  // Constructor
  public Albums(String setName, String setArtist){
    super(setName);
    artist = setArtist;
  }

  public String getName(){
    return super.getName();
  }
  
  public String getArtist(){
    return artist;
  }

  public ArrayList addSong(Song newSong){
    Songs = super.addSong(newSong);
    return Songs;
  }

  public ArrayList getSongs(){
    return Songs;
  }

  public String findLength(){
    return super.findLength();
  }

  public String toString(){
    return super.getName() + " " + artist + " " + super.findLength() + " " + Songs;
  } 

}
*/