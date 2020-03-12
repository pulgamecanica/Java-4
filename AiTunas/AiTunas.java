import java.util.*;
import java.io.*;
public class AiTunas{
	private List<Album> albums = new ArrayList<Album>();	
	private List<Artist> artists = new ArrayList<Artist>();	

	public AiTunas load(File file){
		File[] list = file.listFiles();
		for (File f : list){
			if (!f.isDirectory())
        		albums.add(Album.createAlbumFromFileWithoutArtists(f));
        }
        return this;
	}

	public List<Artist> getAllArtists(){
		for(Artist x: artists)
			System.out.println(x);
		return artists;
	}

	public List<Album> getAllAlbums(){
		for(Album x: albums)
			System.out.println(x);
		return albums;
	}
	public Time getTotalTime(){
		Time result = new Time(0,0,0);
		for(Album x: albums)
			result = result.addTimes(x.getDuration());
		return result;
	}





	//*
	/*
	getAllArtists
	getAllAlbums
	getTotalTime
	searchSongs
	*/
}