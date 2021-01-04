package Spotify;
import java.io.*;
import Spotify.Song;
import Spotify.Playlist;

public class User {
  private String username;
  private String password;

  public User(String newUsername, String newPassword) {
    username = newUsername;
    password = newPassword;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }
}


