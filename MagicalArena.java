import java.util.Random;
//Creating Player and its atrributes.
class Player {
    private int health;
    private int strength;
    private int attack;
    private Random random;

public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }
    public int getHealth() {
        return health;
    }

    public void attack(Player opponent) {
        int attackRoll = random.nextInt(6) + 1; // Roll attacking dice
        int defenseRoll = random.nextInt(6) + 1; // Roll defending dice

        int attackDamage = attack * attackRoll;
        int defenseDamage = opponent.strength * defenseRoll;

        int damageDealt = Math.max(0, attackDamage - defenseDamage);
        opponent.health -= damageDealt;
    }
    
    }

    