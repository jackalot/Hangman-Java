import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class HiddenText {
	 String text = "Sample text";
	 private void FindTheFile() {
		 
	 }
	 // Finds a new word for us from the "Words to Hide" file 
	 private void FindNewWord() {
		 try
		 {
			 File wordObj = new File("Words to Hide"); //Grab the file
			 Scanner myReader =  new Scanner(wordObj); //Start scanning it
			 while(myReader.hasNextLine()) // while it has more lines to read
			 {
				 String data = myReader.nextLine(); // the next line gets stored to data
				 System.out.print(data); // print it
			 }
		 }
		 catch (FileNotFoundException e){
			System.out.print(e);
		 }
		 
	 
	 }
	 public String HideOurText() {
		 //Find a new word to hide
		 //Hide our text with the format chosen
		 //_ _ _ _ _ _ _ _	 _ _ _   _ _ _ _
		 return text;
	 }
}
