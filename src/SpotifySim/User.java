package SpotifySim;
import java.io.*;
import SpotifySim.Song;
import SpotifySim.Playlist;

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


