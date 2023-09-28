import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFile {
	public List<String> FindTheFile() {
		List<String> StoredWords = new ArrayList<String>();
		try {
			File wordObj = new File("src/WordsToHide"); // Grab the file
			Scanner myReader = new Scanner(wordObj); // Start scanning it
			while (myReader.hasNextLine()) // while it has more lines to read
			{
				String data = myReader.nextLine(); // the next line gets stored to data
				StoredWords.add(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.print(e);
		}
		return StoredWords;
	}
}
