/*
package SpotifySim;
import java.util.ArrayList;
import java.io.*;
import SpotifySim.Playlist;
import SpotifySim.Song;

public class Favourites extends Playlist {
  private ArrayList <Song> Library = new ArrayList <Song> ();

/*
  public Favourite() {
    super("Fav");
  }


  public ArrayList addSong(Song newSong, Favourites fav){
    newSong.favourites(newSong, fav);
    Library = super.addSong(newSong);
    return Library;
  }

  public void removeSong(Song song){
    super.removeSong(song);
  }

  public String getName(){
    return "Favourites";
  }

  public ArrayList getLibrary(){
    return super.getLibrary();
  }

  public String toString() {
    return super.getName() + " " + Library;
  }

}

/*

public class Favourites extends Albums {
  private ArrayList <Song> Songst = new ArrayList <Song> ();

  public Favourites() {
    super("Favourites");
  }

  public void addSong(Song newSong) {
    super.addSong(newSong);
  }

  public void removeSong(Song song) {
    Song Status;

    for(int i = 0; i < Songst.size(); i++) {
      Status = Songst.get(i);
      if(Status == song) {
        Songst.remove(i);
        break;
      }
    }
  }

  public String getName() {
    return "Favourites";
  }

  public ArrayList getSongs() {
    return super.getSongs();
  }
}
*/