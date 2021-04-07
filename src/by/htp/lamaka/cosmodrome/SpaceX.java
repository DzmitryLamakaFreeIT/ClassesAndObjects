package by.htp.lamaka.cosmodrome;

import java.util.Random;

public class SpaceX implements IStart {

    public SpaceX() {
    }

    @Override
    public boolean checkSystem() {
        boolean result;
        Random rd = new Random();
        if (rd.nextInt(21) > 8) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX...");
    }
}
