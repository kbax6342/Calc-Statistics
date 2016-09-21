import java.util.Scanner;


public class Stats {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		//Welcome the users to the calculator
		System.out.println("Welcome to the Batting AVarage Calculator!");
		
		//Ask the user for number of times at bat
		System.out.println("Enter number of times at bat:  ");
		int atBat = input.nextInt();
		int[] hits = new int[atBat];
		
		
		
		//legend of the table
		System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = homerun\n");
		

		for(int i=0; i< hits.length; i++){
			System.out.println("Result for at-bat: ");
			 hits[i] = input.nextInt();
			
		}
		
			
			//System.out.println("Results for at-bat" + hits + ": " + score);
			
		
		
		 double sum = 0.000;
		 
		
			
		
		
		//For each at bat the application asks for a result
		//User enters the number of basses earned by the batter
		//After the bats are entered the application displays the batting average and sluging percentage of the batter
		

	}

}
