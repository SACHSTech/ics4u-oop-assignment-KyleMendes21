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