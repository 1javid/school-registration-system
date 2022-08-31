package service.inter;

import bean.Config;

public interface SavableProcessInter extends ProcessInter {
    default void process(){
        processAbstract();
        Config.save();
    }
}
