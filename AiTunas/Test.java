import java.util.*;
import java.io.*;

public class Test{
	public static void main(String args[]){
		File file = new File(args[0]);
		// Album a1 = new Album ("CACA", 2000);
		// System.out.println(a1);
		// Album a2 = a1.getInfoWithoutArtistsFromFile(file);
		// System.out.println(a2);
		// System.out.println("**************************************************************************************");
		// //Album.createAlbumFromFileWithoutArtists(file);
		// System.out.println("Duration: " + Album.createAlbumFromFileWithoutArtists(file).getDuration());
		System.out.println("******************************AITUNAS*********************************AITUNAS*****************************************AITUNAS************************");
		AiTunas aT = new AiTunas();
		aT.load(file);
		System.out.println(aT.getAllAlbums());
	}
}