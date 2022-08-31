package util;

import bean.Account;
import bean.Student;
import bean.Teacher;

import java.util.ArrayList;

public class ReadUtil {

    public static void showAllRegisteredStudents(Account account) {
        ArrayList<Student> studentsList = account.getStudents();
        for (Student student : studentsList) {
            System.out.println(student);
        }
    }

    public static void showAllRegisteredTeachers(Account account) {
        ArrayList<Teacher> teachersList = account.getTeachers();
        for (Teacher teacher : teachersList) {
            System.out.println(teacher);
        }
    }
}
