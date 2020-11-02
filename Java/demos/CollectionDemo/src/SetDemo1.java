import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> numsSet = new TreeSet<>();
		
		numsSet.add(10);
		numsSet.add(43);
		numsSet.add(54);
		numsSet.add(23);
		numsSet.add(50);
		numsSet.add(44);
		numsSet.add(54);
		numsSet.add(23);
		
		System.out.println(numsSet);
	}

}
