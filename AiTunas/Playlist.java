import java.util.*;
public interface Playlist{
	Time getDuration();
	List<Artist> getArtists();
	List<Album.Song> getSongs();
}

