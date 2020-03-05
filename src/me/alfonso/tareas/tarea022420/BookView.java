package me.alfonso.tareas.tarea022420;

import javax.swing.*;
import java.awt.*;

public class BookView extends JFrame {
    JButton buttonSelect = new JButton("Select");
    JButton buttonRemove = new JButton("Remove");
    JButton buttonSave = new JButton("Save data");
    JComboBox<String> bookList;
    BookStorage bookStorage;

    public BookView() {
        super("Swing JComboBox Demo");
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        String[] bookTitles = new String[] {"Effective Java", "Head First Java", "Thinking in Java"};

        bookList = new JComboBox<>(bookTitles);
        bookList.addItem("Java Generics and Collections");
        bookList.addItem("Beggining Java 7");
        bookList.addItem("Java I/O");

        bookList.setForeground(Color.GRAY);
        bookList.setFont(new Font("Arial", Font.BOLD, 14));
        bookList.setMaximumRowCount(10);
        bookList.setEditable(true);
        this.bookStorage = new BookStorage(this);
        BookActionListener bookActionListener = new BookActionListener(this);
        bookList.addActionListener(bookActionListener);
        buttonSelect.addActionListener(bookActionListener);
        buttonRemove.addActionListener(bookActionListener);
        buttonSave.addActionListener(bookActionListener);
        // Add components
        add(bookList);
        add(buttonSelect);
        add(buttonRemove);
        add(buttonSave);
        pack();
    }
}
