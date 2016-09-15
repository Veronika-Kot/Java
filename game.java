package learnJavaTwo;

import java.util.*;
import javax.swing.JOptionPane;


public class Exercise3extened {
public static void newGame(){
		
		//Array with possible words
		
		String[] words = {"selenium", "perfict", "java", "qa"}; 		
		
		//Preparing 2 Arrays; first with a random word, second with "_"
		
		Random rand = new Random();   									
		int index = rand.nextInt(words.length - 1) + 0;
		String word = words[index];                                     
		int wordLen = word.length();									
		char[] spaces = new char[wordLen];
		char[] letters = new char[wordLen];
		int found = 0;
		
		for(int i=0; i<wordLen; i++){
			letters[i] = word.charAt(i);
			spaces[i] = '_';
		}
		
		//Starting a game
		
		System.out.print("You have a word this long: ");
		for(int j=0; j<wordLen; j++){
			System.out.print(spaces[j] + " ");
		}
		System.out.println(" ");
		JOptionPane.showMessageDialog(null, "You have a word this long: " + Arrays.toString(spaces));
		while(found < wordLen){
			System.out.println("Enter a letter");
			String guessString = JOptionPane.showInputDialog("Enter a letter: ");
			char letGuessDialog = guessString.charAt(0);
			char letGuess = letGuessDialog;
			boolean checkIsDone = false;			
			boolean lettreIsFound = false;
			for(int i=0;i<wordLen && checkIsDone==false;i++){
				if(letGuess==letters[i]){
					spaces[i]=letGuess;			
					lettreIsFound = true;
					found++;
				}
			}
			if(lettreIsFound == false){
				System.out.println("Try another letter");
				JOptionPane.showMessageDialog(null, "It's wrong: ");
			}
			else if(lettreIsFound == true){
				System.out.println("You got this right");
				for(int j=0; j<wordLen; j++){
					System.out.print(spaces[j] + " ");
				}
				System.out.println(" ");
				JOptionPane.showMessageDialog(null, "You got this right: " + Arrays.toString(spaces));
			}
		}
		
		if(found==wordLen){
			System.out.println("You won!");
			JOptionPane.showMessageDialog(null, "You won!");
		}
	}
	


	public static void main(String[] args) {
		boolean again = false;
		JOptionPane.showMessageDialog(null, "Let's play a game!");
       	do{
       		newGame();
       		int n = JOptionPane.showConfirmDialog(
                    null, "Would you like to play again?",
                    "An Inane Question",
                    JOptionPane.YES_NO_OPTION);
       		if (n == JOptionPane.YES_OPTION) {
                again = true;
       		} else if (n == JOptionPane.NO_OPTION) {
       			again = false;
       		}
       		
       	}while(again==true);	
       	JOptionPane.showMessageDialog(null, "Bye!");
		
	}

}
