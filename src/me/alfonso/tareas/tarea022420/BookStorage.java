package me.alfonso.tareas.tarea022420;

import java.util.ArrayList;

public class BookStorage {

    BookView bookView;
    ArrayList<String> books = new ArrayList<>();

    BookStorage(BookView bookView) {
        this.bookView = bookView;
    }

    public boolean agregaDatos() {
        String book = (String) this.bookView.bookList.getSelectedItem();
        if (this.books.contains(book)) {
            return false;
        }
        this.books.add((String) this.bookView.bookList.getSelectedItem());
        return true;
    }
}
