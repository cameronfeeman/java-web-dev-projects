package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a radius");
    double userRadius =input.nextDouble();
    System.out.println("The area of a circle with that radius " + userRadius + " is: " + Circle.getArea(userRadius));
}
}
