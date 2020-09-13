import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoCol {
	public static void main(String[] args) {
		/*
		 * List<String> lst = new ArrayList<String>(); lst.add("Abc"); lst.add("Ankur");
		 * lst.add("Saktiman"); Set<String> set = new HashSet<>(lst); for (String val :
		 * set) { System.out.println(val); }
		 */

		Set<Integer> set = new HashSet<>();
		set.add(9);
		set.add(5);
		set.add(7);
		set.add(19);
		System.out.println(set.getClass());
		List<Integer> lst = new ArrayList<>();
		lst.addAll(set);
		for (Integer val : lst) {
			System.out.println(val);
		}
	}
}
