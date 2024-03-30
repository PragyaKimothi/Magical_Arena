import java.util.Random;

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
    