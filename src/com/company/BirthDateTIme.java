package com.company;

import java.util.Scanner;
import static com.company.SafeInput.getRangedInt;

public class BirthDateTIme
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = getRangedInt(in, "What is your birth year", 1950, 2010);
        int month = getRangedInt(in, "What is your birth month", 1, 12);
        int day = -10;
        switch (month)
        {
            case 1, 3, 5, 7, 8, 10, 12: day = getRangedInt(in, "What day of the month", 1, 31);
                break;
            case 4, 6, 9, 11: day = getRangedInt(in, "What day of the month", 1, 30);
                break;
            case 2: day = getRangedInt(in, "What day of the month", 1, 29);
                break;
        }
        int hour = getRangedInt(in, "On what hour", 1, 24);
        int minute = getRangedInt(in, "On what minute", 1, 59);
        System.out.println("You were born (" + month + "/" + day + "/" + year + ") at (" + hour + ":" + minute + ").");
    }
}
