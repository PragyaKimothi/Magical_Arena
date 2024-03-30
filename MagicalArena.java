import java.util.Random;
//Creating Player and its atrributes.
class Player {
    private int health;
    private int strength;
    private int attack;
    private Random random;

public Player(int health, int strength, int attack) {                            //attributes of the Player
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }
    public int getHealth() {
        return health;
    }

    public void attack(Player Competer) {
        int attackDiceRoll = rollDie();                   // Attacking Playrer rolls attacking dice
        int defenseDiceRoll =Competer.rollDie();                 // Defending Player rolls defending dice

        // Calculating attack damage created
        int attackDamage = attack * attackDiceRoll;
        // Calculating defense damage
        int Damagedefend = Competer.strength * defenseDiceRoll;

        // Calculating  damage defended
        int damageDealt = Math.max(0, attackDamage - Damagedefend);

        // Reduce health of player
        Competer.health -= damageDealt;
    }
    private int rollDie() {
        return random.nextInt(6) +1 ;   // Die with 6 sides containing values ranging from 1 to 6.
    }
    }
    public class MagicalArena {
        public static void main(String[] args) {
            // creating two players
            Player playerA = new Player(50, 5, 10);
            Player playerB = new Player(100, 10, 5);
            
            while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
                if (playerA.getHealth() < playerB.getHealth()) {
                    playerA.attack(playerB);
                } else {
                    playerB.attack(playerA);
                }
            }
           
    }
}