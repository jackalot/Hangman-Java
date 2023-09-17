import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HiddenText {
	 String text = "Sample text";
	 private void FindTheFile() {
		 List<String> StoredWords = new ArrayList<String>();
		 try
		 {
			 File wordObj = new File("src/WordsToHide"); //Grab the file
			 Scanner myReader =  new Scanner(wordObj); //Start scanning it
			 while(myReader.hasNextLine()) // while it has more lines to read
			 {
				 String data = myReader.nextLine(); // the next line gets stored to data
				 System.out.println(data); // print it
			 }
			 myReader.close();
		 }
		 catch (FileNotFoundException e){
			System.out.print(e);
		 }
	 }
	 // Finds a new word for us from the "Words to Hide" file 
	 private void FindNewWord() {
	 FindTheFile();
	 }
	 public String HideOurText() {
		 //Find a new word to hide
		 FindNewWord();
		 //Hide our text with the format chosen
		 //_ _ _ _ _ _ _ _	 _ _ _   _ _ _ _
		 return text;
	 }
}
