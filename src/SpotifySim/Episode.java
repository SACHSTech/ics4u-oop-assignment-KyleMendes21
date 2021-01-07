package SpotifySim;
import java.io.*;
import SpotifySim.Song;

public class Episode extends Song{

  public Episode(String setName, String setProducer, String setRelease, String setPodcast, String setAlbum){
    super(setName, setProducer, setRelease, setPodcast, setAlbum);
  }

  public String getName(){
    return super.getName();
  }

  public String getProducer(){
    return super.getArtist();
  }

  public String getPodcast(){
    return super.getPlaylist();
  }

  public String getRelease(){
    return super.getRelease();
  }

  public String toString(){
    return getName() + " by " + getArtist() + " released in " + getRelease();
  }
}