package by.lamaka.lesson9.book.task28;

import java.util.Arrays;

public class Box<T> {
    private T[] elements;

    public Box(T[] elements) {
        this.elements = elements;
    }

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }

    public T getElement(int index) {
        return elements[index];
    }

    @Override
    public String toString() {
        return "Box{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
