import java.util.Scanner;


public class Methods {
	
		

	
	public static String getAtBatInfo(){
		
	
		boolean proceed = true;
		double atBat;
		double sum = 0.000;
		double hit = 0.000;
		String answer = " ";
		boolean contForPlayer = true;
		double average = 0.000;
		double slugging = 0.000;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of times at bat 1 -5:  ");
		//Storing number into the variable atBat
		atBat = input.nextDouble();
		
		//if/else statement to validate the number 
		if(atBat < 1 || atBat < 5){
			proceed = false;
		}else{
			System.out.println("Number not valid! Enter number of times at bat 1 - 5:  ");
			
			proceed = true;
		}
		
		System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = homerun\n");
	
		double [] hits = new double[(int) atBat];
		
		//for loop created to go through the new array
		for(int i = 0; i <  hits.length; i++){
			
			//Asking for at bat results
			System.out.println("Result for at-bat " + i + " : ");
			
			//Storing the results in the variable hits array
			 hits[i] = input.nextInt();
			 
			 sum += hits[i];
			 
			
			 //if the player made it a hit it adds to the variable hit
			 if(hits[i] > 0){
			  hit++;
			 } 
		}
			average = Methods.calculateAverage(hit, atBat);
		
			slugging =  Methods.calculateSluggin(sum, atBat);
		
		answer = "\n Your average is: " + average + " and  your slugging is: " + slugging + "\n";
		
			return answer;
	}
	
	
			 public static double calculateAverage(double hit, double atbat){
				 
				 double average = hit/atbat;
				 
				 
				 return average;
			 }
			 
			 public static double calculateSluggin(double sum, double atBat){
				 
				 double slugging = sum/atBat;
				 
				 return slugging;
		
		
	}
}
