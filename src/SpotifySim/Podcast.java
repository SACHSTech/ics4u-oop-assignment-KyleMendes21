/*
package SpotifySim;
import SpotifySim.Playlist;
import SpotifySim.Episode;
import java.util.ArrayList;

public class Podcast extends Playlist{
  private String producer;
  private String description;
  private int i = 0;
  private ArrayList <Episode> Collection = new ArrayList <Episode>();

  public Podcast(String setName, String setProducer){
    super(setName);
    producer = setProducer;
  }

  public void addEpisode(Episode episode, Podcast series){
    Collection.add(i, episode);
    i = i + 1;
  }

  public ArrayList getSongs(){
    return Collection;
  }

  public String getProducer(){
    return producer;
  }

  public String getName(){
    return super.getName();
  }

  public String toString(){
    return super.getName() + " " + " " + producer + " " + Collection;
  }
}
*/