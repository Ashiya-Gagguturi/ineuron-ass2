package com.ineuron;

import java.util.Scanner;

class Guesser{
	
	int GuessNum;
	
	public int GuessingNmber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser !!! Please Guess the Number");
		GuessNum=scan.nextInt();
		return GuessNum;
	
}
}
class Player{
	int pGuessNum;
	
	public int PlayerGuessing(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Player !! Please Guess the Number");
	pGuessNum=scan.nextInt();
	return pGuessNum;
}
}
class Umpire{
	int NumfromGuesser;
	int NumfromPlayer1;
	int NumfromPlayer2;
	int NumfromPlayer3;
	public void collectNumfromGuesser() {
		Guesser guesser=new Guesser();
		NumfromGuesser=guesser.GuessingNmber();
	}
	public void collectNumfromPlayers() {
		Player player1=new Player();
		Player player2=new Player();
		Player player3=new Player();
		NumfromPlayer1=player1.PlayerGuessing();
		NumfromPlayer2=player2.PlayerGuessing();
		NumfromPlayer3=player3.PlayerGuessing();
	}
	public void Result() {
		System.out.println("Analyzingg....Please Wait");
		if (NumfromGuesser==NumfromPlayer1) {
			if(NumfromGuesser==NumfromPlayer2&&NumfromGuesser==NumfromPlayer3) {
				System.out.println("All Players won the Game");
			}
			else if (NumfromGuesser==NumfromPlayer2&&NumfromGuesser!=NumfromPlayer3) {
				System.out.println("Player 1 & 2 won the Game");
			}
			else if (NumfromGuesser!=NumfromPlayer2&&NumfromGuesser==NumfromPlayer3) {
				System.out.println(" Players 1&3 won the Game");
			}
			else {
				System.out.println("Player 1 won the Game");
			}
			
		}
		else if(NumfromGuesser==NumfromPlayer2) {
			if(NumfromGuesser==NumfromPlayer1&&NumfromGuesser==NumfromPlayer3) {
				System.out.println("Player2 Won the Game");
			}
			else if (NumfromGuesser!=NumfromPlayer1&&NumfromGuesser==NumfromPlayer3) {
				System.out.println(" Players 2 & 3 won the Game");
			}
			else {
				System.out.println(" Players 2 won the Game");
			}
			
		}
		else if(NumfromGuesser==NumfromPlayer3){
			System.out.println(" Players 3 won the Game");
		}
		else {
			System.out.println(" OOps !! No one won ...Try Again");
		}
	}
	
	
}

public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire umpire=new Umpire();
		umpire.collectNumfromGuesser();
		umpire.collectNumfromPlayers();
		umpire.Result();
		
		

	}

}
