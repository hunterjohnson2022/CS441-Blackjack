package project;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class Blackjack {
	
	public static int betAmount;

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
	       menuFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	       
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
	       startButton.addActionListener(new java.awt.event.ActionListener() {
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	menuFrame.dispose();
	                newGameWindow();
	            }
	        });
	       
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
	
	public static void newGameWindow() {
		JFrame gameFrame = new JFrame("Blackjack");
	       gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       gameFrame.setSize(900,600);
	       gameFrame.setLocationRelativeTo(null);
	       gameFrame.setLayout(null);
	       gameFrame.setResizable(false);
	       gameFrame.getContentPane().setBackground(new Color(53,101,77));
	       gameFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	       
	       Game game = new Game();
	       
	       //Player Cards ------------------------------------------------------------------------------------------------------------------
	       JLabel player_card1 = new JLabel();
	       //player_card1.setIcon(new ImageIcon(new ImageIcon("images/card.png").getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT)));
	       player_card1.setBounds(600, 275, 300, 300);
	       gameFrame.getContentPane().add(player_card1);
	       
	       JLabel player_card2 = new JLabel();
	       //player_card2.setIcon(new ImageIcon(new ImageIcon("images/card.png").getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT)));
	       player_card2.setBounds(450, 275, 300, 300);
	       gameFrame.getContentPane().add(player_card2);
	       
	       JLabel player_card3 = new JLabel();
	       //player_card3.setIcon(new ImageIcon(new ImageIcon("images/card.png").getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT)));
	       player_card3.setBounds(300, 275, 300, 300);
	       gameFrame.getContentPane().add(player_card3);
	       
	       JLabel player_card4 = new JLabel();
	       //player_card4.setIcon(new ImageIcon(new ImageIcon("images/card.png").getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT)));
	       player_card4.setBounds(150, 275, 300, 300);
	       gameFrame.getContentPane().add(player_card4);
	       
	       JLabel player_card5 = new JLabel();
	       //player_card5.setIcon(new ImageIcon(new ImageIcon("images/card.png").getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT)));
	       player_card5.setBounds(10, 275, 300, 300);
	       gameFrame.getContentPane().add(player_card5);
	       
	       
	       //Dealer Cards -----------------------------------------------------------------------------------------------------------------
	       JLabel dealer_card1 = new JLabel();
	       //dealer_card1.setIcon(new ImageIcon(new ImageIcon("images/card.png").getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT)));
	       dealer_card1.setBounds(600, 0, 300, 300);
	       gameFrame.getContentPane().add(dealer_card1);
	       
	       JLabel dealer_card2 = new JLabel();
	       //dealer_card2.setIcon(new ImageIcon(new ImageIcon("images/card.png").getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT)));
	       dealer_card2.setBounds(450, 0, 300, 300);
	       gameFrame.getContentPane().add(dealer_card2);
	       
	       
	       //Labels ------------------------------------------------------------------------------------------------------------------------
	       JLabel gameOnLabel = new JLabel("Game On!");
	       gameOnLabel.setFont(new Font("Serif", Font.BOLD, 25));
	       gameOnLabel.setForeground(Color.WHITE);
	       gameOnLabel.setBounds(350, -50, 300, 150);
	       gameFrame.getContentPane().add(gameOnLabel);
	       
	       JLabel dealerLabel = new JLabel("(Dealer)");
	       dealerLabel.setFont(new Font("Serif", Font.BOLD, 15));
	       dealerLabel.setForeground(Color.WHITE);
	       dealerLabel.setBounds(750, 50, 300, 150);
	       gameFrame.getContentPane().add(dealerLabel);
	       
	       JLabel youLabel = new JLabel("(You)");
	       youLabel.setFont(new Font("Serif", Font.BOLD, 15));
	       youLabel.setForeground(Color.WHITE);
	       youLabel.setBounds(750, 350, 300, 150);
	       gameFrame.getContentPane().add(youLabel);
	       
	       JLabel betLabel = new JLabel();
	       betLabel.setFont(new Font("Serif", Font.BOLD, 50));
	       betLabel.setForeground(Color.WHITE);
	       betLabel.setBounds(100, 50, 300, 150);
	       gameFrame.getContentPane().add(betLabel);
	       
	       
	       //Buttons ---------------------------------------------------------------------------------------------------------------------------
	       JButton hitButton = new JButton("Hit");
	       gameFrame.getContentPane().add(hitButton);
	       hitButton.setBounds(100, 175, 150, 50);
	       hitButton.addActionListener(new java.awt.event.ActionListener() {
	    	   int hitCount = 0;
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	if(game.drawNewCard() == 1) {
	            		hitCount++;
	            		if(hitCount == 1)
	            			player_card3.setText(game.getPlayerCard(2));
	            		else if (hitCount == 2)
	            			player_card4.setText(game.getPlayerCard(3));
	            		else if (hitCount == 3)
	            			player_card5.setText(game.getPlayerCard(4));
	            	} else {
	            		int input = JOptionPane.showOptionDialog(null, 
	            		"You Drew a " + game.getLatestCard() + " and your total score was " + game.getPlayerScore() + "\nYou lost $" + betAmount + " Game Over", 
	            		"BUST!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

	            		if(input == JOptionPane.OK_OPTION)
	            		{
	            		    gameFrame.dispose();
	            		    newGameWindow();
	            		} else {
	            			gameFrame.dispose();
	            		}
	            			
	            	}
	            	
	            }
	        });
	       
	       JButton stayButton = new JButton("Stay");
	       gameFrame.getContentPane().add(stayButton);
	       stayButton.setBounds(100, 250, 150, 50);
	       stayButton.addActionListener(new java.awt.event.ActionListener() {
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	System.out.println("the dealer was hiding a(n) " + game.getDealerCard(1));
	            	game.winnerSelection();
	            	
	            	int input = JOptionPane.showOptionDialog(null, 
		            		"The Dealer was hiding a(n) " + game.getDealerCard(1) + " and their total score was " + game.getDealerScore() + 
		            		"\nYour total score was " + game.getPlayerScore() + 
		            		"\n" + game.winnerSelection(), 
		            		"Game Over!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

		            		if(input == JOptionPane.OK_OPTION)
		            		{
		            		    gameFrame.dispose();
		            		    newGameWindow();
		            		} else {
		            			gameFrame.dispose();
		            		}
	            }
	        });
	       
	       
	       gameFrame.setVisible(true);
	       

	       
	       betAmount = 50;
	       JOptionPane optionPane = new JOptionPane();
	       JSlider slider = getSlider(optionPane);
	       optionPane.setMessage(new Object[] { "Select a bet amount: ", slider });
	       optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
	       optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
	       JDialog dialog = optionPane.createDialog(gameFrame, "My Slider");
	       dialog.setVisible(true);
	       betAmount = (int) optionPane.getInputValue();
	       betLabel.setText("Bet: " + betAmount);
	       
	       player_card1.setText(game.getPlayerCard(0));
	       player_card2.setText(game.getPlayerCard(1));
	       dealer_card1.setText(game.getDealerCard(0));
	       dealer_card2.setText("facedown");
	}

	//utility 
	
	  static JSlider getSlider(final JOptionPane optionPane) {
		    JSlider slider = new JSlider();
		    slider.setMajorTickSpacing(20);
		    slider.setPaintTicks(true);
		    slider.setPaintLabels(true);
		    optionPane.setInputValue(50);
		    ChangeListener changeListener = new ChangeListener() {
		      public void stateChanged(ChangeEvent changeEvent) {
		        JSlider theSlider = (JSlider) changeEvent.getSource();
		        if (!theSlider.getValueIsAdjusting()) {
		          optionPane.setInputValue(theSlider.getValue());
		        }
		      }
		    };
		    slider.addChangeListener(changeListener);
		    return slider;
		  }
}
