public class SongA{
	private final String name;
	private final Time duration;
	private Album album;

	public SongA(String name, Time duration){
		this.name = name;
		this.duration = duration;
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
	
}