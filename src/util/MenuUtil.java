package util;

import java.util.Scanner;

public class MenuUtil {

    public static void showMenu() {

        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select menu");
        int selectedMenuNumber = sc.nextInt();

        Menu selectedMenu =  Menu.find(selectedMenuNumber);
        selectedMenu.process();
    }

    public static void showSuccessMessage() {
        System.out.println("-------------------------------");
        System.out.println("Operation completed successfully.\n");
    }

    public static String requireName() {
        return InputUtil.requireText("Enter name");
    }

    public static String requireSurname() {
        return InputUtil.requireText("Enter surname");
    }

    public static int requireAge() {
        return (int) InputUtil.requireNumber("Enter age");
    }

    public static String requireSchoolName() {
        return InputUtil.requireText("Enter school name");
    }

    public static String requireClassName() {
        return InputUtil.requireText("Enter class name");
    }

    public static double requireGpa() {
        return InputUtil.requireNumber("Enter GPA");
    }

    public static String requireSubject() {
        return InputUtil.requireText("Enter subject");
    }

    public static double requireSalary() {
        return InputUtil.requireNumber("Enter salary");
    }
}
