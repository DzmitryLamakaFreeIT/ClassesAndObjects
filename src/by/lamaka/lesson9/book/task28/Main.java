package by.lamaka.lesson9.book.task28;

public class Main {
    public static void main(String[] args) {
        String[] str = {"dd", "vv", "kk"};
        Box<String> stringBox = new Box<>(str);
        System.out.println(stringBox.getElement(2));

        Integer[] ints = {1, 4, 5, 8};
        Box<Integer> integerBox = new Box<Integer>(ints);
        System.out.println(integerBox.getElement(2));

        Long[] longs = {2324L, 231L, 232L};
        Box<Long> longBox = new Box<>(longs);
        System.out.println(longBox.getElement(0));
    }
}
