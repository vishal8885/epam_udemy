
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
public class Temperature {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter celsius value : ");
        double celsius = sc.nextDouble();
        double fahrenheit = 9.0 / 5.0 * celsius + 32.0 ;
        System.out.println("Fahrenheit = "+fahrenheit);
    }
}
