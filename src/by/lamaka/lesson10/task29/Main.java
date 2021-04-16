package by.lamaka.lesson10.task29;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;


public class Main {
    /*Создать список оценок учеников с помощью ArrayList, заполнить случайными
    оценками. Удалить неудовлетворительные оценки из списка.*/
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>(20);

        for (int i = 0; i < 20; i++) {
            scores.add(new Random().nextInt(11));
        }

        System.out.println(scores);

        ListIterator<Integer> listIterator = scores.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next() < 3) {
                listIterator.remove();
            }
        }

        System.out.println(scores);
    }
}
