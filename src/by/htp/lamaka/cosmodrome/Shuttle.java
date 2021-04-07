package by.htp.lamaka.cosmodrome;

import java.util.Random;

public class Shuttle implements IStart {

    public Shuttle() {
    }

    @Override
    public boolean checkSystem() {
        boolean result;
        Random rd = new Random();
        if (rd.nextInt(11) > 3) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла...");
    }
}
