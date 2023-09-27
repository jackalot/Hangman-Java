import javax.swing.*;
public class DisplayText {
	String Guesses = "Guesses: ";
	String OurPrompt;
	public boolean CheckCharacter(char GuessChar, HiddenText OurWords)
	{
		boolean result = false;
		int index = -1;
		index = OurWords.GetFormattedWord().indexOf(GuessChar);
		if(index != -1)
		{
			result = true;
		}
		
		
		 return result;
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
		// check if the character is in the word at all
		boolean result = CheckCharacter(GuessChar, OurWords);
		if(result)
		{
			// find all instances of the players guessed character
			while(OurWords.GetFormattedWord().indexOf(GuessChar) != -1)
			{
				int index = OurWords.GetFormattedWord().indexOf(GuessChar);
				OurWords.HideFormattedWord(GuessChar, index);
				OurWords.RevealHiddenWord(GuessChar, index);
				System.out.println(OurWords.GetHiddenWord());
			}
			// Fill in each blank with the letter
			
		}
		else
		{
			Guesses += GuessChar + ", ";
		}
		 
	}
}
