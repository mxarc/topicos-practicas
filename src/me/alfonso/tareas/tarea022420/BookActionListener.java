package me.alfonso.tareas.tarea022420;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookActionListener implements ActionListener {

    private BookView bookView;

    BookActionListener(BookView bookView) {
        this.bookView = bookView;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(this.bookView.bookList)) {
            JComboBox<String> combo = (JComboBox<String>) actionEvent.getSource();
            String selectedBook = (String) combo.getSelectedItem();
            DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) combo.getModel();

            int selectedIndex = model.getIndexOf(selectedBook);
            if (selectedIndex < 0) {
                model.addElement(selectedBook);
            }
        } else if (actionEvent.getSource().equals(this.bookView.buttonSelect)) {
            String selectedBook = (String) this.bookView.bookList.getSelectedItem();
            JOptionPane.showMessageDialog(this.bookView, String.format("You selected the book: %s", selectedBook));
        } else if (actionEvent.getSource().equals(this.bookView.buttonRemove)) {
            String selectedBook = (String) this.bookView.bookList.getSelectedItem();
            this.bookView.bookList.removeItem(selectedBook);
        } else if (actionEvent.getSource().equals(this.bookView.buttonSave)) {
            String book = (String) this.bookView.bookList.getSelectedItem();
            if (this.bookView.bookStorage.agregaDatos()) {
                JOptionPane.showMessageDialog(this.bookView, String.format("Libro \"%s\" almacenado", book),
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this.bookView, String.format("Este libro (%s) ya está almacenado", book),
                        "Información", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
