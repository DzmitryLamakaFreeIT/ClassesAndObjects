package by.lamaka.lesson10.task31;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Main {
    /*Создать список оценок учеников с помощью ArrayList, заполнить случайными
    оценками. Найти самую высокую оценку с использованием итератора.*/
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>(20);
        int maxScore = 0;
        int nextValue = 0;

        for (int i = 0; i < 20; i++) {
            scores.add(new Random().nextInt(11));
        }

        System.out.println(scores);

        ListIterator<Integer> listIterator = scores.listIterator();
        while (listIterator.hasNext()) {
            nextValue = listIterator.next();
            if (nextValue > maxScore) {
                maxScore = nextValue;
            }
        }

        System.out.println("Maximum score = " +maxScore);

    }
}
