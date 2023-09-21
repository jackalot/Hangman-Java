import javax.swing.*;
public class DisplayText {
	char[] Guesses;
	String OurPrompt;
	public char GuessCharacter(HiddenText OurWords) {
		// Grab the string input
		String guessStr = JOptionPane.showInputDialog
			    (OurPrompt);
		// If a full word is guessed, instead grab the first letter
	    char guessChar = guessStr.charAt(0);
	    return guessChar;
	}
	public void CreateWindow(HiddenText OurWords)
	{
		if(OurPrompt != "")
		{
			OurPrompt = "Guess a letter thats in one of the following spaces\n" +
					OurWords.GetHiddenWord();
		}
		 // prompt the user for a character they think is in the word
		char GuessChar = GuessCharacter(OurWords);
		System.out.print(GuessChar);
		// check if the character is in the word
		 // If it was right, add the players guess
		 // display the new prompt
		 
	}
}
