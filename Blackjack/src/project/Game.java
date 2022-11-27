package project;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Game {
	
	private int playerScore = 0;
	private int dealerScore = 0;
	private ArrayList<String> playerCards = new ArrayList<String>();
	private ArrayList<String> dealerCards = new ArrayList<String>();
	

	public Game() {      
		
		System.out.println("New Game");
		playerCardsDistribution();
		dealerCardsDistribution();
       
	}
	
	public String drawCard (String visibility) {

        String cards[] = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        Random r = new Random();
        int randomIndex = r.nextInt(13);
        String drawnCard = cards[randomIndex];
        if (visibility == "faceUp") {

            if (drawnCard == "Ace") {

                System.out.println("An Ace is drawn.");                               
            } else {

                System.out.println("A " + drawnCard + " is drawn.");
            }
        } else if (visibility == "faceDown") {

                System.out.println("A face-down card is drawn.");
            }        
        return drawnCard;  
    }

    public static int assignPoints (int score, String card) {

        int earnedPoints = 0;
        if (card == "Ace") {

        		System.out.println("11 points are earned.");
                earnedPoints = 11;
            

        } else if (card == "10" || card == "Jack" || card == "Queen" || card == "King") {

                earnedPoints = 10;
                System.out.println("10 points are earned.");
        } else if (card == "Ace" && score >= 11) {

                earnedPoints = 1;
                System.out.println("1 point is earned.");
        } else {

            earnedPoints = Integer.parseInt(card);
            System.out.println(card + " points are earned.");
        }
        return earnedPoints;
    }


    public void playerCardsDistribution() {

        System.out.println("Player's turn. Two cards are drawn.");
        String playerCard1 = drawCard("faceUp");
        playerCards.add(playerCard1);
        playerScore += assignPoints(playerScore, playerCard1);
        String playerCard2 = drawCard("faceUp");
        playerCards.add(playerCard2);
        playerScore += assignPoints(playerScore, playerCard2);
        System.out.println("The Player's score is " + playerScore + ".\n");
    }

    public void dealerCardsDistribution() {

        System.out.println("Dealer's turn. Two cards are drawn: one face-up and one face-down.");
        String dealerCardFaceUp = drawCard("faceUp");
        dealerCards.add(dealerCardFaceUp);
        dealerScore += assignPoints(dealerScore, dealerCardFaceUp);
        String dealerCardFaceDown = drawCard("faceDown");
        dealerCards.add(dealerCardFaceDown);
        dealerScore += assignPoints(dealerScore, dealerCardFaceDown);
        System.out.println("The Dealer's score is " + dealerScore + ".\n");  
    }

    public int drawNewCard() {

        String newCard = drawCard("faceUp");
        playerCards.add(newCard);
        playerScore += assignPoints(playerScore, newCard);
        System.out.println("The new score is " + playerScore + ".");
        return (playerScore > 21)? 0 : 1;    
    }



    public String winnerSelection() {

        if ((playerScore > 21 || playerScore < dealerScore) && (dealerScore < 22)) {

            return "The Dealer wins.\n";
        } else if ((dealerScore > 21 || playerScore > dealerScore) && (playerScore < 22)) {

            return "The Player wins.\n";
        } else if ((playerScore == dealerScore) && (playerScore < 22) && (dealerScore < 22)) {

            return "Draw!";
        }
        
        return "Draw!";
    }
    
    public int getPlayerScore() {
    	return playerScore;
    }
    
    public int getDealerScore() {
    	return dealerScore;
    }
    
    public String getPlayerCard(int index) {
    	return playerCards.get(index);
    }
    
    public String getLatestCard() {
    	return playerCards.get(playerCards.size() - 1);
    }
    
    public String getDealerCard(int index) {
    	return dealerCards.get(index);
    }
    
    
}
