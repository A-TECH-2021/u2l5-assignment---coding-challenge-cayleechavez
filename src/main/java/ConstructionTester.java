package main.java;
import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        /* asks user to enter sales tax rate as a decimal, number of boards needed,
        number of windows needed,

        create a construction object to compute cost of lumber and windows

        print total cost

        use method to compute tax and print grand total with tax
        */

        Scanner input = new Scanner(System.in);

        double taxRate = input.nextDouble();
        int boards = input.nextInt();
        int windows = input.nextInt();
        System.out.println("Enter the sales tax rate: " + taxRate);
        System.out.println("How many boards do you need? " + boards);
        System.out.println("How many windows do you need? " + windows);

     //   Construction lumberWindowsCost = new Construction();
        double lumberWindowsCost = (8 * boards + 11 * windows);
        System.out.println("Total: " + lumberWindowsCost);
        double tax = taxRate * lumberWindowsCost;
        double totalCost = lumberWindowsCost + tax;
        System.out.println("Grand Total: " + totalCost);





    }
}
