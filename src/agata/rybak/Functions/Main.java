package agata.rybak.Functions;

import java.util.Random;

/**
 * Created by asus on 2017-06-02.
 */
public class Main {

    public static double area (double a, double b, double c)
    {
        double area = 0;
        double p = 0; // polowa dlugosci obwodu
        p = 0.5*(a+b+c);
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    public static boolean palindrome(String s)
    {
        int n = s.length();
        for( int i = 0; i < n/2; i++ )
            if (s.charAt(i) == s.charAt(n-i-1))
            {
                System.out.println("It is a palindrome!");
                return true;
            }
        System.out.println("I is NOT a palindrome!");
        return false;

    }

    public static int number_of_a (int[] tab, int a)
    {
        Random rnd = new Random();
        int counter = 0;

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = rnd.nextInt(14);
            System.out.print(tab[i] + "\t");
        }
        System.out.println();

        for(int i=0; i < tab.length; i++)
        {
            if(tab[i] == a)
            {
                counter++;
            }
        }
        return counter;
    }

    public static double average (int[] tab, int a, int b)
    {
        Random rnd = new Random();
        int counter = 0;
        double sum = 0;
        double average = 0;

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = rnd.nextInt(14);
            System.out.print(tab[i] + "\t");
        }
        System.out.println();

        for(int i=a; i <= b; i++)
        {
            sum += tab[i];
            counter++;
        }
        average = sum/counter;

        return average;
    }

    public static int[][] generate_table (int w, int k)
    {
        int[][] tab = new int[w][k];
        Random rnd = new Random();

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                tab[i][j] = rnd.nextInt(10);
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        return tab;
    }

    public static void operations (int t[][], int a, int b)
    {
        for(int i = 0; i < t.length; i++)
        {
            for(int j = 0; j < t[i].length; j++)
            {
                if(j%2==0)
                {
                    t[i][j] += a;
                }
                else
                {
                    t[i][j] -= b;
                }
                System.out.print(t[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void number_of_consonants(String s)
    {
        int n_consonants = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char m = Character.toLowerCase(s.charAt(i));

            if (Character.isLetter(m) && !(m == 'a' || m == 'e' || m == 'y' || m == 'u' || m == 'i' || m == 'o'))
            {
                n_consonants++;
            }
        }
        System.out.println("Number of consonants = " + n_consonants);
    }

    public static double summary (int t[][])
    {
        double sum = 0;
        for(int i = 0; i < t.length; i++)
        {
            for(int j = 0; j < t[i].length; j++)
            {
                if(t[i][j] % 3 > 1)
                {
                    sum += t[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        //palindrome("Agata");

        /*double p = area(3,4,5);
        System.out.println("Triangle area= " + p);*/

        /*int[] t = new int[10];
        int ile = number_of_a(t,6);
        System.out.println("Number of a =" + ile);*/

        /*int[] t = new int[10];
        double sr = average(t,3,6);
        System.out.println("Average =" + sr);*/

        /*int tab [][] = generate_table(5,6);
        operations(tab,4,2);*/

        //number_of_consonants("Agata");

        int tab[][] = generate_table(3,4);
        System.out.println(summary(tab));
    }
}
