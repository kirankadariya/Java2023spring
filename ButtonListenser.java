package buttonListenser;

import javax.swing.*;
import java.awt.event.*;

public class ButtonListenser {
	
	
	public static void main(String[] args) {
		
		
		//create the jframe 
		
		JFrame f = new JFrame();
		
		//Create a text field 
		
		final JTextField tf = new JTextField();
		
		//set text field size and position 
		
		tf.setBounds(50,50,350,20);
		
		// create a new button 
		
		JButton b = new JButton("Click here");
		
		// set the  Button size 
		
		b.setBounds(50,100,95,30);
		
		// add the listener to the buttton 
		
		b.addActionListener(new ActionListener() { 
		
		// Add method to run action 
		public void actionPerformed(ActionEvent e) {
			
			//set the text 
			
			tf.setText(" Welcome to Summit Academy");
		
			}
		});	
		
		
		//Add the button and text to the jframe 
		
		f.add(b);
		f.add(tf);
		
		//set the bounds for the jframe 
		
		f.setSize(600, 400);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}

}
