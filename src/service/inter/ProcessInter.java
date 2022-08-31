package service.inter;

public interface ProcessInter {

    default void process() {
        processAbstract();
    }
    void processAbstract();
}
