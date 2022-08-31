package service.menu;

import bean.Config;
import service.inter.menu.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
    public void processAbstract() {
        System.out.println("-------------------------------");
        Config.showAllRegisteredPeople("Teacher");
    }
}
