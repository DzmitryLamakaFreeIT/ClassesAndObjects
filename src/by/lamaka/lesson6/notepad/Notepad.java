package by.lamaka.lesson6.notepad;

import java.util.Date;

public class Notepad {
    private Date date;
    private Note note;

    public Notepad() {

    }

    public Notepad(Date date) {
        this.date = date;
        note = new Note();

    }

    public Date getDate() {
        return date;
    }


    class Note {
        private String notes;
        {
            notes = "";
        }

        private void addNote(String note) {
            notes += note + "\n";
        }

        private String getNotes() {
            return notes;
        }
    }

    public void addNote(String note) {
        this.note.addNote(note);
    }

    public String getNotes(){
        return this.note.getNotes();
    }


}
