import java.util.Scanner;


public class Stats {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Declarations
		boolean proceed =true;
		boolean startOver = true;
		
		
while(startOver){
	
			//Welcome the users to the calculator
			System.out.println("Welcome to the Batting Average Calculator!");
			
			System.out.println("How many players are batting today? ");
			
			int	players = input.nextInt();
				
			String [] playersArray = new String [players]  ;
			
			for(int i = 0; i < playersArray.length; i++){
			
				playersArray[i] = Methods.getAtBatInfo();
				
				System.out.println(playersArray[i]);
			
			}
			
			
			//Asking the user if they want to continue
			System.out.println("Another batter? (y/n):  ");
			
			//clearing the scanner
			input.nextLine();
			
			//storing the input from the user to continue the program
			String cont = input.nextLine();
			
			//checking to see if the answer is yes or now and setting it to true or false
			if(cont.equalsIgnoreCase("y")){
				startOver = true;
			}else{
				startOver = false;
			}
			 
		}
		
	}
}



