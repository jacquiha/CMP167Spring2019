import java.util.Scanner;

public class PlayerRoster {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		final int numPlayers = 5;
		int [] jerseyNums = new int[numPlayers];
		int [] playersRating = new int [numPlayers];
		
		for (int i = 0; i < numPlayers; i++) {
			System.out.print("Enter player " + (i+1) + ":'s jersey number: ");
			int jersey = scnr.nextInt();
			jerseyNums[i] = jersey;
				if (jersey > 99 || jersey < 0) { System.out.println("Jersey number is out of range, please enter new number."); 
				jersey = scnr.nextInt();}
			System.out.print("Enter player " + (i + 1) + "'s rating: ");
			int rating = scnr.nextInt();
			playersRating[i] = rating;
				if (rating > 9 || rating < 1) { System.out.println("Rating number is out of range, please enter new number.");
				rating = scnr.nextInt(); }
			System.out.println();
	
}
		boolean quit = false;
		String command;
		while (!quit) {
			System.out.println("MENU");
			 System.out.println("o - Output roster");
			 System.out.println("u - Update player rating");
			 System.out.println("a - Output players above a rating");
			 System.out.println("q - Quit");
			 System.out.println("");
			 System.out.println("Choose an option: ");
			 command = scnr.next();
			 
			 if (command.equals("o")) {
				 System.out.println("ROSTER");
				 for (int i = 0; i < numPlayers; i++) {
					 System.out.println("Player " + (i+1) + " -- Jersey number: " + jerseyNums[i] + ", Rating : " + playersRating[i]);
				 }
				 
			 }
		}
	}
}
