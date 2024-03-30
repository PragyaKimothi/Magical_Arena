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
    
    }

    