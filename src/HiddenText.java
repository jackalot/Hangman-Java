import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HiddenText {
	 private String OurWord = "Sample text";
	 private String HiddenWord = "";
	// This string will be a copy of OurWord but formatted like HiddenWord is
	 private String FormattedWord;
	 private List<String> FindTheFile() {
		 List<String> StoredWords = new ArrayList<String>();
		 try
		 {
			 File wordObj = new File("src/WordsToHide"); //Grab the file
			 Scanner myReader =  new Scanner(wordObj); //Start scanning it
			 while(myReader.hasNextLine()) // while it has more lines to read
			 {
				 String data = myReader.nextLine(); // the next line gets stored to data
				 StoredWords.add(data);
			 }
			 myReader.close();
		 }
		 catch (FileNotFoundException e){
			System.out.print(e);
		 }
		 return StoredWords;
	 }
	 // Finds a new word for us from the "Words to Hide" file 
	 private void FindNewWord() {
		 List<String> StoredWords = FindTheFile();
		 //Store our ArrayList in a regular Array, according to the list size
		 String[] PossibleWords = StoredWords.toArray(new String[StoredWords.size()]);
		 OurWord = PossibleWords[(int)(Math.random() * PossibleWords.length)];
	 }
	 //Censor the "OurWord" Variable and store it in "HiddenWord"
	 private void CensorWord() {
		String newHiddenWord = "";
		String newFormattedWord = ""; // Empty it just in case
		for(char x: OurWord.toCharArray()) {
			if(x != ' ')
			{	
				newHiddenWord += "_ ";// add a space so its viewable for the user
				newFormattedWord += x; // add the character and a space to mimic HiddenWord
				newFormattedWord += " ";
			}
			else
			{
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
		 //Find a new word to hide
		 FindNewWord();
		 //Hide our text with the format chosen
		 //_ _ _ _ _ _ _ _	 _ _ _   _ _ _ 
		 CensorWord();
		 System.out.println(HiddenWord);
		 System.out.println(FormattedWord);
	 }
}
