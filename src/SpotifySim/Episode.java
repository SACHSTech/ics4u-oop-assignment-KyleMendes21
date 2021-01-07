package SpotifySim;
import java.io.*;
import SpotifySim.Song;

public class Episode extends Song{

  /** 
  * Episode constructor. Creates an instance of the object for Episode. 
  *
  * @param setName - a string that shows the name of the episode
  * @param setProducer - a string that shows the producer of the episode
  * @param setRelease - a string that shows the release date
  * @param setPodcast - a string that shows which podcast the episode belongs
  * @param setAlbum - a string that shows the album the episode is in
  */
  public Episode(String setName, String setProducer, String setRelease, String setPodcast, String setAlbum){
    super(setName, setProducer, setRelease, setPodcast, setAlbum);
  }

  /** 
  * Getter method that returns the episode name 
  * 
  * @return name
  */
  public String getName(){
    return super.getName();
  }

  /** 
  * Getter method that returns the producer 
  * 
  * @return producer
  */
  public String getProducer(){
    return super.getArtist();
  }

  /** 
  * Getter method that returns the playlist it belongs too 
  * 
  * @return the playlist
  */
  public String getPodcast(){
    return super.getPlaylist();
  }

  /** 
  * Getter method that returns the release date 
  * 
  * @return release date
  */
  public String getRelease(){
    return super.getRelease();
  }

  /** 
  * toString method that returns podcast episode information 
  *
  * @param getName() - a string that shows the name of the episode
  * @param getArtist() - a string that shows the producer of the episode
  * @param getRelease() - a string that shows the release month of the episode
  */
  public String toString(){
    return getName() + " by " + getArtist() + " released in " + getRelease();
  }
}