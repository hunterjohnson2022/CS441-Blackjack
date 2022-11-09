package project;
import java.util.*;
import javax.swing.*;

public class Blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hello");
		JFrame frame = new JFrame("My First GUI");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(300,300);
	       JButton button = new JButton("Press");
	       frame.getContentPane().add(button); // Adds Button to content pane of frame
	       frame.setVisible(true);
	}

}
