import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFile {
	File OurFile;
	public List<String> ScanTheFile() {
		List<String> StoredWords = new ArrayList<String>();
		OurFile = new File("src/WordsToHide");
		Scanner myReader;
		try {
			myReader = new Scanner(OurFile);
			while (myReader.hasNextLine()) // while it has more lines to read
			{
				String data = myReader.nextLine(); // the next line gets stored to data
				StoredWords.add(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Start scanning it
		return StoredWords;
	}
	public File FindTheFile() {
		 OurFile = new File("src/WordsToHide"); // Grab the file
		return OurFile;
	}
}
