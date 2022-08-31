package util;

import java.util.Scanner;

public class InputUtil {

    public static String requireText(String title) {
        Scanner con = new Scanner(System.in);
        System.out.print(title + ": ");
        if(title.equalsIgnoreCase("Enter school name"))
            return con.nextLine();
        return con.next();
    }

    public static double requireNumber(String title) {
        Scanner con = new Scanner(System.in);
        System.out.print(title + ": ");
        if(title.equalsIgnoreCase("GPA"))
            return con.nextDouble();
        return con.nextInt();
    }
}