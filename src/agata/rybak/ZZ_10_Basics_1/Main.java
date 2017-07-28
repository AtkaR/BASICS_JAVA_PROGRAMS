package agata.rybak.ZZ_10_Basics_1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by asus on 2017-07-28.
 */
public class Main {

    /*============================================ ex1 ================================================*/

    public static int commonDivisors(int x, int y) {
        int counter = 0;
        if (x <= y) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0 && y % i == 0) {
                    counter++;
                }
            }
        } else {
            for (int i = 2; i < y; i++) {
                if (x % i == 0 && y % i == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void ex1() {
        int a = 0;
        int b = 0;
        int sum = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("First number: ");
            a = Integer.parseInt(sc.nextLine());
            System.out.println("Second number: ");
            b = Integer.parseInt(sc.nextLine());
            sum = commonDivisors(a, b);
        }
        while (sum == 0 || (a % sum != 0) || (b % sum != 0));

    }

    /*============================================ ex2 ================================================*/

    public static int theGreatest(int x, int y, int z) {
        int max = 0;
        if (x >= y && x >= z) {
            max = x;
        } else if (y >= x && y >= z) {
            max = y;
        } else {
            max = z;
        }
        return max;
    }

    public static void ex2() {
        Random rnd = new Random();
        int a = 100 + rnd.nextInt(900);
        System.out.println(a);
        int b = 100 + rnd.nextInt(900);
        System.out.println(b);
        int c = 100 + rnd.nextInt(900);
        System.out.println(c);

        int number = theGreatest(a / 100, b / 100, c / 100) * 100
                + theGreatest(a / 10 % 10, b / 10 % 10, c / 10 % 10) * 10
                + theGreatest(a % 10, b % 10, c % 10);
        System.out.println("New number: " + number);
    }

    /*============================================ ex3 ================================================*/

    public static int secondLargest(int x, int y, int z) {
        int smax = 0;
        if (x >= y && x <= z || x <= y && x >= z) {
            smax = x;
        } else if (y >= x && y <= z || y <= x && y >= z) {
            smax = y;
        } else
            smax = z;
        return smax;
    }

    public static void ex3() {
        int a = 0;
        int b = 0;
        int c = 0;
        int sum = 0;

        do {
            Random rnd = new Random();
            a = 10 + rnd.nextInt(91);
            System.out.println(a);
            b = 10 + rnd.nextInt(91);
            System.out.println(b);
            c = 10 + rnd.nextInt(91);
            System.out.println(c);

            sum = a + b + c;
            System.out.println("Sum: " + sum);
            System.out.println("second: " + secondLargest(a, b, c));
        }
        while (sum <= (secondLargest(a, b, c) * 3));
    }

    /*============================================ ex4 ================================================*/

    public static void ex4() {
        int a = 0;
        int b = 0;
        int largest = 0;
        int sum = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("First: ");
            a = Integer.parseInt(sc.nextLine());
            System.out.println("Second: ");
            b = Integer.parseInt(sc.nextLine());

            if (a >= b)
                largest = a;
            else
                largest = b;

            sum = 0;
            while (largest != 0) {
                sum += largest % 10;
                largest /= 10;
            }

            System.out.println("Sum: " + sum);
        }
        while (a + b <= sum);
    }

    /*============================================ ex5 ================================================*/

    public static void ex5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number: ");
        int a = Integer.parseInt(sc.nextLine());

        int even = 0;
        int sum = 0;
        int i = 0;
        int rest = 0;

        while (a != 0) {
            if (i % 2 == 0) {
                rest = a % 10;
                if (rest % 2 == 0) {
                    sum += a % 10;
                }
                rest = 0;
            }
            a /= 10;
            i++;
        }

        System.out.println("Sum: " + sum);
    }

    /*============================================ ex6 ================================================*/

    public static boolean prime(double a) {
        double p = 0;
        int counter = 0;

        for (int i = 1; i < a; i++) {
            p = a % i;
            if (p == 0)
                counter += 1;
        }

        if (counter < 2)
            return true;
        else
            return false;
    }

    public static void ex6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number: ");
        int a = Integer.parseInt(sc.nextLine());

        int sum = 0;

        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }

        System.out.println("Is prime? " + prime(sum));
    }

    /*============================================ ex7 ================================================*/

    public static int evenCounter(int x) {
        int counter = 0;
        int rest = 0;
        while (x != 0) {
            rest = x % 10;
            if (rest % 2 == 0)
                counter++;
            x /= 10;
        }
        return counter;
    }

    public static int digitCounter(int x) {
        int counter = 0;
        while (x != 0) {
            counter++;
            x /= 10;
        }
        return counter;
    }

    public static void ex7() {
        int a = 0;
        int b = 0;
        int c = 0;
        int evenSum = 0;
        int digitSum = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("First: ");
            a = Integer.parseInt(sc.nextLine());
            System.out.println("Second: ");
            b = Integer.parseInt(sc.nextLine());
            System.out.println("Third: ");
            c = Integer.parseInt(sc.nextLine());

            evenSum = evenCounter(a) + evenCounter(b) + evenCounter(c);
            digitSum = digitCounter(a) + digitCounter(b) + digitCounter(c);
        }
        while (evenSum < digitSum);
    }

    /*============================================ ex8 ================================================*/

    public static int oddDivisors(int x) {
        int counter = 0;
        for (int i = 2; i < x; i++)
        {
            if (x%i == 0 && i%2 != 0)
            {
                counter++;
            }
        }
        return counter;
    }

    public static void ex8()
    {
        Random rnd = new Random();
        int a = 30 + rnd.nextInt(71);
        System.out.println(a);
        int b = 30 + rnd.nextInt(71);
        System.out.println(b);

        System.out.println(oddDivisors(a));
        System.out.println(oddDivisors(b));

        if(oddDivisors(a) > oddDivisors(b))
        {
            System.out.println(a + " has more odd divisors!");
        }
        else if (oddDivisors(a) < oddDivisors(b))
        {
            System.out.println(b + " has more odd divisors!");
        }
        else
            System.out.println("Both numbers has the same number of odd divisors!");

    }

    /*============================================ ex9 ================================================*/

    public static void ex9()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your height in centimeters: ");
        double height = Double.parseDouble(sc.nextLine());
        System.out.println("Your weight in kilograms: ");
        double weight = Double.parseDouble(sc.nextLine());

        double bmi = weight/(height*height);

        System.out.format("Your BMI: " + "%.1f%n", bmi);
        if(bmi < 18.5)
        {
            System.out.println("UNDERWEIGHT");
        }
        else if (bmi >= 18.5 && bmi < 25)
        {
            System.out.println("NORMAL WEIGHT");
        }
        else if (bmi >= 25 && bmi < 30)
        {
            System.out.println("OVERWEIGHT");
        }
        else
            System.out.println("OBESITY");
    }

    /*============================================ ex10 ===============================================*/

    public static int gcd(int x, int y)
    {
        while (x != y){
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        return x;
    }

    public static void ex10()
    {
        int a = 0;
        int b = 0;
        int c = 0;
        int gcd = 0;
        int sum = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("First: ");
            a = Integer.parseInt(sc.nextLine());
            System.out.println("Second: ");
            b = Integer.parseInt(sc.nextLine());

            gcd = gcd(a,b);
            System.out.println("GCD: " + gcd);

            sum = 0;
            while (gcd != 0) {
                sum += gcd % 10;
                gcd /= 10;
            }
            System.out.println("Sum: " + sum);

        }
        while(sum <= 10);

    }

    /*============================================ MAIN ===============================================*/

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7(); // ------> NO TAK TROCHE TRESC NIE MA SENSU
        //ex8();
        //ex9();
        ex10();
    }
}
