package service.menu;

import bean.Config;
import service.inter.menu.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void processAbstract() {
        System.out.println("-------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter surname: ");
        String surname = sc.next();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter school name: ");
        Scanner sc2 = new Scanner(System.in);
        String schoolName = sc2.nextLine();
        System.out.print("Enter class name: ");
        String className = sc.next();
        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        Config.instance().registerPeople("Student", name, surname, age, schoolName, className, gpa, null, 0);
    }
}
