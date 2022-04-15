package com.company;
import java.util.Scanner;
import static com.company.SafeInput.getNonZeroLengthString;
import static com.company.SafeInput.getInt;
import static com.company.SafeInput.getDouble;
import static com.company.SafeInput.getRangedInt;
import static com.company.SafeInput.getRangedDouble;
import static com.company.SafeInput.getYNConfirm;
import static com.company.SafeInput.getRegExString;


public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        String name = getNonZeroLengthString(in, "What is your name");
        System.out.println(name);

        int age = getInt(in, "What is your age");
        System.out.println(age);

        double weight = getDouble(in, "What is your weight");
        System.out.println(weight);

        int birthMonth = getRangedInt(in, "what month were you born? ", 0, 12);
        System.out.println(birthMonth);

        double decimal = getRangedDouble(in, "what is your favorite decimal? ", 0, 1);
        System.out.println(decimal);

        boolean yesNo = getYNConfirm(in, "Do, you accept?");
        System.out.println(yesNo);

        String nameCheck = getRegExString(in, "Enter my first name \"kenny\"", "kenny");
        System.out.println(nameCheck);



    }











}
