package com.company;

import java.util.Scanner;
import static com.company.SafeInput.getInt;
import static com.company.SafeInput.getDouble;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int intNum = getInt(in, "What your favorite integer");
        System.out.println(intNum);

        double doubleNum = getDouble(in, "What your favorite double");
        System.out.println(doubleNum);
    }
}
