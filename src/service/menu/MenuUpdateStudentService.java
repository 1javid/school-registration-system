package service.menu;

import bean.Config;
import service.inter.menu.MenuUpdateStudentServiceInter;

public class MenuUpdateStudentService implements MenuUpdateStudentServiceInter {
    @Override
    public void processAbstract() {
        System.out.println("-------------------------------");
        Config.updatePerson("Student");
    }
}
