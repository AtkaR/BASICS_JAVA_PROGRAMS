package agata.rybak.Loops;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by asus on 2017-06-02.
 */

public class Main {
    //-------------------------- exer.1 --------------------------------

    public static void exer1()
    {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;

        do
        {
            System.out.println("Enter the firs number:");
            a = Double.parseDouble(sc.nextLine());
            System.out.println("Enter the second number:");
            b = Double.parseDouble(sc.nextLine());
        }while((2*a)!=b);

        double sum = 0;

        for(double i=a; i<=b; i++)
        {
            if(i%2==0 && i%4==0)
            {
                sum = sum + i;
            }
        }
        System.out.println("Sum = " + sum);
    }

    //-------------------------- exer.2 --------------------------------

    public static void exer2()
    {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int counter = 0;

        Random rnd = new Random();
        a = 3 + rnd.nextInt(18);
        System.out.println("Draw a = " + a);

        do
        {
            System.out.println("Enter the number: ");
            b = Integer.parseInt(sc.nextLine());
            counter++;
        }while(!(b>a));

        System.out.println("Number of tries = " + counter);
    }

    //-------------------------- exer.3 --------------------------------

    public static void exer3()
    {
        Random rnd = new Random();
        int a = rnd.nextInt(10);
        int b = rnd.nextInt(10);
        int sum = 0;

        while((a%2)!=0 && b%2==0);
        {
            a = rnd.nextInt(10);
            b = rnd.nextInt(10);
            sum += a;
        }

        System.out.println(" ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Sum a = " + sum);
    }

    //-------------------------- exer.4 --------------------------------


    public static void exer4()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double a = Double.parseDouble(sc.nextLine());
        double p = 0;

        int counter = 0;
        for (int i = 1; i < a; i++)
        {
            p = a % i;
            if(p == 0)
                counter=counter+1;
        }

        if(counter<2)
            System.out.println("The given number is prime!");
        else
            System.out.println("The given number is not prime!");
    }

    //-------------------------- exer.5 --------------------------------

    public static void exer5()
    {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;

        do
        {
            System.out.println("Enter the firs number:");
            a=Integer.parseInt(sc.nextLine());
            System.out.println("Enter the second number:");
            b=Integer.parseInt(sc.nextLine());
        }while(a>=b);

        int counter = 0;

        for(int i=a; i<= b; i++)
        {
            int unity = i % 10;
            if (unity < 5)
            {
                counter++;
            }
        }
        System.out.println("RESULT = " + counter);
    }

    //-------------------------- exer.6 --------------------------------

    public static void exer6()
    {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        do
        {
            System.out.println("Enter the first number:");
            a=Integer.parseInt(sc.nextLine());
            System.out.println("Enter the second number:");
            b=Integer.parseInt(sc.nextLine());
        }while(!(a>=10 && a<=30 && b>=40 && b<=60));

        int sum = 0;
        int sum_c = 0;
        int unity = 0;
        int tens = 0;

        for(int i=a; i<= b; i++)
        {
            unity = i % 10;
            tens = i/10;
            sum_c = tens + unity;

            if ((sum_c%2)!=0)
            {
                sum+=i;
            }
        }

        System.out.println("Sum = " + sum);
    }

    //-------------------------- exer.7 --------------------------------

    public static void exer7()
    {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        do
        {
            System.out.println("Enter the firs number:");
            a=Integer.parseInt(sc.nextLine());
            System.out.println("Enter the second number:");
            b=Integer.parseInt(sc.nextLine());
        }while(b%a!=0 || a==b);

        int counter = 0;

        for(int i=a; i<=b; i++)
        {
            if(i*b >= 2*a)
                counter++;
        }

        System.out.println("Numbers that meet the condition = " + counter);
    }

    //-------------------------- exer.8 --------------------------------


    public static void exer8()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=Integer.parseInt(sc.nextLine());
        System.out.println("Enter the second number:");
        int b=Integer.parseInt(sc.nextLine());

        int pom = 0;

        if(a>=0 && b>=0)
        {
            while(b!=0)
            {
                pom = b;
                b = a%b;
                a = pom;
            }
        }
        else System.out.println("Only positive numbers.");

        System.out.println("NWD = " + a);
    }

    //-------------------------- exer.9 --------------------------------

    public static void exer9()
    {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        do
        {
            System.out.println("Enter first number:");
            a=Integer.parseInt(sc.nextLine());
            System.out.println("Enter second number:");
            b=Integer.parseInt(sc.nextLine());
        }while(3*a>b);

        int counter = 0;
        double sum = 0;

        for(int i=a; i<= b; i++)
        {
            sum+=i;
            counter++;
        }

        System.out.println("Average = " + (sum/counter));
    }

    //-------------------------- exer.10 --------------------------------

    public static void exer10()
    {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        do
        {
            System.out.println("Enter the first number:");
            a=Integer.parseInt(sc.nextLine());
            System.out.println("Enter the second number:");
            b=Integer.parseInt(sc.nextLine());
        }while(3*a>b);

        int counter = 0;
        double sum = 0;
        double average = 0;
        double variance = 0;
        double standard_deviation = 0;
        int i = 0;

        for(i=a; i<= b; i++)
        {
            sum+=i;
            counter++;
        }
        average = sum/counter;

        sum = 0;
        counter = 0;

        for(i=a; i<= b; i++)
        {
            sum=sum + Math.pow((i-average),2);
            counter++;
        }
        variance = sum/counter;
        standard_deviation = Math.sqrt(variance);

        System.out.println("Standard deviation = " + standard_deviation);
    }

    public static void main(String[] args) {
        //exer1();
        //exer2();
        //exer3();
        //exer4();
        //exer5();
        //exer6();
        //exer7();
        //exer8();
        //exer9();
        exer10();
    }
}

