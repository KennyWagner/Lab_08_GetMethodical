package com.company;

import java.util.Scanner;
import static com.company.SafeInput.getNonZeroLengthString;

public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String name = getNonZeroLengthString(in, "What is your name");
        System.out.println(name);
    }
}
