import java.util.*;
import java.io.*;
public class AiTunas{
	private List<Album> albums = new ArrayList<Album>();	
	private List<Artist> artists = new ArrayList<>();

	public AiTunas load(File file){
		File[] list = file.listFiles();
		for (File f : list){
			if (!f.isDirectory())
        		albums.add(Album.createAlbumFromFileWithoutArtists(f));
        }
        for(Album a: albums)
        	for(Artist x: a.getArtists())
        		artists.add(x);
        return this;
	}

	public List<Artist> getAllArtists(){
		 List<Artist> result = new ArrayList<>(); 
		for(Album x: albums)
			for(Artist y: x.getArtists())
		 		result.add(y);
		return result;
	}

	public List<Album> getAllAlbums(){
		// for(Album x: albums)
		// 	System.out.println(x);
		return albums;
	}
	public Time getTotalTime(){
		Time result = new Time(0,0,0);
		for(Album x: albums)
			result = result.addTimes(x.getDuration());
		return result;
	}
	public List<Album.Song> searchSongs(String arg){
		List<Album.Song> result = new ArrayList<>();
		result.addAll(searchSongsByArtist(arg));
		result.addAll(searchSongsByName(arg));
		result.addAll(searchSongsByAlbum(arg));
		return result;
	}
	public List<Album.Song> searchSongsByArtist(String arg){
		List<Album.Song> result = new ArrayList<>();
		for(Album x : albums)
			for(Artist y: x.getArtists())
        		if (y.getName().equals(arg))
        			result.addAll(x.getSongs());
        return result;
	}
	public List<Album.Song> searchSongsByAlbum(String arg){
		List<Album.Song> result = new ArrayList<>();
		for(Album x: albums)
			if(x.getName().equals(arg))
				result.addAll(x.getSongs());
        return result;

	}
	public List<Album.Song> searchSongsByName(String arg){
		List<Album.Song> result = new ArrayList<>();	
		for(Album x: albums)
			for(Album.Song y: x.getSongs())
				if(y.getName().equals(arg))
					result.add(y);
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