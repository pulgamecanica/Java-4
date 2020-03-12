import java.util.*;
import java.io.*;

public class Test{
	public static void main(String args[]){
		File file = new File(args[0]);
		Album a1 = new Album ("CACA", 2000);
		System.out.println(a1);
		Album a2 = a1.getInfoWithoutArtistsFromFile(file);
		System.out.println(a2);
	}
}