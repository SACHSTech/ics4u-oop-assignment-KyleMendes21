package SpotifySim;
import java.io.*;
import SpotifySim.Songs;
import SpotifySim.Albums;
import SpotifySim.Playlist;
import java.util.ArrayList;
import SpotifySim.Favourites;

public class Song {
  private String name;
  private String artist;
  private String playlist;
  private String album;
  private String release;
  private boolean favourites;
  //private ArrayList<Song> Favourites;

  public Song(String newName, String newArtist, String newRelease, String newPlaylist, String newAlbum, boolean newFavourites) {
    name = newName;
    artist = newArtist;
    playlist = newPlaylist;
    release = newRelease;
    favourites = newFavourites;
  }

  /*

  public void favourites(Song song, Favourites favourite) {
    if(favourites == false) {
      favourite.addSong(song, favourite);
    }
    favourite = true;
  }

  public void unfavourite() {
    favourite = false;
  }
  */

  public String getName() {
    return name;
  }

  public String getArtist() {
    return artist;
  }

  public String getRelease() {
    return release;
  }

  public String getPlaylist() {
    return playlist;
  }

  public String getAlbum() {
    return release;
  }

  public boolean getFavourites() {
    return favourites;
  }

  public String toString() {
    return name + " by " + artist + " released in " + release + " is in the playlist " + playlist + " and it is in the album " + album;
  }
}



/*
public class Song {
  private String name;
  private String artist;
  private String playlist;
  private String release;
  private boolean favourites;
  //private ArrayList<Song> Favourites;


  public Song(String newName, String newArtist, String newRelease, String newPlaylist, boolean newFavourites) {
    name = newName;
    artist = newArtist;
    playlist = newPlaylist;
    release = newRelease;
    favourites = newFavourites;
  }


/*
  public void favourites(Song newSong) {
    if (favourites == false) {
      Favourites.add(newSong);
    }
    favourites = true;
  }


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
  */


