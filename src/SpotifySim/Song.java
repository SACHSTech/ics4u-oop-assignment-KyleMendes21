package SpotifySim;
import java.io.*;
import SpotifySim.Songs;
import SpotifySim.Albums;
import SpotifySim.Playlist;
import java.util.ArrayList;
//import SpotifySim.Favourites;

public class Song {
  private String name;
  private String artist;
  private String playlist;
  private String release;
  private boolean favourites;
  //private ArrayList<Song> Favourites;


  public Song(String newName, String newArtist, String newPlaylist, String newRelease, boolean isfavourites) {
    name = newName;
    artist = newArtist;
    playlist = newPlaylist;
    release = newRelease;
    favourites = isfavourites;
  }

/*
  public void favourites(Song newSong) {
    if (favourites == false) {
      Favourites.add(newSong);
    }
    favourites = true;
  }
*/

  public void unfavourites() {
    favourites = false;
  }
  

  public String getName() {
    return name;
  }

  public String getArtist() {
    return artist;
  }

  public String getPlaylist() {
    return playlist;
  }

  public String getRelease() {
    return release;
  }

  public boolean getFavourites() {
    return favourites;
  }

  public void setName(String newName){
    name = newName;
  }

  public void setArtist(String newArtist){
    artist = newArtist;
  }

  public void setPlaylist(String newPlaylist){
    playlist = newPlaylist;
  }

  public void setRelease(String newRelease){
    release = newRelease;
  }

  public String toString() {
    //return getName() + " by " + getArtist() + " released in " + getRelease() + " is in the playlist " + getPlaylist();
    return name + " by " + artist + " released in " + release + " is in the playlist " + playlist;
  }


}