//Test to check the correctness of the Player class
//Importing the junit class

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
//import java.util.Scanner;

public class PlayerTest {
    @Test
    public void testAttack() {                          // Test to check the performance of attack() method
        Player attacking = new Player(50, 5, 10);
        Player defending = new Player(100, 10, 5);

        /*Scanner sc = new Scanner(System.in);                              // using scanner class for user input

        System.out.println("Enter Player A's health, strength, and attack : ");
        int aHealth = sc.nextInt();
        int aStrength = sc.nextInt();
        int aAttack = sc.nextInt();

        System.out.println("Enter Player B's health, strength, and attack : ");
        int bHealth = sc.nextInt();
        int bStrength = sc.nextInt();
        int bAttack = sc.nextInt();

        Player attacking = new Player(aHealth, aStrength, aAttack);
        Player defending = new Player(bHealth, bStrength, bAttack); */

        attacking.attack(defending);
        assertTrue(defending.getHealth() < 100);              // Defending player's health should be reduced
    
    }

    @Test
    public void testRollDie() {                              // Test to check the rollDie() method
        Player player = new Player(100, 10, 5);

        /*System.out.println("Enter Player health, strength, and attack : ");
        int aHealth = sc.nextInt();
        int aStrength = sc.nextInt();
        int aAttack = sc.nextInt();
        Player player = new Player( ahealth, aStrength, aAttack);
        */

        int roll = player.rollDie();
        assertTrue(roll >= 1 && roll <= 6);                 // The rollDie() value should be between the range of 1 to 6
    
    }

}
