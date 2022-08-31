package service.menu;

import bean.Config;
import service.inter.menu.MenuUpdateTeacherServiceInter;

public class MenuUpdateTeacherService implements MenuUpdateTeacherServiceInter {
    @Override
    public void processAbstract() {
        System.out.println("-------------------------------");
        Config.updatePerson("Teacher");
    }
}
