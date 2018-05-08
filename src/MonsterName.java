
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
public class MonsterName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        // name generator
        String monsterName;
        int num = generator.nextInt(5);
        switch (num) {
            case 0: monsterName = "Black Daemon"; break;
            case 1: monsterName = "The Rabbit"; break;
            case 2: monsterName = "Silver Dragon"; break;
            case 3: monsterName = "Mountain Troll"; break;
            case 4: monsterName = "Alien"; break;
            default: monsterName = "Sphinx"; break;
        }
        
        int monsterAttack = generator.nextInt(8)+1;
        System.out.println("Attack Points of "+monsterName+": " + monsterAttack);
        int monsterDefense = generator.nextInt(15)+3;
        System.out.println("Defense Points of "+monsterName+": " + monsterDefense);
        int monsterDamage = generator.nextInt(3)+1;
        System.out.println("Damage of "+monsterName+": " + monsterDamage);
        int monsterLife = generator.nextInt(20)+15;
        System.out.println("Life Points of "+monsterName+":" + monsterLife);
        
        int yourAttack = generator.nextInt(6)+5;
        System.out.println("Your Attack Points: " + yourAttack);
        int yourDefense = generator.nextInt(10)+6;
        System.out.println("Your Defense Points: " + yourDefense);
        int yourDamage = generator.nextInt(3)+2;
        System.out.println("Your Damage: " + yourDamage);
        int yourLife = generator.nextInt(20)+25;
        System.out.println("Your Life Points:" + yourLife);      
        boolean runaway = false;
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
                    System.out.println(monsterName+"'s remaining Life Points: " + monsterLife);
                } else {
                    System.out.println("Your attack was not successful.");
                }
            } else {
                System.out.println(monsterName+" attacks.");
                int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
                int attackValue = monsterAttack + dice;
                System.out.println("Rolled values:"+dice);
                System.out.println(monsterName+"'s attack value: " + attackValue);
                if (attackValue > yourDefense) {
                    System.out.println(monsterName+"'s attack was successful.");
                    yourLife = yourLife - monsterDamage;
                    System.out.println("Your remaining Life Points: " + yourLife);
                } else {
                    System.out.println(monsterName+"'s attack was not successful.");
                }
            }
            System.out.println("Please press ENTER! (Or type in 'run' to run away)");
            String command = sc.nextLine();
            switch (command) {
                case "run":
                    System.out.println("You ran away. You coward! -4 Life Points!");
                    yourLife -= 4;
                    runaway = true;
                    break;
                default:
            }
        } while (yourLife > 0 && monsterLife > 0 && !runaway);
        if (yourLife <= 0) {
            System.out.println("You are dead. Your advanture finishes here. R.I.P.");
        }
        if (monsterLife <= 0) {
            System.out.println("You defeated the "+monsterName+". Congratulations!");
        }
    }
}
