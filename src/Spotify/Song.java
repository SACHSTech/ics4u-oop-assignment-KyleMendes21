package Spotify;
import java.io.*;
import Spotify.Favourites;

public class Song {
  private String name;
  private String artist;
  private String playlist;
  private String release;
  private boolean favourites;

  public Song(String newName, String newArtist, String newPlaylist, String newRelease,boolean newFavourites) {
    name = newName;
    artist = newArtist;
    playlist = newPlaylist;
    release = newRelease;
    favourite = newFavourite;
  }

  public void Favourites(Song song) {
    if (favourites == false) {
      Favourites.addSong(song);
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

  public String getFavourites() {
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
    release = newRelase;
  }

  public String toString() {
    return getName() + " " + getArtist() + " " + getPlaylist() + " " + getRelease() + " " + getFavourites;
  }


}