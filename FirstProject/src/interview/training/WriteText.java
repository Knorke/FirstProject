package interview.training;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.List;

public class WriteText {

	public static void main(String[] args) {
		try{
			PrintWriter writer = new PrintWriter("new-text-file.txt", "UTF-8");
			writer.println("This is the first line");
			writer.println("This is the second line");
			writer.close();
		} catch(IOException e) {
			System.out.println("Something went wrong");
		}
		 
	}
}
