import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFile {
	File OurFile;
	public List<String> FindTheFile() {
		List<String> StoredWords = new ArrayList<String>();
		 OurFile = new File("src/WordsToHide"); // Grab the file
		return OurFile;
	}
}
