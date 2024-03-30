//import java.util.Random;

    
    //Creating the MagicalArena class
public class MagicalArena {
        public static void main(String[] args) {
            // creating two players 
            Player playerA = new Player(50, 5, 10);
            Player playerB = new Player(100, 10, 5);
            
            //Checking the health of the players and comparing them to chooose who gets to attack first.
            //Player with lower  health attacks first. 

            while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
                if (playerA.getHealth() < playerB.getHealth()) {
                    playerA.attack(playerB);
                } else {
                    playerB.attack(playerA);
                }
            }

            //Printing the health of the Players after the match
            System.out.print("Player A's health after the match is : " + playerA.getHealth());
            System.out.println("Player B's health after the match is : " + playerB.getHealth());
           
    }
}