package Spotify;
import java.util.ArrayList;
import jav.io.*;
import Spotify.Playlist;
import Spotify.Song;

public class Favourites extends Playlist {
  private ArrayList <Song> Songs = new ArrayList <Song> ();

  public Favourites() {
    super("Favourites: ");
  }

  public void addSongs(Song newSong) {
    super. addSong(newSong);
  }

  public void removeSong(Song song) {
    Song Status;

    for(int i = 0; i < Songs.size(); i++) {
      Status = Songs.get(i);
      if(Status == song) {
        Songs.remove(i);
        break;
      }
    }
  }

  public String getName() {
    return "Your favourite songs:"
  }

  public ArrayList getSongs() {
    return super.getSongs();
  }
}