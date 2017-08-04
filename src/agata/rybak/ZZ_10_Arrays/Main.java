package agata.rybak.ZZ_10_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by asus on 2017-07-30.
 */
public class Main {
    /*============================================ ex1 ===============================================*/

    public static boolean divisors(int x) {
        int counter = 0;
        for (int i = 2; i < x; i++)
        {
            if (x%i == 0)
            {
                counter++;
            }
        }

        if(counter == 2)
            return  true;
        else
            return false;

    }

    public static void ex1()
    {
        Random rnd = new Random();
        int r = 10 + rnd.nextInt(91);
        int tab[] = new int[r];
        System.out.println(r);
        int sum = 0;

        do {
            sum = 0;
            for(int i = 0; i < r; i++)
            {
                tab[i] = 100 + rnd.nextInt(191);
                sum += tab[i];
            }
        }
        while(divisors(sum) == false);

        System.out.println("Sum: " + sum);

        Arrays.sort(tab);

        for(int i = 0; i < r; i++)
        {
            System.out.println("tab: " + tab[i]);
        }

        int maxSum = tab[r-1];
        int last = tab[r-1];
        int counter = 1;

        for(int i = r-2; i >= 0; i--)
        {
            if(tab[i] != last && counter < 4 )
            {
                maxSum += tab[i];
                last = tab[i];
                counter++;
            }
        }

        System.out.println("Sum of the largest four: " + maxSum);

    }

    /*============================================ ex2 ===============================================*/

    public static void ex2()
    {
        Random rnd = new Random();
        int r = 10 + rnd.nextInt(31);
        int tab[] = new int[r];

        for(int i = 0; i < r; i++)
        {
            tab[i] = 30 + rnd.nextInt(21);
            System.out.println("Tab: " + tab[i]);
        }

        int min = Integer.MAX_VALUE;
        int index1 = 0;
        int index2 = 0;
        int last = tab[0];
        int difference = 0;
        for(int i = 1; i < r; i++)
        {
            difference = Math.abs(last - tab[i]);
            if(difference < min)
            {
                min = difference;
                index1 = i-1;
                index2 = i;
            }
            last = tab[i];
        }

        System.out.println("The min difference between two elements is: " + min);
        System.out.println("These elements index: " + index1 + " " + index2);
        System.out.println("These elements value: " + tab[index1] + " " + tab[index2]);

        int tab2[] = new int[r];

        for(int i = 0; i < r; i++)
        {
            if (index2 == r-1)
            {
                tab2[i] = tab[i];
            }
            else if (i < index1 && index2 != r-1)
            {
                tab2[i] = tab[i];
            }
            else if (i >= index1 && index2 != r-1 && i < r-2)
            {
                tab2[i] = tab[i+2];
            }
            else if (i >= index1 && index2 != r-1 && i >= r-2)
            {
                tab2[r-2] = tab[index1];
                tab2[r-1] = tab[index2];
            }
            else
                System.out.println("error");
        }

        for(int i = 0; i < r; i++)
        {
            System.out.println("tab2: " + tab2[i]);
        }
    }

    /*============================================ ex3 ===============================================*/

    public static int gcd(int x, int y)
    {
        while (x != y){
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        System.out.println("GCD: " + x);
        return x;
    }

    public static int digitSum(int x)
    {
        int sum = 0;
        while(x != 0)
        {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void ex3 ()
    {
        Random rnd = new Random();
        int r = 10 + rnd.nextInt(21);
        int tab[] = new int[r];

        for(int i = 0; i < r; i++)
        {
            if(i % 2 == 0)
            {
                tab[i] = 20 + rnd.nextInt(31);
            }
            else
            {
                tab[i] = 30 + rnd.nextInt(31);
            }
        }

        int counter = 0;

        for(int i = 0; i < r; i++)
        {
            System.out.println("tab: " + tab[i]);
            if(gcd(r,digitSum(tab[i])) % 2 == 0)
            {
                counter++;
            }
        }

        System.out.println("There is " + counter + " such numbers!");
    }

    /*============================================ ex4 ===============================================*/

    public static void ex4()
    {
        Random rnd = new Random();
        int r = 10 + rnd.nextInt(11);
        int tab[] = new int[r];

        for(int i = 0; i < r; i++)
        {
            tab[i] = 200 + rnd.nextInt(361);
            System.out.print(tab[i] + " ");
        }

        System.out.println();

        int temp;
        int zmiana = 1;
        while(zmiana > 0){
            zmiana = 0;
            for(int i=0; i<tab.length-1; i++){
                if(digitSum(tab[i]) < digitSum(tab[i+1])){
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }
            }
        }

        for(int i = 0; i < r; i++)
        {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        double sum = 0;
        double average = 0;
        for(int i = 0; i < r; i++)
        {
            sum += tab[i];
        }
        average = sum/r;

        System.out.println("Average: " + average);

        int tab2[][] = new int[3][r];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < r; j++)
            {
                if(i == 0)
                {
                    tab2[i][j] = tab[j] - (int)average;
                }
                else if(i == 1)
                {
                    tab2[i][j] = tab[j];
                }
                else
                {
                    tab2[i][j] = tab[j] + (int)average;
                }
            }
        }


        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(tab2[i][j] + " ");
            }
            System.out.println();
        }

        int sumC = 0;
        int idx = 0;
        int min = Integer.MAX_VALUE;
        for(int j = 0; j < r; j++) {
            sumC = 0;
            for (int i = 0; i < 3; i++) {
                sumC += tab2[i][j];
            }
            if (sumC < min)
            {
                min = sumC;
                idx = j;
            }
        }

        System.out.println("Min value in column has column: " + idx + " , it's value: " + min);
    }

    /*============================================ ex5 ===============================================*/

    public static int change(int x)
    {
        int unit = x % 10;
        int dozens = x / 10 % 10;
        int hundreds = x / 100;

        if(unit > hundreds)
        {
            return hundreds * 100 + unit * 10 + dozens;
        }
        else if(unit < hundreds && dozens != 0)
        {
            return dozens * 100 + hundreds * 10 + unit;
        }
        else
            return x;
    }

    public static void ex5()
    {
        Random rnd = new Random();
        int r = 5 + rnd.nextInt(26);
        int tab[] = new int[r];
        int i = 0;
        for (i = 0; i < r; i++)
        {
            do {
                tab[i] = 100 + rnd.nextInt(900);
            }
            while (!(tab[i]/100%2 == 0 && tab[i]%10%2 ==0 && tab[i]/100 != tab[i]%10));
            System.out.print(tab[i] + " ");
        }

        System.out.println();
        int tab2[] = new int[r];
        for (i = 0; i < r; i++)
        {
            tab2[i] = change(tab[i]);
            System.out.print(tab2[i] + " ");
        }

    }
    /*============================================ ex6 ===============================================*/


    public static void ex6()
    {
        int v = 0;
        int c = 0;
        Random rnd = new Random();
        do {
            v = 2 + rnd.nextInt(19);
            c = 2 + rnd.nextInt(19);
            System.out.println("V: " + v + "  C: " + c);
        }
        while(!(v >= c / 2 + 3));

        int tab[][] = new int[v][c];

        for(int i = 0; i < v; i++) {
            for (int j = 0; j < c; j++) {
                tab[i][j] = 30 + rnd.nextInt(71);
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }

        double sumF = 0;
        double avgF = 0;
        double avgS = 0;
        double avgT = 0;
        int idxI = 0;
        int idxJ = 0;

        for(int i = 0; i < v; i++) {
            sumF = 0;
            avgT = avgS;
            avgS = avgF;
            for (int j = 0; j < c; j++) {
                sumF += tab[i][j];
            }
            avgF = sumF / c;

            //System.out.println("F: " + avgF + " S: " + avgS + " T: " + avgT);

            if(avgS >= avgF && avgS <= avgT)
            {
                for(int l = i; l == i; l++) {
                    for (int m = 0; m < c; m++) {
                        tab[l][m] = 0;
                    }
                    System.out.println("Number of verse: " + i);
                }
            }
        }

        for(int i = 0; i < v; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /*============================================ ex7 ===============================================*/

    public static boolean isDifferent(int x, int[] tab2)
    {
        int counter = 0;
        for(int i = 0; i < tab2.length; i++)
        {
            //System.out.print(tab2[i] + "\t");
            if(x == tab2[i])
            {
                counter++;
            }
        }
        //System.out.println();

        if(counter != 0)
            return false;
        else
            return true;
    }

    public static void ex7()
    {
        Random rnd = new Random();
        int r = 10 + rnd.nextInt(11);
        int tab[] = new int[r];

        for(int i = 0; i < r; i++)
        {
            tab[i] = 100 + rnd.nextInt(900);
            System.out.print(tab[i] + "\t");
        }
        System.out.println();

        int tab2[] = new int[10];

        for(int i = 0; i < tab2.length; i++)
        {
            tab2[i] = 10;
        }
        int counter = 0;
        int unit = 0;
        int dozens = 0;
        int hundreds = 0;

        for(int i = 0; i < tab.length; i++)
        {
            unit = tab[i] % 10;
            dozens = tab[i] / 10 % 10;
            hundreds = tab[i] / 100;

            if(isDifferent(hundreds, tab2) == true)
            {
                tab2[counter] = tab[i]/100%10;
                counter++;
            }
            if (isDifferent(dozens, tab2) == true && hundreds != dozens)
            {
                tab2[counter] = tab[i]/10%10;
                counter++;
            }
            if (isDifferent(unit, tab2) == true && hundreds != dozens && unit != dozens)
            {
                tab2[counter] = tab[i]%10;
                counter++;
            }
        }

        for(int i = 0; i < tab2.length; i++)
        {
            if(tab2[i] != 10)
                System.out.print(tab2[i] + "\t");
        }
    }

    /*============================================ ex8 ===============================================*/

    public static void fillThird(int current, int[] sorted)
    {
        for (int j = 0; j < sorted.length; j++) {
            if (sorted[j] == 0) {
                sorted[j] = current;
                break;
            }
            if (current < sorted[j]) {
                for (int k = sorted.length - 1; k > j; k--) {
                    sorted[k] = sorted[k - 1];
                }
                sorted[j] = current;
                break;
            }
        }
    }

    public static void ex8()
    {
        Random rnd = new Random();
        int r = 5 + rnd.nextInt(16);
        int tab[] = new int[r];
        int tab2[] = new int[r];

        for(int i = 0; i < r; i++)
        {
            do {
                tab[i] = 10 + rnd.nextInt(91);
            }
            while(tab[i] % 2 != 0);

            System.out.print(tab[i] + "\t");
        }
        System.out.println();

        for(int i = 0; i < r; i++)
        {
            do {
                tab2[i] = 50 + rnd.nextInt(101);
            }
            while(tab2[i] % 2 == 0);

            System.out.print(tab2[i] + "\t");
        }
        System.out.println();

        int sorted[] = new int[r+r];

        for(int i = 0; i < r; i++)
        {
            fillThird(tab[i],sorted);
            fillThird(tab2[i],sorted);
        }

        for(int i = 0; i < 2*r; i++)
        {
            System.out.print(sorted[i] + "\t");
        }
        System.out.println();

    }

    /*============================================ ex9 ===============================================*/

    public static void neighborhood(int x, int y, int[][] tab, int v, int c)
    {
        int sum = 0;
        double average = 0;

        if(x == 0 && y == 0)
        {
            if(tab[x][y] < tab[0][1] && tab[x][y] < tab[1][0] && tab[x][y] < tab[1][1])
            {
                sum += tab[0][1] + tab[1][0] + tab[1][1];
                average = sum / 3;
                System.out.println("Index: " + x + ", " + y);
                tab[x][y] += average;
            }
        }
        else if(x == 0 && y == v-1)
        {
            if(tab[x][y] < tab[0][v-2] && tab[x][y] < tab[1][v-1] && tab[x][y] < tab[1][v-2])
            {
                sum += tab[0][v-2] + tab[1][v-1] + tab[1][v-2];
                average = sum / 3;
                System.out.println("Index: " + x + ", " + y);
                tab[x][y] += average;
            }
        }
        else if(x == v-1 && y == c-1)
        {
            if(tab[x][y] < tab[v-2][c-1] && tab[x][y] < tab[v-1][c-2] && tab[x][y] < tab[v-2][c-2])
            {
                sum += tab[v-2][c-1] + tab[v-1][c-2] + tab[v-2][c-2];
                average = sum / 3;
                System.out.println("Index: " + x + ", " + y);
                tab[x][y] += average;
            }
        }
        else if(x == c-1 && y == 0)
        {
            if(tab[x][y] < tab[c-2][0] && tab[x][y] < tab[c-1][1] && tab[x][y] < tab[c-2][1])
            {
                sum += tab[c-2][0] + tab[c-1][1] + tab[c-2][1];
                average = sum / 3;
                System.out.println("Index: " + x + ", " + y);
                tab[x][y] += average;
            }
        }
        else if(x == 0  && y > 0 && y < c-1)
        {
            if(tab[x][y] < tab[x][y-1] && tab[x][y] < tab[x+1][y-1] && tab[x][y] < tab[x+1][y] && tab[x][y] < tab[x+1][y+1] && tab[x][y] < tab[x][y+1])
            {
                sum += tab[x][y-1] + tab[x+1][y-1] + tab[x+1][y] + tab[x+1][y+1] + tab[x][y+1];
                average = sum / 5;
                System.out.println("Index: " + x + ", " + y);
                tab[x][y] += average;
            }
        }
        else if(x > 0  && x < v-1 && y == c-1)
        {
            if(tab[x][y] < tab[x-1][y] && tab[x][y] < tab[x-1][y-1] && tab[x][y] < tab[x][y-1] && tab[x][y] < tab[x+1][y-1] && tab[x][y] < tab[x+1][y])
            {
                sum += tab[x-1][y] + tab[x-1][y-1] + tab[x][y-1] + tab[x+1][y-1] + tab[x+1][y];
                average = sum / 5;
                System.out.println("Index: " + x + ", " + y);
                tab[x][y] += average;
            }
        }
        else if(x == v-1  && y > 0 && y < c-1)
        {
            if(tab[x][y] < tab[x][y-1] && tab[x][y] < tab[x-1][y-1] && tab[x][y] < tab[x-1][y] && tab[x][y] < tab[x-1][y+1] && tab[x][y] < tab[x][y+1])
            {
                sum += tab[x][y-1] + tab[x-1][y-1] + tab[x-1][y] + tab[x-1][y+1] + tab[x][y+1];
                average = sum / 5;
                System.out.println("Index: " + x + ", " + y);
                tab[x][y] += average;
            }
        }
        else if(x > 0  && x < v-1 && y == 0)
        {
            if(tab[x][y] < tab[x-1][y] && tab[x][y] < tab[x-1][y+1] && tab[x][y] < tab[x][y+1] && tab[x][y] < tab[x+1][y+1] && tab[x][y] < tab[x+1][y])
            {
                sum += tab[x-1][y] + tab[x-1][y+1] + tab[x][y+1] + tab[x+1][y+1] + tab[x+1][y];
                average = sum / 5;
                System.out.println("Index: " + x + ", " + y);
                tab[x][y] += average;
            }
        }
        else if(x > 0 && x < v-1 && y > 0 && y < c-1)
        {
            if(tab[x][y] < tab[x-1][y-1] &&
                    tab[x][y] < tab[x-1][y] &&
                    tab[x][y] < tab[x-1][y+1] &&
                    tab[x][y] < tab[x][y+1] &&
                    tab[x][y] < tab[x+1][y+1]  &&
                    tab[x][y] < tab[x+1][y]  &&
                    tab[x][y] < tab[x+1][y-1]  &&
                    tab[x][y] < tab[x][y-1])
            {
                sum += tab[x-1][y-1] + tab[x-1][y] + tab[x-1][y+1] + tab[x][y+1] + tab[x+1][y+1] + tab[x+1][y] + tab[x+1][y-1] + tab[x][y-1];
                average = sum / 8;
                System.out.println("Index: " + x + ", " + y);
                tab[x][y] += average;
            }
        }
    }

    public static void ex9()
    {
        Random rnd = new Random();
        int v = 10 + rnd.nextInt(11);
        int c = 10 + rnd.nextInt(11);
        int tab[][] = new int[v][c];

        for(int i = 0; i < v; i++)
        {
            for(int j = 0; j< c; j++)
            {
                tab[i][j] = 15 + rnd.nextInt(35);
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }


        for(int i = 0; i < v; i++)
        {
            for (int j = 0; j < c; j++)
            {
                neighborhood(i,j,tab,v,c);
            }
        }

        for(int i = 0; i < v; i++)
        {
            for(int j = 0; j< c; j++)
            {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /*============================================ ex10 ===============================================*/

    public static void ex10()
    {
        Random rnd = new Random();
        int v = 5 + rnd.nextInt(4);
        int c = 5 + rnd.nextInt(4);
        int tab[][] = new int[v][c];

        for(int i = 0; i < v; i++)
        {
            for(int j = 0; j< c; j++)
            {
                tab[i][j] = 10 + rnd.nextInt(21);
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }

        int temp=0;
        for(int y=0; y<c; y++)
        {
            for(int x=0; x<v; x++)
            {
                for(int j=0; j<c; j++)
                {
                    for(int i=0; i<v; i++)
                    {
                        if(tab[i][j]>tab[x][y])
                        {
                            temp=tab[x][y];
                            tab[x][y]=tab[i][j];
                            tab[i][j]=temp;
                        }
                    }
                }
            }
        }

        System.out.println("------------------------");

        for(int i = 0; i < v; i++)
        {
            for(int j = 0; j< c; j++)
            {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }

        int counter = 0;
        int max = 0;
        int last = 0;
        int value = 0;

        for(int j = 0; j < c; j++)
        {
            counter = 0;
            max = 0;
            last = 0;

            for(int i = 0; i < v; i++)
            {
                if (tab[i][j] > last)
                {
                    counter = 0;
                    counter++;
                }
                else
                {
                    counter++;
                }

                if (counter > max)
                {
                    max = counter;
                    value = tab[i][j];
                }
                last = tab[i][j];
            }
            System.out.println("Most common in column: " + value + " and it repeats " + max + " times!");
        }

    }

    /*============================================ MAIN ===============================================*/

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        ex10();
    }
}
