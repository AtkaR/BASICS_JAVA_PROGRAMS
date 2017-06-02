package agata.rybak.Regular_expressions;

import java.util.Scanner;

/**
 * Created by asus on 2017-06-02.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nap = "";

        //krzysztof.makowski@final.pl
        //String s1 = "[a-z]+\\.[a-z]+@final.pl";

        //dwie rozne domeny sa ok
        //String s1 = "[a-z]+\\.[a-z]+@(final.pl|agh.pl)";

        //ul. Cicha 7 42-454 Warszawa Polska
        //String s1 = "ul\\.\\s[A-Z][a-z]+\\s[1-9][0-9]{0,2}\\s[0-9]{2}-[0-9]{3}\\s[A-Z][a-z]+\\s[A-Z][a-z]+";

        //+48 546 345 675
        //String s1 = "\\+[0-9]{2}\\s[0-9]{3}\\s[0-9]{3}\\s[0-9]{3}";

        //2013-12-01 12:34:20
        //String s1 = "[0-9]{4}-[0-9]{2}-[0-9]{2}\\s[0-9]{2}:[0-9]{2}:[0-9]{2}";

        //SZA 65789
        //WI 23AGH
        //String s1 = "[A-Z]{2,3}\\s[A-Z|0-9]{5}";

        //Dr inz. hab. Stefan Puka
        //Dr hab. Stefan Puka
        //Dr Stefan Puka
        //Dr inz. Stefan Puka
        String s1 = "(Dr|Dr\\sinz.|Dr\\sinz.\\shab.|Dr\\shab\\.)\\s[A-Z][a-z]+\\s[A-Z][a-z]+";


        do
        {
            System.out.println("Enter the string");
            nap = sc.nextLine();
        }while(!nap.matches(s1));

        System.out.println("GOOD");

    }

}
