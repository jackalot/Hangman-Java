
public class DisplayText {
	char[] Guesses;
	String OurPrompt;
	public char GuessCharacter(HiddenText OurWords) {
	return ' ';
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
		// check if the character is in the word
		 // If it was right, add the players guess
		 // display the new prompt
		 
	}
}
