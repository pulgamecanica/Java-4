import java.util.*;
import java.io.*;

public class Test{
	public static void main(String args[]){
		File file = new File(args[0]);
		//File file1 = new File(args[1]);

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
		System.out.println("************************************************************************UPLOAD ALL ALBUMS*************************************************************");
		System.out.println(aT.getAllAlbums());
		//System.out.println("******************************SEARCH*********************************SEARCH*****************************************SEARCH************************");
		//System.out.println(aT.searchSongs("Battery"));
		System.out.println("******************************ALBUMS********************************ALBUMS*****************************************ALBUMS************************");
		//System.out.println(Album.createAlbumFromFileWithoutArtists(file1));
		System.out.println("******************************PlayList1********************************PlayList1*****************************************PlayList1************************");
		ArtistPlaylist apl = new ArtistPlaylist("BadAss Playlist");
		System.out.println("**********************GET Artist 0******************************");
		System.out.println(aT.getAllArtists().get(0));
		apl.addArtist(aT.getAllArtists().get(0));
		System.out.println("**********************GET Artist 0 ALBUMS******************************");
		System.out.println(aT.getAllArtists().get(0).getAlbums());
		System.out.println("**********************GET Artist 0 SONGS******************************");
		System.out.println(apl.getSongs());
		System.out.println("******************************PlayList2********************************PlayList2*****************************************PlayList2************************");
		ManualPlaylist mpl = new ManualPlaylist("Nice Play List Puma Blue");
		System.out.println("******************************ADD ALL SONGS XD********************************ADD ALL SONGS XD*****************************************ADD ALL SONGS XD************************");
		for(Album a: aT.getAllAlbums())
			for(Album.Song s: a.getSongs())
				mpl.addSong(s);
		System.out.println("**********************************MUSIC PLAYLIST**************************************");
		//System.out.println(mpl);
		System.out.println("**********************GET Artist 0******************************");
		System.out.println(mpl.getArtists().size());
		System.out.println("**********************GET Artist 0 SONGS******************************");
		System.out.println(mpl.getSongs());
	}
}