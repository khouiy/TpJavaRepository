package mediatheque;

import java.util.ArrayList;

public class mainTest {

	public static void main(String[] args) {

		
		Media media =  new Media("talet"," bigg",new ArrayList<Integer>());
		
//		
//		media.vote(2);
//		media.vote(3);
		
		System.out.println(media.moyenneNotes());
		
		}

}
