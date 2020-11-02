import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101,  "Value 1");
		map.put(102,  "Value 2");
		map.put(103,  "Value 3");
		map.put(104,  "Value 4");
		map.put(105,  "Value 5");
		
		map.put(101,  "different value");
		
//		
//		Set<Integer> keyset = map.keySet();
//		
//		for(Integer key : keyset) {
//			String value = map.get(key);
//			System.out.println(value);
//		}
		
		Set<Entry<Integer, String>> set = map.entrySet();
		
		for( Entry<Integer, String> entry : set) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("key = " + key + "   value = " + value);
		}

	}

}
