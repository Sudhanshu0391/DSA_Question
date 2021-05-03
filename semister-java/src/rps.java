import java.util.*;

class Tool{
	int strength;
	char type;
	void setStrength(int s){
		strength=s;
		}
}
class Rock extends Tool 
{ 

  Rock(int s){
	  strength = s;
	  type = 'r';
	  }

   boolean fight(Character c){
	   if(c.equals('s')){
		   return true;
		   }
	   else{
		   return false;
		   }
	   }
}
class Paper extends Tool 
{ 

  Paper(int s){
	  strength = s;
	  type = 'p';
}

   boolean fight(Character c){

     if(c.equals('r')){

        return true;

     }

     else{

       return false;

     }
    }
}

class Scissors extends Tool { 

  Scissors(int s){
	  strength = s;
	  type = 's';
}

   boolean fight(Character c){
	   if(c.equals('p')){
		   return true;
		   }
	   else{
		   return false;
		   }
	   }
}
public class rps {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		    Scissors s = new Scissors(5);
	        Paper p = new Paper(7);
	        Rock r = new Rock(15);
		    
		    while (true) {
		      Character[] rps = {'r', 'p', 's'};
		      Character computerMove = rps[new Random().nextInt(rps.length)];
		      
		      String playerMove;
		      Character ans;
		      while(true) {
		        System.out.println("Please enter your move (r, p, or s)");
		        playerMove = scanner.nextLine();
		        ans = playerMove.charAt(0);
		        if (ans.equals('r') || ans.equals('p') || ans.equals('s')) {
		          break;
		        }
		        System.out.println(playerMove + " is not a valid move.");
		      }
		      
		      System.out.println("Computer played: " + computerMove);
		      if(ans.equals(computerMove)) {
		    	  System.out.println("The game was a tie!");
		      }
		      else if(ans.equals('r') &&  (computerMove.equals('p') || computerMove.equals('s') )) {
		    	  if(r.fight(computerMove)) {
		    		  System.out.println("You win!");
		    	  }
		    	  else
		    	  {
		    		  System.out.println("You lose!");
		    	  }
		      }
		      else if(ans.equals('p') &&  (computerMove.equals('r') || computerMove.equals('s') ))
		      {
		    	  if(p.fight(computerMove)) {
		    		  System.out.println("You win!");
		    	  }
		    	  else {
		    		  System.out.println("You lose!");
		    	  }
		      }
		      else
		      {
		    	  if(s.fight(computerMove)) {
		    		  System.out.println("You win!");
		    	  }
		    	  else {
		    		  System.out.println("You lose!");
		    	  }
		      }
		      System.out.println("Play again? (y/n)");
		      String playAgain = scanner.nextLine();
		      
		      if (!playAgain.equals("y")) {
		    	  System.out.println("Thanks for playing! ");
		    	  break;
		      }
		    	  
	   }
		      
	}
}

