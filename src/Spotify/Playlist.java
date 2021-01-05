package Spotify;
import java.io.*;
import java.util.ArrayList;
import oop.Spotify.Song;
import oop.Spotify.Songs;

public class Playlist extends Songs {
  private String name;
  private int i = 0;
  private Arraylist<Song> Songs = new ArrayList<Song>();

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

}