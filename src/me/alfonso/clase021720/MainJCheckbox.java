package me.alfonso.clase021720;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainJCheckbox {

    public static void main(String[] args) {
        UsandoJCheckBox f = new UsandoJCheckBox();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);}
        });
        f.setTitle("JCheckBox Test");
        f.setSize(420,100);
        f.setVisible(true);
    }
}
