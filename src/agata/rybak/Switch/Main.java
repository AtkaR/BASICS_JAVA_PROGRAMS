package agata.rybak.Switch;

import java.util.Scanner;

/**
 * Created by asus on 2017-06-02.
 */

public class Main {
    //-------------------------- exer.1 --------------------------------

    public static void exer1()
    {
        System.out.println("The program calculates the roots of the square equation");

        double a = 0;
        double b = 0;
        double c = 0;
        double delta;
        double result = 0;

        System.out.println("Enter the first parameter of the equation:");
        Scanner sc = new Scanner(System.in);
        a = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the second parameter of the equation:");
        b = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the third parameter of the equation:");
        c = Double.parseDouble(sc.nextLine());

        if(a==0)
        {
            System.out.println("This is not a square function.");
        }
        else
        {
            delta = b*b-4*a*c;
            if (delta<0)
            {
                System.out.println("No solution.");
            }
            if(delta==0)
            {
                System.out.println("The equation has 1 root, x1 = " + (-b/(2*a)) );
            }
            if(delta>0)
            {
                System.out.println("x1 = " + (-b-Math.sqrt(delta))/(2*a) );
                System.out.println("x2 = " + (-b+Math.sqrt(delta))/(2*a) );
            }
        }
    }

    //-------------------------- exer.2 --------------------------------

    public static void exer2()
    {
        System.out.println("MENU CALCULATOR FIGURES");
        System.out.println("1. SQUARE");
        System.out.println("2. RECTANGLE");
        System.out.println("3. EQUILATERAL TRIANGLE");
        System.out.println("YOUR CHOICE:");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());

        double a = 0;
        double b = 0;
        double area = 0;
        double circuit = 0;
        switch(choice)
        {
            case 1:
                System.out.println("SQUARE");
                System.out.println("Length of square side.:");
                a = Double.parseDouble(sc.nextLine());
                area = a * a;
                circuit = 4 * a;
                System.out.println("Area = " + area);
                System.out.println("Circuit = " + circuit);
                break;
            case 2:
                System.out.println("RECTANGLE");
                System.out.println("Length of the first rectangle side:");
                a = Double.parseDouble(sc.nextLine());
                System.out.println("Length of the second rectangle side:");
                b = Double.parseDouble(sc.nextLine());
                area = a * b;
                circuit = 2 * a + 2 * b;
                System.out.println("Area = " + area);
                System.out.println("Circuit = " + circuit);
                break;
            case 3:
                System.out.println("EQUILATERAL TRIANGLE");
                System.out.println("Length of triangle side:");
                a = Double.parseDouble(sc.nextLine());
                area = (a * a * Math.sqrt(3))/4;
                circuit = 3 * a;
                System.out.println("Area = " + area);
                System.out.println("Circuit = " + circuit);
                break;
            default:
                System.out.println("There is no such option!");
        }
    }

    //-------------------------- exer.3 --------------------------------

    public static void exer3()
    {
        double a = 0;
        double b = 0;
        double c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the second number:");
        b = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the third number:");
        c = Double.parseDouble(sc.nextLine());


        if (a<b+c || b<a+c || c<a+b)
        {
            System.out.println("With the given lengths of sides, you can create a triangle.");
            {
                if ((a*a+b*b==c*c) || (a*a+c*c==b*b) || (c*c+b*b==a*a))
                    System.out.println("even a rectangular trout!");
            }
        }
        else
        {
            System.out.println("You can not create a triangle with the given lengths!");
        }

    }

    //-------------------------- exer.4 --------------------------------

    public static void exer4()
    {
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double f = 0;
        double average = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the second number:");
        b = Double.parseDouble(sc.nextLine());

        if(a>b)
            c=a;
        else
            c=b;
        System.out.println("The larger of the first two numbers = " + c + '\n');

        System.out.println("Enter the third number:");
        d = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the fourth number:");
        e = Double.parseDouble(sc.nextLine());

        if (d>e)
            f=d;
        else
            f=e;

        System.out.println("The larger of the second two numbers = " + f + '\n');

        average = (c+f)/2;
        System.out.println("The arithmetic mean of two larger numbers = " + average);
    }
    public static void main(String[] args) {
        //exer1();
        //exer2();
        //exer3();
        exer4();
    }
}
