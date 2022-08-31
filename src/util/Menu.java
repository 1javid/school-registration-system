package util;

import bean.Config;
import service.menu.*;
import service.inter.ProcessInter;

public enum Menu {

    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add a teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add a student", new MenuAddStudentService()),
    SHOW_ALL_TEACHERS(5, "Show all teachers", new MenuShowTeacherService()),
    SHOW_ALL_STUDENTS(6, "Show all students", new MenuShowStudentService()),
    UPDATE_TEACHER(7, "Update a teacher", new MenuUpdateTeacherService()),
    UPDATE_STUDENT(8, "Update a student", new MenuUpdateStudentService()),
    DELETE_TEACHER(9, "Delete a teacher", new MenuDeleteTeacherService()),
    DELETE_STUDENT(10, "Delete a student", new MenuDeleteStudentService()),
    UNKNOWN;

    private int number;
    private String label;
    private ProcessInter menuService;

    Menu() {

    }

    Menu(int number, String label, ProcessInter menuService) {
        this.number = number;
        this.label = label;
        this.menuService = menuService;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return label;
    }

    public void process() {
        menuService.process();
        MenuUtil.showMenu();
    }

    public static Menu find(int selectedMenu) {
        Menu[] menus = Menu.values();
        for (Menu menu : menus) {
            if(menu.getNumber() == selectedMenu)
                return menu;
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (Menu menu : menus) {
            if(menu != UNKNOWN) {
                if(menu == LOGIN || menu == REGISTER) {
                    if(!Config.isLoggedIn())
                        System.out.println(menu.getNumber() + ". " + menu);
                }
                else if(Config.isLoggedIn())
                    System.out.println(menu.getNumber() + ". " + menu);
            }
        }
    }
}
