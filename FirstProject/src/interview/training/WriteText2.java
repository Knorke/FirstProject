package interview.training;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Arrays;
import java.io.IOException;

public class WriteText2 {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("The first line", "The second line");
		try {
			Path file = Paths.get("the-file-name.txt");
			Files.write(file, lines, Charset.forName("UTF-8"));
		} catch(IOException e) {
			System.out.println("oh oh: " + e.getMessage());
		}

	}

}
