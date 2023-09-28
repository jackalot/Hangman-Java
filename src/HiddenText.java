import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HiddenText {
	private String OurWord = "Sample text";
	private String HiddenWord = "";
	// This string will be a copy of OurWord but formatted like HiddenWord is
	private String FormattedWord = "";
	// Finds a new word for us from the "Words to Hide" file
	private void FindNewWord() {
		GetFile file = new GetFile();
		List<String> StoredWords = file.FindTheFile();
		// Store our ArrayList in a regular Array, according to the list size
		String[] PossibleWords = StoredWords.toArray(new String[StoredWords.size()]);
		OurWord = PossibleWords[(int) (Math.random() * PossibleWords.length)];
	}

	// Censor the "OurWord" Variable and store it in "HiddenWord"
	private void CensorWord() {
		String newHiddenWord = "";
		String newFormattedWord = ""; // Empty it just in case
		for (char x : OurWord.toCharArray()) {
			if (x != ' ') {
				newHiddenWord += "_ ";// add a space so its viewable for the user
				newFormattedWord += x; // add the character and a space to mimic HiddenWord
				newFormattedWord += " ";
			} else {
				newHiddenWord += "\n"; // Create a new line
				newFormattedWord += "\n";
			}
		}
		HiddenWord = newHiddenWord;
		FormattedWord = newFormattedWord;
	}

	public String GetHiddenWord() {
		return HiddenWord;
	}

	public String GetFormattedWord() {
		return FormattedWord;
	}

	public void HideOurText() {
		// Find a new word to hide
		FindNewWord();
		// Hide our text with the format chosen
		// _ _ _ _ _ _ _ _ _ _ _ _ _ _
		CensorWord();
	}

	// This will happen when the user guesses a character right
	public void RevealHiddenWord(char ch, int index) {
		String newHiddenWord = "";
		// to check the index variable
		int loops = 0;
		// loop through the whole string and check what
		// needs to be added to the new hidden word
		for (char x : HiddenWord.toCharArray()) {
			// found the character, reveal it
			if (x == '_' && loops == index) {
				newHiddenWord += ch;
			} else {
				if(HiddenWord.contains("\n"))
				{
					if(x != '_' && loops == index && x != ' ')
					{
						newHiddenWord += "/n";
					}
				}
				else
				{
					newHiddenWord += "_ ";
				}
					
			}
			loops += 1;
		}
		HiddenWord = "";
		HiddenWord = newHiddenWord;
	}

	// This will make it so the user can guess the next identical character
	// ie. the "n"'s and "a"'s in banana
	public void HideFormattedWord(char ch, int index) {
		String newFormatted = "";
		// to check the index variable
		int loops = 0;
		// loop through the whole string and check what
		// needs to be added to the new formatted word
		for (char x : FormattedWord.toCharArray()) {
			// found the character, hide it
			if (loops == index) {
				newFormatted += "8";
			} else {
				newFormatted += x;
			}
			loops += 1;
		}
		FormattedWord = newFormatted;

	}
}
