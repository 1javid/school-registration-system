package service.menu;

import bean.Account;
import bean.Config;
import service.inter.menu.MenuLoginServiceInter;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void processAbstract() {
        System.out.println("-------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String username = sc.next();
        System.out.print("Password: ");
        String password = sc.next();

        ArrayList<Account> accounts = Config.instance().getAccounts();
        boolean flag = true;
        for (Account account : accounts) {
            if (username.equals(account.getUsername()) && password.equals(account.getPassword())) {
                flag = false;
                Config.instance().setCurrentAccountUsername(username);
                Config.instance().setCurrentAccountPassword(password);
            }
        }
        System.out.println("-------------------------------");
        if(flag) throw new IllegalArgumentException("Username or Password is invalid.");
        Config.setLoggedIn(true);
    }
}
