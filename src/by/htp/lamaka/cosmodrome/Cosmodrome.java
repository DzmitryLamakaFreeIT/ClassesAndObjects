package by.htp.lamaka.cosmodrome;

public class Cosmodrome {

    public Cosmodrome() {
    }

    public void launch(IStart iStart) {
        if (iStart.checkSystem() == false) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            System.out.println("Проверка прошла успешно");
            iStart.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println(i + "...");
            }
            iStart.start();
        }
    }

}
