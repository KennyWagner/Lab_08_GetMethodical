package com.company;

import java.util.Scanner;
import static com.company.SafeInput.getRangedDouble;
import static com.company.SafeInput.getYNConfirm;

public class CheckOut
{
        public static void main(String[] args)
        {
            double total = 0;
            Scanner in = new Scanner(System.in);

            do
            {
                total += getRangedDouble(in, "enter the price of your item", 0.50, 9.99);
            }while (getYNConfirm(in, "Do you want to scan another item"));
            System.out.print("Your total is: ");
            System.out.printf("%.2f", total);
            System.out.print("$ ");


        }
}
