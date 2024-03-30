import java.util.Random;
import java.util.Scanner;
//Creating Player and its atrributes.
class Player {                                                     
    private int health;
    private int strength;
    private int attack;
    private Random random;

    public Player(int health, int strength, int attack) {                        //attributes of the player
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }

    public int getHealth() {
        return health;
    }

    public void attack(Player Competer) {
        int attackDieRoll = rollDie();                         // Attacking Player rolls the attacking dice
        int defenseDieRoll = Competer.rollDie();               // Defending Player rolls the defending dice

        //Calculating the attack damage created by the attacking player 
        int attackDamage = attack * attackDieRoll;

        //Calculating the damage defended by the defending player
        int defenseDamage = Competer.strength * defenseDieRoll;

        //Calculating the damage 
        int damageDealt = Math.max(0, attackDamage - defenseDamage);

        //Reducing the strength of the Defender
        Competer.health -= damageDealt;
    }

    //Creating the Die to roll
    private int rollDie() {
        return random.nextInt(6)+1;            //Die with 6 sides having values ranging from 1 to 6.
    }
}
    
//Creating the MagicalArena class
public class MagicalArena {
            // creating two players 
            Player playerA = new Player(50, 5, 10);
            Player playerB = new Player(100,10,5);
            
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