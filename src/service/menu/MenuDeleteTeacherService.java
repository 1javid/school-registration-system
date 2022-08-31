package service.menu;

import bean.Config;
import service.inter.menu.MenuDeleteTeacherServiceInter;

public class MenuDeleteTeacherService implements MenuDeleteTeacherServiceInter {
    @Override
    public void processAbstract() {
        System.out.println("-------------------------------");
        Config.deletePerson("Teacher");
    }
}
