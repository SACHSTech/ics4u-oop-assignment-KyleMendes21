package SpotifySim;
import java.io.*;
import SpotifySim.Library;
import SpotifySim.Albums;
import SpotifySim.Playlist;
import java.util.ArrayList;

public class Song {

  // instance variables
  private String name;
  private String artist;
  private String playlist;
  private String album;
  private String release;

  /** 
  * Song constructor. Creates an instance of the object for Song. 
  *
  * @param name - a string that shows the name of the song
  * @param artist - a string that shows the artist of the song
  * @param playlist - a string that shows which playlist the songs belongs
  * @param album - a string that shows which album the songs belongs
  * @param release - a string that shows the release month of the song
  */
  public Song(String newName, String newArtist, String newRelease, String newPlaylist, String newAlbum) {
    name = newName;
    artist = newArtist;
    release = newRelease;
    playlist = newPlaylist;
    album = newAlbum;
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
  * Getter method that returns the artist 
  * 
  * @return artist
  */
  public String getArtist() {
    return artist;
  }

  /** 
  * Getter method that returns the release month 
  * 
  * @return release
  */
  public String getRelease() {
    return release;
  }

  /** 
  * Getter method that returns the playlist 
  * 
  * @return playlist
  */
  public String getPlaylist() {
    return playlist;
  }

  /** 
  * Getter method that returns the album 
  * 
  * @return album
  */
  public String getAlbum() {
    return album;
  }

  /** 
  * toString method that returns song information 
  *
  * @param getName() - a string that shows the name of the song
  * @param getArtist() - a string that shows the artist of the song
  * @param getPlaylist() - a string that shows which playlist the songs belongs
  * @param getAlbum() - a string that shows which album the songs belongs
  * @param getRelease() - a string that shows the release month of the song
  */
  public String toString() {
    if (album.equals("NONE")) {
      return getName() + " by " + getArtist() + " released in " + getRelease() + " is in the playlist " + getPlaylist();
    }
    if (playlist.equals("NONE")) {
      return getName() + " by " + getArtist() + " released in " + getRelease() + " is in the album " + getAlbum();
    }
    return getName() + " by " + getArtist() + " released in " + getRelease() + " is in the playlist " + getPlaylist() + " and it is in the album " + getAlbum();

  }
}