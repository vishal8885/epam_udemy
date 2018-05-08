
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vishal
 */
public class FightingTillDeath {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Attack Points of Monster:");
        int monsterAttack = sc.nextInt();
        System.out.println("Defense Points of Monster:");
        int monsterDefense = sc.nextInt();
        System.out.println("Damage of Monster:");
        int monsterDamage = sc.nextInt();
        System.out.println("Life Points of Monster:");
        int monsterLife = sc.nextInt();
        
        System.out.println("Your Attack Points:");
        int yourAttack = sc.nextInt();
        System.out.println("Your Defense Points:");
        int yourDefense = sc.nextInt();
        System.out.println("Your Damage:");
        int yourDamage = sc.nextInt();
        System.out.println("Your Life Points:");
        int yourLife = sc.nextInt();
        
        sc.nextLine(); // for emptying the input buffer. Explain input buffer for a little
        
        Random generator = new Random();
        
        // round starts here : do
        do {
            boolean attacker = generator.nextBoolean();
            if (attacker) {
                System.out.println("You attack");
                int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
                int attackValue = yourAttack + dice;
                System.out.println("Rolled values: "+dice);
                System.out.println("Your attack value: " + attackValue);
                if (attackValue > monsterDefense) {
                    System.out.println("Your attack was successful.");
                    monsterLife = monsterLife - yourDamage;
                    System.out.println("Monster's remaining Life Points: " + monsterLife);
                } else {
                    System.out.println("Your attack was not successful.");
                }
            } else {
                System.out.println("Monster attacks.");
                int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
                int attackValue = monsterAttack + dice;
                System.out.println("Rolled values:"+dice);
                System.out.println("Monster's attack value: " + attackValue);
                if (attackValue > yourDefense) {
                    System.out.println("Monster's attack was successful.");
                    yourLife = yourLife - monsterDamage;
                    System.out.println("Your remaining Life Points: " + yourLife);
                } else {
                    System.out.println("Monster's attack was not successful.");
                }
            }
            // from this point on
            System.out.println("press ENTER!");
            sc.nextLine();
        } while (yourLife > 0 && monsterLife > 0);
        if (yourLife <= 0) {
            System.out.println("You are dead.");
        }
        if (monsterLife <= 0) {
            System.out.println("You defeated the monster. Congratulations!");
        }
    }
}
