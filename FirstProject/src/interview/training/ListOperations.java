package interview.training;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;

public class ListOperations {
	
	//convert int Array to ArrayList
	public static List<Integer> intArrayToList(int[] input) {
		List<Integer> iList = new ArrayList<Integer>();
		for(int i=0;i<input.length;i++) {
			iList.add(input[i]);
		}
		return iList;
	}
	public static int[] ListToIntArray(List<Integer> input) {
		int[] iArray = new int[input.size()];
		for(int i=0;i<input.size();i++){
			iArray[i] = input.get(i);
		}
		return iArray;
	}
	
	
	// Delete duplicate elements from a List -> using LinkedHashSet
	public static List<Integer> deleteDuplicatesLinkedHash(List<Integer> input) {
		Set<Integer> iSet = new LinkedHashSet<Integer>(input);
		List<Integer> iList = new ArrayList<Integer>(iSet);
		return iList;
	}
	// Delete duplicate elements from a List -> using HashSet
	public static List<Integer> deleteDuplicatesHash(List<Integer> input) {
		Set<Integer> iSet = new HashSet<Integer>(input);
		List<Integer> iList = new ArrayList<Integer>(iSet);
		return iList;
	}
	// Delete duplicate elements from a List -> using TreeSet
	public static List<Integer> deleteDuplicatesTree(List<Integer> input) {
		Set<Integer> iSet = new TreeSet<Integer>(input);
		List<Integer> iList = new ArrayList<Integer>(iSet);
		return iList;
	}	
	
	
	public static void main(String[] args) {
		
		int[] sampleIntArray = new int[]{5,9,0,3,3,6,4,1,10,3,5,8};
		System.out.println("Original Array: "+Arrays.toString(sampleIntArray));
		
		//Delete duplicate Elements from int Array
		List<Integer> iList = intArrayToList(sampleIntArray);
		List<Integer> uniqueIntList = deleteDuplicatesLinkedHash(iList);
		List<Integer> uniqueIntList2 = deleteDuplicatesHash(iList);
		List<Integer> uniqueIntList3 = deleteDuplicatesTree(iList);
		int[] uniqueIntArray = ListToIntArray(uniqueIntList);
		System.out.println("With HashSet: " + uniqueIntList2);
		System.out.println("With TreeSet: " + uniqueIntList3);
		System.out.println("With LinkedHashSet: "+Arrays.toString(uniqueIntArray));


		
		
	}

}
