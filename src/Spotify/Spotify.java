package Spotify;
import java.io.*;
import java.util.ArrayList;

public class Spotify {
  public static void main(String[] args) throws IOException {
    ArrayList <Song> Songs = new ArrayList <Song>();

    Song Spirits = newSong("Spirits", "Strumbellas", "Mays 2020", "New Stuff", true);

    Playlist Hi = new Playlist("Hi");

    System.out.println(Spirits);

    Hi.addSong(Spirits);

    System.out.println(Hi);

  }
}