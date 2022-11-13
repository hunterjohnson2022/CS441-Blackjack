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
	       
	       JLabel startChips = new JLabel();
	       startChips.setIcon(new ImageIcon("images/start_chips.png"));
	       startChips.setBounds(40, 150, 300, 300);
	       menuFrame.getContentPane().add(startChips);
	       
	       JButton startButton = new JButton("Play Game");
	       menuFrame.getContentPane().add(startButton);
	       startButton.setBounds(400, 150, 300, 100);
	       
	       JButton howButton = new JButton("How to Play");
	       menuFrame.getContentPane().add(howButton);
	       howButton.setBounds(400, 300, 300, 100);
	       menuFrame.setVisible(true); 
	       howButton.addActionListener(new java.awt.event.ActionListener() {
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                JOptionPane.showMessageDialog(menuFrame, "This is how you play");
	            }
	        });
	       
	}

}
