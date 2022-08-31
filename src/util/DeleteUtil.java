package util;

import bean.Account;
import bean.Config;
import bean.Student;
import bean.Teacher;

import java.util.ArrayList;

public class DeleteUtil {

    public static void deleteStudent(ArrayList<Account> accountsList, String currentAccountUsername, String currentAccountPassword, Config config, int index) {
        int i = (int) InputUtil.requireNumber("Which student's information do you want to delete? ");
        ArrayList<Student> studentsArray = new ArrayList<>();
        for (int j = 0; j < accountsList.size(); j++) {
            if (accountsList.get(j).getUsername().equals(currentAccountUsername) && accountsList.get(j).getPassword().equals(currentAccountPassword)) {
                studentsArray = config.getAccounts().get(j).getStudents();
                index = j;
            }
        }

        ArrayList<Student> updatedStudentsArray = new ArrayList<>(studentsArray.size() - 1);

        int k = 0;
        for (int j = 0; j < studentsArray.size(); j++) {
            if (j != (i - 1)) {
                updatedStudentsArray.add(k, studentsArray.get(j));
                k++;
            }
        }

        Config.instance().getAccounts().get(index).setStudents(updatedStudentsArray);
    }

    public static void deleteTeacher(ArrayList<Account> accountsList, String currentAccountUsername, String currentAccountPassword, Config config, int index) {
        int i = (int) InputUtil.requireNumber("Which teacher's information do you want to delete? ");
        ArrayList<Teacher> teachersArray = new ArrayList<>();
        for (int j = 0; j < accountsList.size(); j++) {
            if (accountsList.get(j).getUsername().equals(currentAccountUsername) && accountsList.get(j).getPassword().equals(currentAccountPassword)) {
                teachersArray = config.getAccounts().get(j).getTeachers();
                index = j;
            }
        }

        ArrayList<Teacher> updatedTeachersArray = new ArrayList<>(teachersArray.size() - 1);

        int k = 0;
        for (int j = 0; j < teachersArray.size(); j++) {
            if (j != (i - 1)) {
                updatedTeachersArray.add(k, teachersArray.get(j));
                k++;
            }
        }

        Config.instance().getAccounts().get(index).setTeachers(updatedTeachersArray);
    }
}