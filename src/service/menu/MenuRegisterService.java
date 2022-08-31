package service.menu;

import bean.Account;
import bean.Config;
import service.inter.menu.MenuRegisterServiceInter;
import service.inter.SavableProcessInter;
import util.MenuUtil;

import java.util.Scanner;

public class MenuRegisterService implements MenuRegisterServiceInter, SavableProcessInter {
    @Override
    public void processAbstract() {
        System.out.println("-------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String username = sc.next();
        System.out.print("Password: ");
        String password = sc.next();

        Account user = new Account();
        user.setUsername(username);
        user.setPassword(password);

        Config.instance().getAccounts().add(user);
        MenuUtil.showSuccessMessage();
    }
}
