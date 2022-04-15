package com.company;

import java.util.Scanner;
import static com.company.SafeInput.getRegExString;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + ssn);

        String mNum = getRegExString(in, "Enter your school M number", "(M|m)\\d{5}");
        System.out.println("Your Mnumber is: " + mNum);

        String menu = getRegExString(in, "Open, save, View, Quit: type [O, S, V, Q]", "[OoSsVvQq]");
        System.out.println("You have chosen: " + menu);
    }
}
