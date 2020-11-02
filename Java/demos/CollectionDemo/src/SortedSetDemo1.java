import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<String> set1 = new TreeSet<>();
		
		set1.addAll(Arrays.asList("Zahid","Mohit","Mitul","Saurabh","Bhakti","Aakash","Deepak","Vamshi"));

		
		SortedSet<String> set2 = set1.subSet("Deepak", "Vamshi");
		
		System.out.println("set1 = " + set1);
		System.out.println("set2 = " + set2);
		
		
	}

}
