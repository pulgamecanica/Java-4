import java.util.*;

public class Artist{
	private final String name;
	private List<Album> albums = new ArrayList<Album>();

	public Artist(String name){
		this.name = name;
	}
	public void addAlbum(Album album){
		albums.add(album);
	}
	public String getName(){
		return name;
	}
	public List<Album> getAlbums(){
		return albums;
	}
	public String toString(){
		return "Artist Name : " + name + albums;
	}
}