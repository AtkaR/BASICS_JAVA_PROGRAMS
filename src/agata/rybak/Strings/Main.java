package agata.rybak.Strings;

import java.util.Scanner;

/**
 * Created by asus on 2017-06-02.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String text = sc.nextLine();


        int n_vowels = 0;

        for (int i = 0; i < text.length(); i++)
        {
            char m = Character.toLowerCase(text.charAt(i));

            if (m == 'a' || m == 'e' || m == 'y' || m == 'u' || m == 'i' || m == 'o')
            {
                n_vowels++;
            }
        }

        for(int j=1; j<=n_vowels; j++)
        {
            text = text + "*";
            //text = new StringBuilder(text).append("*").toString();
        }

        System.out.println("Number of vowels = " + n_vowels);
        System.out.println("String: " + text);


    }
}
