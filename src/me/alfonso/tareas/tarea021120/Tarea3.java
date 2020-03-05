package me.alfonso.tareas.tarea021120;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tarea3 extends JFrame {

    private DefaultListModel modeloLista;
    private JList itemsList;
    private JButton addButton;
    private JButton removeButton;
    private JTextField newItemField;

    public Tarea3() {
        super("Tarea 3");
        GridLayout gridLayout = new GridLayout(3, 3, 15, 10);
        setLayout(gridLayout);
        JLabel label = new JLabel("Registra tu visita");
        add(label);
        JLabel label2 = new JLabel(" ");
        add(label2);
        JLabel label3 = new JLabel(" ");
        add(label3);

        newItemField = new JTextField();
        add(newItemField);

        addButton = new JButton("Add");
        addButton.setMnemonic('A');
        add(addButton);

        removeButton = new JButton("Remove");
        removeButton.setMnemonic('R');
        add(removeButton);

        JLabel label4 = new JLabel(" ");
        add(label4);
        itemsList = new JList();
        modeloLista = new DefaultListModel();
        itemsList.setModel(modeloLista);
        JScrollPane scrollPane = new JScrollPane(itemsList, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(scrollPane);

        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        LayoutEvents layoutEvents = new LayoutEvents();
        addButton.addActionListener(layoutEvents);
        removeButton.addActionListener(layoutEvents);
    }

    public static void main(String[] args) {
        new Tarea3();
    }
    private class LayoutEvents implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (actionEvent.getSource() == addButton) {
                String element = newItemField.getText();
                modeloLista.addElement(element);
                newItemField.setText("");
            }
            if (actionEvent.getSource() == removeButton) {
                int index = itemsList.getSelectedIndex();
                try {
                    modeloLista.removeElementAt(index);
                } catch (IndexOutOfBoundsException ex) {
                    System.out.println("No hay indice seleccionado");
                }
            }
        }
    }
}
