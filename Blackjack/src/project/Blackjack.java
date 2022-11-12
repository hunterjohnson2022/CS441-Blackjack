package project;
import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*;

public class Blackjack {

	public static void main(String[] args) {
		startMenu();
	}
	
	public static void startMenu() {
		JFrame menuFrame = new JFrame("Blackjack");
	       menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       menuFrame.setSize(900,600);
	       menuFrame.setLocationRelativeTo(null);
	       menuFrame.setLayout(null);
	       menuFrame.setResizable(false);
	       menuFrame.getContentPane().setBackground(new Color(53,101,77));
	       
	       JLabel welcomeLabel = new JLabel("Welcome to Blackjack!");
	       welcomeLabel.setFont(new Font("Serif", Font.BOLD, 25));
	       welcomeLabel.setForeground(Color.WHITE);
	       welcomeLabel.setBounds(300, 0, 300, 150);
	       menuFrame.getContentPane().add(welcomeLabel);
	       
	       JButton button = new JButton("Press");
	       //menuFrame.getContentPane().add(button); // Adds Button to content pane of frame
	       menuFrame.setVisible(true); //bro
	}

}
