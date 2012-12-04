package pack;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Aufgabe3GUI {
	
	JTextField area = new JTextField();
	String[] test = new String[10];
	private void hauptfenster(){
		JFrame fenster = new JFrame();
		fenster.setVisible(true);
		fenster.add(area);
		
		for(int i=0;i<test.length;i++){
			System.out.println(test[i]);
			area.setText(new Aufgabe3().zeichnen());

		}
		
	
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Aufgabe3GUI().hauptfenster();
			
	}
}
