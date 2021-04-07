package by.htp.lamaka.human;

import by.htp.lamaka.human.jacket.WinterJacket;
import by.htp.lamaka.human.pants.Jeans;
import by.htp.lamaka.human.shoes.Boot;

public class Main {
    public static void main(String[] args) {
        Human cheburek = new HumanImpl("Petya", new WinterJacket(), new Jeans(), new Boot());

        cheburek.getDressed();
        cheburek.undressed();
    }
}
