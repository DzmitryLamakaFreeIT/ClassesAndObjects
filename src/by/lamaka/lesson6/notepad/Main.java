package by.lamaka.lesson6.notepad;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Notepad notepad = new Notepad(new Date());
        notepad.addNote("privet");
        notepad.addNote("hello");
        notepad.addNote("hi");
        System.out.println(notepad.getDate() + " ");

        System.out.println(notepad.getNotes());
    }
}
