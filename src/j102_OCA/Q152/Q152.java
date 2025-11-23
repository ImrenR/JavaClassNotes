package j102_OCA.Q152;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q152 {


	public static void main(String[] args) {
		List<String> numbers = new ArrayList<String>();
		numbers.add("12");
		numbers.add("8");
		numbers.add("2");
		numbers.add("23");
		numbers.add("8");
		numbers.add("2");
		Iterator<String> it = numbers.iterator();
		while(it.hasNext()) {
			String i = it.next();
			if(i == "2") {
				//it.remove();
				break;
			}else {
				System.out.println(i);
			}
		}
		System.out.println(numbers);

	}
}
/*	Which action enables it to print AB?
		A. Comment lines 18 to 21.
		B. Comment line 20.
		C. Comment line 19.
		D. Comment line 16.






		Answer: B
*/