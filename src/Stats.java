import java.util.Scanner;


public class Stats {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Declarations
		boolean proceed =true;
		boolean startOver = true;
		int atBat = 0;
		int hit = 0;
		double average;
		double slugging;
		double percentage;
		double sum = 0.000;
		
		
while(startOver){
	
			//Welcome the users to the calculator
			System.out.println("Welcome to the Batting Average Calculator!");
			
			
			//While loop for user validation
			while(proceed){
			//Ask the user for number of times at bat
			System.out.println("Enter number of times at bat 1 -5:  ");
			//Storing number into the variable atBat
			atBat = input.nextInt();
			
			//if/else statement to validate the number 
			if(atBat < 1 || atBat < 5){
				proceed = false;
				
			}else{
				System.out.println("Number not valid! Enter number of times at bat 1 -5:  ");
				proceed = true;
			}
			}
			
			//Creating a new Array for times at Bat
			int[] hits = new int[atBat];
	
			//legend of the table
			System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = homerun\n");
			
	
			for(int i=0; i< hits.length; i++){
				
				System.out.println("Result for at-bat: ");
				
				 hits[i] = input.nextInt();
				 
				 sum += 1;
				 
				 if(i > 0){
				  hit = hit + 1;
				 }
				 
			}
			
			
				average = sum/hit;
				slugging = sum/atBat;
				
			System.out.println("\nBatting Average: " + average + "\n");
			
			System.out.println("Slugging Percentage: " + slugging + "\n");
			
			
			System.out.println("Another batter? (y/n):  ");
			input.nextLine();
			String cont = input.nextLine();
			
			if(cont.equalsIgnoreCase("y")){
				startOver = true;
			}else{
				startOver = false;
			}
			 
			
			
		
		}
		
		

	}

}
