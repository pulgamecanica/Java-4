import java.util.*;
public class ArtistPlaylist implements Playlist{
	private final String name;
	private List<Album.Song> songs = new ArrayList<>();;	
	private List<Artist> artists = new ArrayList<>();

	public ArtistPlaylist(String name){
		this.name = name;
	}

	@Override
	public Time getDuration(){
		Time result = new Time(0,0,0);
		for(Album.Song x: songs)
			result = result.addTimes(x.getDuration());
	 	return result;
	}
	@Override
	public List<Artist> getArtists(){
		return artists;
	}
	@Override
	public List<Album.Song> getSongs(){
		return songs;
	}
	
	public void addArtist(Artist artist){
		artists.add(artist);
		for(Album x: artist.getAlbums())
			songs.addAll(x.getSongs());
	}
	public String toString(){
		return "This PlayLis, by: " + artists + " With a duration of: " + getDuration();
	}
}