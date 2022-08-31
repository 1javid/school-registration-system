package service.menu;

import bean.Config;
import service.inter.menu.MenuDeleteStudentServiceInter;

public class MenuDeleteStudentService implements MenuDeleteStudentServiceInter {
    @Override
    public void processAbstract() {
        System.out.println("-------------------------------");
        Config.deletePerson("Student");
    }
}
