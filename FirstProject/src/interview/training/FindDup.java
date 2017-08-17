package interview.training;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class FindDup {

	public static void main(String[] args) {
		
		System.out.println("please write a sentence!");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		String[] words = input.split("(=>|,|\\s)");
		System.out.println(Arrays.toString(words));
		
		Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();
		
		for(String str : words) {
			if(uniques.contains(str)) {
				dups.add(str);
				uniques.remove(str);
			} else uniques.add(str);
		}
		System.out.println("Unique words: " + uniques);
		System.out.println("Duplicates: " + dups);
	}
}
