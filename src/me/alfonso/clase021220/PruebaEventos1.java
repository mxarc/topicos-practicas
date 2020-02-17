package me.alfonso.clase021220;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class PruebaEventos1 {
    public static void main(String[] args)
	{
		Frame f=new Frame();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);}
		});
		f.setTitle("Trabajando Eventos 1 ");
		f.setSize(370,300);
		f.setVisible(true);
	}
}