package util;

import bean.Account;
import bean.Config;
import bean.Student;
import bean.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateUtil {

    public static void updateStudent(ArrayList<Account> accountsList, String loggedAccountName, String loggedAccountPassword, Config config) {
        int i = (int) InputUtil.requireNumber("Which student's information do you want to update? ");
        System.out.println("""
                    What do you want to update?
                    E.g., Name, Surname, Age, School Name, Class Name, GPA
                    -------------------------------""");

        Scanner con = new Scanner(System.in);
        String changeParams = con.nextLine();

        Student selectedStudent = null;
        for (int j = 0; j < accountsList.size(); j++) {
            if (accountsList.get(j).getUsername().equals(loggedAccountName) && accountsList.get(j).getPassword().equals(loggedAccountPassword)) {
                selectedStudent = config.getAccounts().get(j).getStudents().get(i - 1);
            }
        }

        String[] splitParameters = changeParams.split(", ");
        for (String splitParameter : splitParameters) {
            if (splitParameter.equalsIgnoreCase("Name"))
                selectedStudent.setName(MenuUtil.requireName());
            else if (splitParameter.equalsIgnoreCase("Surname"))
                selectedStudent.setSurname(MenuUtil.requireSurname());
            else if (splitParameter.equalsIgnoreCase("Age"))
                selectedStudent.setAge(MenuUtil.requireAge());
            else if (splitParameter.equalsIgnoreCase("School Name"))
                selectedStudent.setSchoolName(MenuUtil.requireSchoolName());
            else if (splitParameter.equalsIgnoreCase("Class Name"))
                selectedStudent.setClassName(MenuUtil.requireClassName());
            else if (splitParameter.equalsIgnoreCase("GPA"))
                selectedStudent.setGpa(MenuUtil.requireGpa());
        }
    }

    public static void updateTeacher(ArrayList<Account> accountsList, String loggedAccountName, String loggedAccountPassword, Config config) {
        int i = (int) InputUtil.requireNumber("Which teacher's information do you want to update? ");
        System.out.println("""
                    What do you want to update?
                    E.g., Name, Surname, Age, School name, Subject, Salary
                    -------------------------------""");

        Scanner con = new Scanner(System.in);
        String changeParams = con.nextLine();

        Teacher selectedTeacher = null;
        for (int j = 0; j < accountsList.size(); j++) {
            if (accountsList.get(j).getUsername().equals(loggedAccountName) && accountsList.get(j).getPassword().equals(loggedAccountPassword)) {
                selectedTeacher = config.getAccounts().get(j).getTeachers().get(i - 1);
            }
        }

        String[] splitParameters = changeParams.split(", ");
        for (String splitParameter : splitParameters) {
            if (splitParameter.equalsIgnoreCase("Name"))
                selectedTeacher.setName(MenuUtil.requireName());
            else if (splitParameter.equalsIgnoreCase("Surname"))
                selectedTeacher.setSurname(MenuUtil.requireSurname());
            else if (splitParameter.equalsIgnoreCase("Age"))
                selectedTeacher.setAge(MenuUtil.requireAge());
            else if(splitParameter.equalsIgnoreCase("School Name"))
                selectedTeacher.setSchoolName(MenuUtil.requireSchoolName());
            else if (splitParameter.equalsIgnoreCase("Subject"))
                selectedTeacher.setSubject(MenuUtil.requireSubject());
            else if (splitParameter.equalsIgnoreCase("Salary"))
                selectedTeacher.setSalary(MenuUtil.requireSalary());
        }
    }
}
