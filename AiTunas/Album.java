import java.util.*;
import java.io.*;

public class Album{
	private String name;
	private int year;
	private List<Song> songs = new ArrayList<Song>();	

	public Album(String name, int year){
		this.name = name; 
		this.year = year;
	}
	public Album load(File f){
		return getInfoWithoutArtistsFromFile(f);
	}
	public String getName(){
		return name;
	}
	public int getYear(){
		return year;
	}
	// public Time getDuration(){
	// 	//return Time;
	// }
	public void addSong(Song s){
		songs.add(s);
	}
	public void removeSong(Song s){
		songs.remove(s);
	}
	public Album getInfoWithoutArtistsFromFile(File file){
		String albumName = "";
		int year = 0;
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				String line1 = scanner.nextLine();
				albumName = line1;
				int line2 = scanner.nextInt();
				year = line2;
				Album album = new Album(albumName, year);
				System.out.println(album);
				addSongsFromFile(file, album);
				return album;
			}
		}
		catch (FileNotFoundException e) {
			System.err.println("ficheiro nao encontrado");
		}
		Album album = new Album(albumName, year);
		return album;
	}
	public void addSongsFromFile(File file, Album album){
		int start_songs = 1;
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if(line.isEmpty()){
					start_songs -= 1;
					line = scanner.nextLine();
				}
				if(start_songs == 0){
					Song s = new Song(getSongName(line), getSongTime(line), album);
					album.addSong(s);
				}
			}
		}
		catch (FileNotFoundException e) {
			System.err.println("ficheiro nao encontrado");
		}
	}
	public String getSongName(String s){
		String[] s2 = s.split(" ");
		s2[0] = "";
		return String.join(" ", s2);
	}
	public Time getSongTime(String s){
		String[] s2 = s.split(" ");
		Time t = new Time(s2[0]);
		return t;
	}
	public String toString(){
		return "Album Name: " + name + " Year, " + year;
	}

	
	public class Song{
		private final String name;
		private final Time duration;
		private final Album album;

		public Song(String name, Time duration, Album album){
			this.name = name;
			this.duration = duration;
			this.album  = album;
		}
		public String getName(){
			return name;
		}
		public Time getDuration(){
			return duration;
		}
		public Album getAlbum(){
			return album;
		}
		public String toString(){
			return "Song name: " + name + " ,duration: " + duration + " ,Album: " + album;
		}
	}
}