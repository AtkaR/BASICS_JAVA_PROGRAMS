package agata.rybak.Tables;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by asus on 2017-06-02.
 */
public class Main {

    //----------------------------------- exer.1 ----------------------------------

    public static void exer1()
    {
        Random rnd = new Random();
        int r = 3 + rnd.nextInt(7);
        int[] tab = new int[r];

        double sum = 0;
        int counter = 0;
        double variance = 0;
        double standard_deviation = 0;
        int i =0;

        for (i = 0; i < tab.length; i++)
        {
            tab[i] = 2 + rnd.nextInt(6);
            System.out.println("el" + " = " + tab[i]);
            sum+=tab[i];
            counter++;
        }
        double srednia = sum/counter;
        System.out.println("average: " + srednia);

        sum = 0;
        counter = 0;

        for(i=0; i< tab.length; i++)
        {
            sum=sum + Math.pow((tab[i]-srednia),2);
            counter++;
        }
        variance = sum/counter;
        standard_deviation = Math.sqrt(variance);
        System.out.println("Standard deviation = " + standard_deviation);
    }

    //----------------------------------- exer.2 ----------------------------------

    public static void exer2()
    {
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.nextLine());

        double[] tab = new double[r];

        double average = 0;

        for (int i = 0; i < tab.length; i++)
        {
            System.out.println("Enter the next element of the array: ");
            tab[i] = Double.parseDouble(sc.nextLine());
        }

        double max = tab[0];
        for (int i = 1; i < tab.length; i++)
        {
            if (tab[i] > max)
            {
                max = tab[i];
            }
        }

        double min = tab[0];
        for (int i = 1; i < tab.length; i++)
        {
            if (tab[i] < min)
            {
                min = tab[i];
            }
        }
        average = (max + min) / 2;
        System.out.println("Average = " + average);
    }

    //----------------------------------- exer.3 ----------------------------------

    public static void exer3()
    {
        Random rnd = new Random();
        int r = 2 + rnd.nextInt(7);
        int[] tab = new int[r];

        int counter = 0;

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = rnd.nextInt(9);
            System.out.println("el" + " = " + tab[i]);
            if(tab[i]>0)
            {
                counter++;
            }
        }
        System.out.println("number of elements greater than zero = " + counter);
    }

    //----------------------------------- exer.4 ----------------------------------

    public static void exer4()
    {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int w = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the number of columns: ");
        int k = Integer.parseInt(sc.nextLine());

        int[][] tab = new int[w][k];

        if (w==k)
        {
            System.out.println("It's a square table!");
        }

        double sum = 0;

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                tab[i][j] = rnd.nextInt(10);
                System.out.print(tab[i][j] + "\t");

                if (i == j)
                {
                    sum+=tab[i][j];
                }

            }
            System.out.println();
        }
        System.out.println("Sum of elements diagonally = " + sum);
    }

    //----------------------------------- exer.5 ----------------------------------

    public static void exer5() {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int w = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the number of columns: ");
        int k = Integer.parseInt(sc.nextLine());

        int[][] tab = new int[w][k];

        if (w == k) {
            System.out.println("It's a square table");

            double sum_above = 0;
            double sum_under = 0;
            int counter_above = 0;
            int counter_under = 0;
            double average_above = 0;
            double average_under = 0;

            for (int i = 0; i < w; i++) {
                for (int j = 0; j < k; j++) {
                    tab[i][j] = rnd.nextInt(10);
                    System.out.print(tab[i][j] + "\t");

                    if (i < j) {
                        sum_above += tab[i][j];
                        counter_above++;
                    }

                    if (i > j) {
                        sum_under += tab[i][j];
                        counter_under++;
                    }
                }
                System.out.println();
            }

            average_above = sum_above / counter_above;
            average_under = sum_under / counter_under;

            System.out.println("Average of elements above the diagonal = " + average_above);
            System.out.println("Average of elements under the diagonal = " + average_under);

            if (average_above > average_under) {
                System.out.println("Average of el. above the diagonal i greater and equals: " + average_above);
            } else if (average_above < average_under) {
                System.out.println("Average of el. under the diagonal i greater and equals: " + average_under);
            } else {
                System.out.println("Averages are equal: " + average_above);
            }
        }
    }

    //----------------------------------- exer.6 ----------------------------------

    public static void exer6()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int a = Integer.parseInt(sc.nextLine());

        Random rnd = new Random();
        System.out.println("Enter the number of rows: ");
        int w = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the number of columns: ");
        int k = Integer.parseInt(sc.nextLine());

        int[][] tab = new int[w][k];

        double max = tab[0][0];
        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                tab[i][j] = rnd.nextInt(10);
                System.out.print(tab[i][j] + "\t");
                if(a==i)
                {
                    if (tab[i][j] > max)
                    {
                        max = tab[i][j];
                    }
                }
            }
            System.out.println();
        }
        System.out.println("Max el. in row nr " + a + " = " + max);
    }

    //----------------------------------- exer.7 ----------------------------------

    public static void exer7()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int a = Integer.parseInt(sc.nextLine());

        Random rnd = new Random();
        int r = 2 + rnd.nextInt(7);
        int[] tab = new int[r];

        int counter = 0;

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = rnd.nextInt(80);
            System.out.println("el" + " = " + tab[i]);

            if (tab[i] > a)
            {
                counter++;
            }
        }
        System.out.println("Number of elements greater than your number = " + counter);
    }

    //----------------------------------- exer.8 ----------------------------------

    public static void exer8()
    {
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.nextLine());

        double[] tab = new double[r];

        double average = 0;
        double average_e = 0;
        double sum = 0;
        int counter = 0;

        for (int i = 0; i < tab.length; i++)
        {
            System.out.println("Enter the next element of the table: ");
            tab[i] = Double.parseDouble(sc.nextLine());
        }

        for (int i = 0; i < tab.length; i++)
        {
            sum+=tab[i];
            counter++;
        }
        average = sum/counter;
        System.out.println("Average of table = " + average);

        sum = 0;
        counter = 0;

        for (int i = 0; i < tab.length; i++)
        {
            if (tab[i] < average)
            {
                sum+=tab[i];
                counter++;
            }
        }
        average_e = sum/counter;

        System.out.println("Average of elements = " + average_e);
    }

    //----------------------------------- exer.9 ----------------------------------

    public static void exer9()
    {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int w = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the number of columns: ");
        int k = Integer.parseInt(sc.nextLine());

        double[][] tab = new double[w][k];

        double sum = 0;
        int counter = 0;
        double average = 0;

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                tab[i][j] = rnd.nextInt(10);
                System.out.print(tab[i][j] + "\t");

                sum+=tab[i][j];
                counter++;

            }
            System.out.println();
        }

        average = sum / counter;
        System.out.println("Average = " + average);

        counter = 0;

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if (tab[i][j] >= 2 + average)
                {
                    counter++;
                }
            }
        }
        System.out.println("Number of el. greater than their average of at least 2 = " + counter);
    }

    //----------------------------------- exer.10 ----------------------------------

    public static void exer10()
    {
        Random rnd = new Random();
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.nextLine());

        int[] tab = new int[r];

        double sum = 0;
        int unity = 0;
        int tens = 0;
        int sum_c = 0;

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = 4 + rnd.nextInt(97);
            System.out.println("el" + " = " + tab[i]);
            unity = tab[i] % 10;
            tens = tab[i]/10;
            sum_c = tens + unity;
            System.out.println("Sum_c = " + sum_c + '\n');

            if ((sum_c%2)==0)
            {
                sum+=tab[i];
            }
        }
        System.out.println();
        System.out.println("Sum = " + sum);
    }

    //----------------------------------- exer.11 ----------------------------------

    public static void exer11()
    {
        Random rnd = new Random();
        System.out.println("Enter the size:");
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.nextLine());

        int[] tab = new int[r];

        double sum = 0;
        double average = 0;
        int counter = 0;

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = 4 + rnd.nextInt(97);
            System.out.println("el" + " = " + tab[i]);

            if (tab[i]%5 > tab[i]%8)
            {
                sum+=tab[i];
                counter++;
            }
        }
        average = sum / counter;

        System.out.println("Average = " + average);
    }

    //----------------------------------- exer.12 ----------------------------------

    public static void exer12()
    {
        Random rnd = new Random();
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.nextLine());

        int[] tab = new int[r];

        double average = 0;
        double sum = 0;
        int counter = 0;

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = 4 + rnd.nextInt(97);
            System.out.println("el" + " = " + tab[i]);

            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(tab[i]); j++)
            {

                if (tab[i] % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true)
            {
                System.out.println("PRIME: " + tab[i]);
                sum += tab[i];
                counter++;
            }
        }
        average = sum / counter;

        System.out.println("Average = " + average);
    }

    //----------------------------------- exer.13 ----------------------------------

    public static void exer13()
    {
        Random rnd = new Random();
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.nextLine());

        int[] tab = new int[r];

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = 4 + rnd.nextInt(97);
            System.out.println("el" + " = " + tab[i]);
        }

        int max = tab[0];
        int max2 = tab[0];

        for (int i = 1; i < tab.length; i++)
        {
            if (tab[i] > max)
            {
                max = tab[i];
            }
        }
        System.out.println("The greatest el. of the table = " + max);

        for (int i = 1; i < tab.length; i++)
        {
            if (tab[i] > max2 && tab[i] != max)
            {
                max2 = tab[i];
            }
        }
        System.out.println("Second the greatest el. of the table = " + max2);
    }

    //----------------------------------- exer.14 ----------------------------------

    public static void exer14()
    {
        Random rnd = new Random();
        int w = 1 + rnd.nextInt(5);
        int k = 1 + rnd.nextInt(5);

        int[][] tab = new int[w][k];
        System.out.println("w= " + w + "    k = " + k);

        int sum = 0;
        int max = 0;

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if (w < k)
                    tab[i][j] = -1 + rnd.nextInt(7);
                else if (w > k)
                    tab[i][j] = 8 + rnd.nextInt(5);
                else
                    tab[i][j] = 13 + rnd.nextInt(6);

                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }

        for (int j = 0; j < k; j++)
        {
            sum = 0;
            for (int i = 0; i < w; i++)
            {
                sum = sum + tab[i][j];
            }
            if (max < sum)
            {
                max = sum;
            }
            System.out.println("SUM IN COLUMN NR " + j + " EQUALS " + sum);

        }
        System.out.println("MAX SUM OF COLUMN EQUALS " + max);
    }

    //----------------------------------- exer.15 ----------------------------------

    public static void exer15()
    {
        Random rnd = new Random();
        int w = 1 + rnd.nextInt(5);
        int k = 1 + rnd.nextInt(5);

        System.out.println("w = " + w + "    k = " + k);
        int[][] tab = new int[w][k];

        int counter = 0;
        int index = 0;
        int min= 0;

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if (w < k)
                    tab[i][j] = -1 + rnd.nextInt(7);
                else if (w > k)
                    tab[i][j] = 8 + rnd.nextInt(5);
                else
                    tab[i][j] = 13 + rnd.nextInt(6);

                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }

        int minIdx = tab.length;
        for (int i = 0 ; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if(tab[i][j] < 0)
                {
                    if (i < minIdx)
                    {
                        minIdx = i;
                    }
                    counter++;
                }
            }
        }
        System.out.println("number of negative el. = " + counter);
        System.out.println("The lowest index of row containing the negative el. = " + minIdx);
    }

    //----------------------------------- exer.16 ----------------------------------

    public static void exer16()
    {
        Random rnd = new Random();
        int w = 1 + rnd.nextInt(5);
        int k = 1 + rnd.nextInt(5);

        System.out.println("w = " + w + "    k = " + k);
        int[][] tab = new int[w][k];

        int sum = 0;
        int counter = 0;

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if (w < k)
                    tab[i][j] = -1 + rnd.nextInt(7);
                else if (w > k)
                    tab[i][j] = 8 + rnd.nextInt(5);
                else
                    tab[i][j] = 13 + rnd.nextInt(6);

                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the second number: ");
        int b = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if(tab[i][j]<a || tab[i][j]>b)
                {
                    sum += tab[i][j];
                    counter++;
                }
            }
        }
        double srednia = sum/counter;
        System.out.println("Average = " + srednia);

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if(tab[i][j]>=a && tab[i][j]<=b)
                {
                    tab[i][j] += srednia;
                }
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //----------------------------------- exer.17 ----------------------------------

    public static void exer17()
    {
        Random rnd = new Random();
        int w = 1 + rnd.nextInt(5);
        int k = 1 + rnd.nextInt(5);

        System.out.println("w = " + w + "    k = " + k);
        int[][] tab = new int[w][k];

        double sum = 0;
        double average = 0;
        double variance = 0;
        double standard_deviation = 0;
        int counter = 0;


        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if (w < k)
                    tab[i][j] = -1 + rnd.nextInt(7);
                else if (w > k)
                    tab[i][j] = 8 + rnd.nextInt(5);
                else
                    tab[i][j] = 13 + rnd.nextInt(6);

                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }


        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if(tab[i][j]%2==0)
                {
                    sum+=tab[i][j];
                    counter++;
                }
            }
        }

        average = sum/counter;
        sum = 0;
        counter = 0;

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if(tab[i][j]%2==0)
                {
                    sum=sum + Math.pow((tab[i][j]-average),2);
                    counter++;
                }
            }
        }
        variance = sum/counter;
        standard_deviation = Math.sqrt(variance);

        System.out.println("Standard deviation = " + standard_deviation);
    }

    //----------------------------------- exer.18 ----------------------------------

    public static void exer18()
    {
        Random rnd = new Random();
        int w = 1 + rnd.nextInt(5);
        int k = 1 + rnd.nextInt(5);

        System.out.println("w = " + w + "    k = " + k);
        int[][] tab = new int[w][k];

        int sum = 0;

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if (w < k)
                    tab[i][j] = -1 + rnd.nextInt(7);
                else if (w > k)
                    tab[i][j] = 8 + rnd.nextInt(5);
                else
                    tab[i][j] = 13 + rnd.nextInt(6);

                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if(j%2==0)
                {
                    sum += tab[i][j];
                }
            }
        }

        System.out.println("Sum = " + sum);
        int cyfra = sum/10;

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                tab[i][j]+= cyfra;
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //----------------------------------- exer.19 ----------------------------------

    public static void exer19()
    {
        Random rnd = new Random();
        int w = 1 + rnd.nextInt(5);
        int k = 1 + rnd.nextInt(5);

        System.out.println("w = " + w + "    k = " + k);
        int[][] tab = new int[w][k];

        double sum = 0;

        if(w==k)
        {
            for (int i = 0; i < w; i++)
            {
                for (int j = 0; j < k; j++)
                {
                    tab[i][j] = 13 + rnd.nextInt(6);
                    System.out.print(tab[i][j] + "\t");
                }
                System.out.println();
            }

            for (int i = 0; i < w; i++)
            {
                for (int j = 0; j < k; j++)
                {
                    if(i==j && j%2==0)
                    {
                        sum += tab[i][j];
                    }
                }
            }
            System.out.println("It's a square table!");
            System.out.println("Sum of diagonal elements from even columns = " + sum);
        }
        else
            System.out.println("It's not a square table!");
    }

    //----------------------------------- exer.20 ----------------------------------

    public static void exer20()
    {
        Random rnd = new Random();
        int w = 1 + rnd.nextInt(5);
        int k = 1 + rnd.nextInt(5);

        if(w == k)
            System.out.println("It's a square table!");
        else
            System.out.println("It's not a square table!");

        System.out.println("w = " + w + "    k = " + k);
        int[][] tab = new int[w][k];

        double sum = 0;
        int max= 0;

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if (w < k)
                    tab[i][j] = -1 + rnd.nextInt(7);
                else if (w > k)
                    tab[i][j] = 8 + rnd.nextInt(5);
                else
                    tab[i][j] = 13 + rnd.nextInt(6);

                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                sum += tab[i][j];
                if(max < tab[i][j])
                {
                    max=tab[i][j];
                }
            }
        }
        double srednia = sum / (k*w);
        System.out.println("Average = " + srednia);
        System.out.println("Max = " + max);

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if(tab[i][j] < srednia && max >srednia)
                {
                    tab[i][j] += max;
                }
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //----------------------------------- exer.21 ----------------------------------

    public static void exer21()
    {
        Random rnd = new Random();
        int w = 1 + rnd.nextInt(5);
        int k = 1 + rnd.nextInt(5);

        System.out.println("w = " + w + "    k = " + k);
        double[][] tab = new double[w][k];

        double sum = 0;
        int index = 0;

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if (w < k)
                    tab[i][j] = -1 + rnd.nextInt(7);
                else if (w > k)
                    tab[i][j] = 8 + rnd.nextInt(5);
                else
                    tab[i][j] = 13 + rnd.nextInt(6);

                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < w; i++)
        {
            boolean isPrime = true;

            for (int l = 2; l <= Math.sqrt(i); l++)
            {
                if (i % l == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (i > 1 && isPrime == true)
            {
                for (int j = 0; j < k; j++)
                {
                    sum += tab[i][j];
                }
            }
        }
        System.out.println("Sum = " + sum);
    }

    //----------------------------------- exer.22 ----------------------------------

    public static void exer22()
    {
        Random rnd = new Random();
        int w = 1 + rnd.nextInt(5);
        int k = 1 + rnd.nextInt(5);

        System.out.println("w = " + w + "    k = " + k);
        int[][] tab = new int[w][k];

        int pom = 0;

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if (w < k)
                    tab[i][j] = -1 + rnd.nextInt(7);
                else if (w > k)
                    tab[i][j] = 8 + rnd.nextInt(5);
                else
                    tab[i][j] = 13 + rnd.nextInt(6);

                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < w; i++)
        {
            pom = tab[i][0];
            tab[i][0] = tab[i][k-1];
            tab[i][k-1] = pom;
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //----------------------------------- exer.23 ----------------------------------

    public static void exer23()
    {
        Random rnd = new Random();
        int w = 1 + rnd.nextInt(5);
        int k = 1 + rnd.nextInt(5);

        System.out.println("w = " + w + "    k = " + k);
        int[][] tab = new int[w][k];

        double sum = 0;
        double average = 0;

        for (int i = 0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if (w < k)
                    tab[i][j] = -1 + rnd.nextInt(7);
                else if (w > k)
                    tab[i][j] = 8 + rnd.nextInt(5);
                else
                    tab[i][j] = 13 + rnd.nextInt(6);

                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }

        if(w==1)
        {
            for (int i = 0; i < w; i++)
            {
                for (int j = 0; j < k; j++)
                {
                    sum = tab[0][0] + tab[0][k-1];
                }
            }
            average = sum/2;
        }

        else if(k==1)
        {
            for (int i = 0; i < w; i++)
            {
                for (int j = 0; j < k; j++)
                {
                    sum = tab[0][0] + tab[w-1][0];
                }
            }
            average = sum/2;
        }

        else if( w==1 && k==1 )
        {
            for (int i = 0; i < w; i++)
            {
                for (int j = 0; j < k; j++)
                {
                    average = tab[0][0];
                }
            }
        }

        else
        {
            for (int i = 0; i < w; i++)
            {
                for (int j = 0; j < k; j++)
                {
                    sum = tab[0][0] + tab[0][k-1] + tab[w-1][0] + tab[w-1][k-1];
                }
            }
            average = sum/4;
        }
        System.out.println("Average of elements in the corners of the table equals = " + average);

    }

    //============================================ MAIN ==========================================

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //exer1();
        //exer2();
        //exer3();
        //exer4();
        //exer5();
        //exer6();
        //exer7();
        //exer8();
        //exer9();
        //exer10();
        //exer11();
        //exer12();
        //exer13();
        //exer14();
        //exer15();
        //exer16();
        //exer17();
        //exer18();
        //exer19();
        //exer20();
        //exer21();
        //exer22();
        exer23();
    }

}