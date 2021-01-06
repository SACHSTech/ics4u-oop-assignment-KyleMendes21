package SpotifySim;
import java.io.*;
import java.util.ArrayList;
import SpotifySim.Song;
import SpotifySim.Songs;

public class Albums extends Songs {
  private String name;
  private int i = 0;
  private ArrayList<Song> Songst = new ArrayList<Song>();

  public Albums(String setName){
    name = setName;
  }

  public ArrayList getSongs() {
    return Songst;
  }

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
}


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