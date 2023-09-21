import javax.swing.*;
public class DisplayText {
	char[] Guesses;
	String OurPrompt;
	public char GuessCharacter(HiddenText OurWords) {
		// Grab the string input
		String guessStr = JOptionPane.showInputDialog
			    (OurPrompt);
	}
	public void CreateWindow(HiddenText OurWords)
	{
		if(OurPrompt != "")
		{
			OurPrompt = "Guess a letter thats in one of the following spaces\n" +
					OurWords.GetHiddenWord();
			System.out.print(OurPrompt);
		}
		 // prompt the user for a character they think is in the word
		GuessCharacter(OurWords);
		// check if the character is in the word
		 // If it was right, add the players guess
		 // display the new prompt
		 
	}
}
