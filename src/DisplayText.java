import javax.swing.*;
public class DisplayText {
	char[] Guesses;
	String OurPrompt;
	public boolean CheckCharacter(char GuessChar, HiddenText OurWords)
	{
		
		 return false;
	}
	public char GuessCharacter() {
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
		char GuessChar = GuessCharacter();
		// check if the character is in the word
		boolean result = CheckCharacter(GuessChar, OurWords);
		 // If it was right, add the players guess
		 // display the new prompt
		 
	}
}
