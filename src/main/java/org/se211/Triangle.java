package org.se211;

import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int side1, side2, side3;

        System.out.println("\nTo determine the type of triangle please enter the lengths of the sides. " +
                "\nEach length MUST be entered in INCREASING order of size.\n");

        System.out.println("Side 1: ");
        side1 = keyboard.nextInt();

        System.out.println("Side 2: ");
        side2 = keyboard.nextInt();

        System.out.println("Side 3: ");
        side3 = keyboard.nextInt();

        //To check to see if it is an triangle
        // The sum of two smaller sides must be greater than the longest side to be a triangle
        if((side1 + side2 > side3))
        {
            //To check to see if it an Equilateral triangle (3 equal sides)
            if((side1==side2) && (side2==side3))
            {
                System.out.print("\n RESULT: An Equilateral Triangle.");
            }//if

            //To check to see if it is an Isosceles triangle (2 of the same size and 1 different)
            else if ((side1 == side2) & (side2 == side3) || (side2 == side3) & (side3!= side1))
            {
                System.out.print("\n RESULT: An Isosceles Triangle.");
            }//else if

            //To check to see if it is a Scalene triangle (3 different sizes)
            else if((side1 != side2) & (side2 != side3))
            {
                System.out.print("\n RESULT: A Scalene Triangle.");
            }//else if

        }//if

        //Sum of two smaller sides is smaller than the longest side
        //When it is not a triangle it will print this.
        else
        {
            System.out.print("\n RESULT: This Triangle is NOT possible.");
        }//else


    }//main
}//class



