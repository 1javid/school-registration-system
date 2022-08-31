package service.menu;

import bean.Config;
import service.inter.menu.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
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
        System.out.print("Enter subject: ");
        Scanner sc3 = new Scanner(System.in);
        String subject = sc3.nextLine();
        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        Config.instance().registerPeople("Teacher", name, surname, age, schoolName, null, 0, subject, salary);
    }
}