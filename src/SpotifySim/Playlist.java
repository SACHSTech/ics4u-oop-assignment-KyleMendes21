package SpotifySim;
import java.io.*;
import java.util.ArrayList;
import SpotifySim.Song;
import SpotifySim.Library;
import Spotify.User;

public class Playlist extends Library {

  public Playlist(String newName) {
    super(newName);
  }

  public ArrayList getLibrary() {
    return super.getLibrary();
  }

  public ArrayList addSong(Song newSong, Playlist collection) {
    return super.addSong(newSong);
  }

  public void removeSong(Song song) {
    super.removeSong(song);
  }

  public String getName() {
    return super.getName();
  }

  public void setName(String newName) {
    return super.setName(newName);
  }

  public String toString() {
    return super.name + " " + super.getLibrary();
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

