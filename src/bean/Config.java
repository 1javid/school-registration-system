package bean;

import util.*;

import java.io.Serializable;
import java.util.ArrayList;

public class Config implements Serializable {

    public static Config config;
    private final ArrayList<Account> accounts = new ArrayList<>();
    private static boolean loggedIn;
    private static final String fileName = "app.obj";
    private static String currentAccountUsername;
    private static String currentAccountPassword;
    private final static ArrayList<Account> accountsList = Config.instance().getAccounts();

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

    public void setCurrentAccountUsername(String currentAccountUsername) {
        this.currentAccountUsername = currentAccountUsername;
    }

    public void setCurrentAccountPassword(String currentAccountPassword) {
        this.currentAccountPassword = currentAccountPassword;
    }

    public static Config instance() {
        if(config == null)
            config = new Config();
        return config;
    }
    public static void initialize() {
        Object obj = FileUtil.readFileDeserialize(fileName);
        if(obj == null) return;

        if(obj instanceof Config) config = (Config) obj;
    }

    public static void save() {
        FileUtil.writeToObjectFile(Config.instance(), fileName);
    }

    public void registerPeople(String whichPerson, String name, String surname, int age, String schoolName, String className, double gpa, String subject, int salary) {

        for(int i = 0; i < accountsList.size(); i++) {
            if (accountsList.get(i).getUsername().equals(currentAccountUsername) && accountsList.get(i).getPassword().equals(currentAccountPassword)) {
                if (whichPerson.equals("Student")) {
                    CreateUtil.registerStudents(name, surname, age, schoolName, className, gpa, i);
                } else if(whichPerson.equals("Teacher")) {
                    CreateUtil.registerTeachers(name, surname, age, schoolName, subject, salary, i);
                }
            }
        }
        MenuUtil.showSuccessMessage();
    }

    public static void showAllRegisteredPeople(String whichPerson) {

        for (Account account : accountsList) {
            if (account.getUsername().equals(currentAccountUsername) && account.getPassword().equals(currentAccountPassword)) {
                if (whichPerson.equals("Student")) {
                    ReadUtil.showAllRegisteredStudents(account);
                } else if (whichPerson.equals("Teacher")) {
                    ReadUtil.showAllRegisteredTeachers(account);
                }
            }
        }
        MenuUtil.showSuccessMessage();
    }

    public static void updatePerson(String whichPerson) {

        System.out.println("List:");
        showAllRegisteredPeople(whichPerson);

        if (whichPerson.equals("Student"))
            UpdateUtil.updateStudent(accountsList, currentAccountUsername, currentAccountPassword, config);
        else if (whichPerson.equals("Teacher"))
            UpdateUtil.updateTeacher(accountsList, currentAccountUsername, currentAccountPassword, config);

        MenuUtil.showSuccessMessage();
    }

    public static void deletePerson(String whichPerson) {

        System.out.println("List:");
        showAllRegisteredPeople(whichPerson);

        int index = 0;
        if(whichPerson.equals("Student"))
            DeleteUtil.deleteStudent(accountsList, currentAccountUsername, currentAccountPassword, config, index);
        else if(whichPerson.equals("Teacher"))
            DeleteUtil.deleteTeacher(accountsList, currentAccountUsername, currentAccountPassword, config, index);

        MenuUtil.showSuccessMessage();
    }
}
