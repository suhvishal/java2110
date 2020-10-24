import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Set<Integer> numsSet = new TreeSet<>();
//		
//		numsSet.addAll(Arrays.asList(10,30,30,30,30,403,4,203,5,23,54,234,2));
//		
//		System.out.println(numsSet);
		
		
//		Set<String> namesSet = new TreeSet<>();
//		
//		namesSet.addAll(Arrays.asList("Saurabh","Mitul","Deepak","Bhakti","Akash","Mohit","Zahid"));
//		
//		System.out.println(namesSet);
		
		Set<LocalDate> birthdays = new TreeSet<>();
		
		birthdays.add(LocalDate.of(1983, 1, 3));
		birthdays.add(LocalDate.of(1943, 5, 13));
		birthdays.add(LocalDate.of(1989, 6, 13));
		birthdays.add(LocalDate.of(1967, 9, 23));
		birthdays.add(LocalDate.of(2001, 2, 5));
		birthdays.add(LocalDate.of(2001, 2, 15));
		birthdays.add(LocalDate.of(2001, 2, 5));
		birthdays.add(LocalDate.of(2001, 2, 7));

		birthdays.add(LocalDate.of(2020, 10, 21));
		
		System.out.println(birthdays);

		
	}

}
