# Magical Arena
PROBLEM STATEMENT :                                                                                                              
Design a Magical Arena. Every Player is defined by a "health" attribute, "strength" attribute and an "attack" attribute - all positive integers. The player dies if his health attribute touches 0.

1. Any two player can fight a match in the arena. Players attack in turns. Attacking player rolls the attacking dice and the defending player rolls the defending dice. The "attack" value multiplied by the outcome of the attacking dice roll is the damage created by the attacker. The defender "strength" value, multiplied by the outcome of the defending dice is the damage defended by the defender. Whatever damage created by attacker which is in excess of the damage defended by the defender will reduce the "health" of the defender. Game ends when any players health reaches 0

2. Player with lower health attacks first at the start of a match.
3. Assume two players . Player A 50 health 5 strength 10 attack Player B 100 health 10 stregnth and 5 attack 
   Attacking die and Defending die are both 6 sided die with values ranging from 1- 6

   1.Player A attacks and rolls die. Die roll : 5 . Player B defends and rolls die. Die roll 2

   2.Attack damage is 5 * 10 = 50 ; Defending strength = 10 * 2 = 20 ; Player B health reduced by 30 to 70

   3.Player B attacks and rolls die. Die roll : 4. Player A defends and rolls die. Die Roll 3

   4.Attack damage is 4 * 5 = 20 ; Defending strength = 5 * 3 = 15 ; Player A health reduced by 5 to 45

   5.And so on.

PROBLEM SOLUTION                                                                                               :                                                                                                              
I have used Java to implement the solution for Magical Arena.

EXPLANATION :                                                                                                              
class Player() : This class is used to represent a player along with its attributes ( health, strength, and attack ) in the Magical Arena.It consist of methods to roll the die ( rollDie() ), attack the player ( void attack() ).

rollDie() : This is a method in the Player class  used to represent the die that is being rolled during the match by the attacking player and the defending player respectively .The  die has six sides and each side has values ranging between 1 t0 6.
                                                                                     
attack() : This is a method in the Player class used to  represent the attack . The attacking player rolls the attacking die and defending player rolls the defending die respectively.

attack damage created = attack value * attacking die roll (attacking player)

damage defended = strength value * defending die roll (defending player )

The diffrence of attack damage created and damage defended is the damage value. It is then reduced from the defending player's health.

class MagicalArena() : This class is uesd to represent the match between the two players( PlayerA and PlayerB ).The player with lower health value attacks first at the start of a match. The game ends when any player's health reaches 0.  