package by.lamaka.lesson10.task30;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
        числа.*/
        List<Integer> scores = new ArrayList<>(20);
        Set<Integer> scores2 = new LinkedHashSet<>();

        for (int i = 0; i < 20; i++) {
            scores.add(new Random().nextInt(11));
        }

        System.out.println(scores);

        scores2.addAll(scores);
        scores.clear();
        scores.addAll(scores2);

        System.out.println(scores);







    }
}
