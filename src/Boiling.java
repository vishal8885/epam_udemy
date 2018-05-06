
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
public class Boiling {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input temperature : ");
        int temperature = sc.nextInt();
        if(temperature > 100)
            System.out.println("The water is boiling");
        else
            System.out.println("The water is not boiling");
    }
}
