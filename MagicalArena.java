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

    public void attack(Player A) {
        int attackDiceRoll = random.nextInt(6) + 1;                   // Attacking Playrer rolls attacking dice
        int defenseDiceRoll = random.nextInt(6) + 1;                 // Defending Player rolls defending dice

        // Calculating attack damage created
        int attackDamage = attack * attackDiceRoll;
        // Calculating defense damage
        int Damagedefend = A.strength * defenseDiceRoll;

        // Calculating  damage defended
        int damageDealt = Math.max(0, attackDamage - Damagedefend);

        // Reduce health of player
        A.health -= damageDealt;
    }
    
    }
    public class MagicalArena {
        public static void main(String[] args) {
            // creating two players
            Player playerA = new Player(50, 5, 10);
            Player playerB = new Player(100, 10, 5);
            
           
    }
}