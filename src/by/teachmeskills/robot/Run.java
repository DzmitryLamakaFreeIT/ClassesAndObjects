package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IRobot vasya = new Robot(new SonyHead(400), new SamsungHand(240), new ToshibaLeg(180));
        IRobot petya = new Robot(new SamsungHead(510), new ToshibaHand(210), new SamsungLeg(170));
        IRobot evdakim = new Robot(new ToshibaHead(370), new SamsungHand(240), new SonyLeg(290));

        vasya.action();
        System.out.println("-----------------------");
        petya.action();
        System.out.println("-----------------------");
        evdakim.action();
        System.out.println("-----------------------");

        System.out.println("Цена робота Vasya " + vasya.getPrice());
        System.out.println("Цена робота Petya " + petya.getPrice());
        System.out.println("Цена робота Evdakim " + evdakim.getPrice());

        System.out.println("-----------------------");

        if (vasya.getPrice() >= petya.getPrice() && vasya.getPrice() >= evdakim.getPrice()) {
            System.out.println("Vasya самый дорогой робот ");
        } else if (petya.getPrice() >= vasya.getPrice() && petya.getPrice() >= evdakim.getPrice()) {
            System.out.println("Petya самый дорогой робот");
        } else {
            System.out.println("Evdakim самый дорогой робот");
        }

    }
}
