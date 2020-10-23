import java.util.StringTokenizer;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vishal,shah,37";
		
		StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
		
		while(stringTokenizer.hasMoreElements()) {
			String token = stringTokenizer.nextToken();
			System.out.println(token);
		}

	}

}
