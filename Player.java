//Brute Force Solution
//Creation the creating and its attributes
class Player {
    int health;                   // Player with lower health attacks first
    int strength;                 
    int attack;                   

    // Constructor, getters, and setters

    /*public void attack(Player opponent, int attackRoll) {
        // Calculate attack damage and reduce opponent's health
    }
    public void defend(int damage) {
        // Reduce player's health based on damage received
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }/* */
}
//Creating The Dice
class Dice {
    private int side;
    public int dieroll() {
        // Generate a random value ranging between 1-6.
    }
}
//Creating The Game
class Match {
    public void startMatch(Player A, Player B) {
        
        // Loop until one player's health reaches 0
        // Alternate turns between players, rolling dice and executing attacks
        // Display match results
    }
}
// Main.java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Initialize players, dice, and game
        // Prompt user to start match or exit
        // Start match and display results
    }
}