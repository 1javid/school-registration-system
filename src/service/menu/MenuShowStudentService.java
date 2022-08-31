package service.menu;

import bean.Config;
import service.inter.menu.MenuShowStudentsServiceInter;

public class MenuShowStudentService implements MenuShowStudentsServiceInter {
    @Override
    public void processAbstract() {
        System.out.println("-------------------------------");
        Config.showAllRegisteredPeople("Student");
    }
}
