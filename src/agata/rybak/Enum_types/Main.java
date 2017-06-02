package agata.rybak.Enum_types;

import java.util.Scanner;

/**
 * Created by asus on 2017-06-02.
 */
public class Main {
    public static void main(String[] args) {
        FuelType type = FuelType.DIESEL;

        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fuel type");
        str = sc.nextLine();

        if (str.matches(
                "("
                        + FuelType.DIESEL.toString()
                        + "|"
                        + FuelType.PETROL.toString()
                        + "|"
                        + FuelType.GAS.toString() + ")")
                )
        {
            type = FuelType.valueOf(str);
        }

        if (type.equals(FuelType.PETROL))
        {
            System.out.println("PETROL");
        }

        if (type.compareTo(FuelType.DIESEL) < 0)
        {
            System.out.println("PETROL");
        }
    }
}
