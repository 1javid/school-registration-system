package util;

import bean.Config;
import bean.Student;
import bean.Teacher;

public class CreateUtil {

    public static void registerStudents(String name, String surname, int age, String schoolName, String className, double gpa, int i) {
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        s.setAge(age);
        s.setSchoolName(schoolName);
        s.setClassName(className);
        s.setGpa(gpa);
        Config.instance().getAccounts().get(i).getStudents().add(s);
    }

    public static void registerTeachers(String name, String surname, int age, String schoolName, String subject, int salary, int i) {
        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);
        t.setAge(age);
        t.setSchoolName(schoolName);
        t.setSubject(subject);
        t.setSalary(salary);
        Config.instance().getAccounts().get(i).getTeachers().add(t);
    }
}
