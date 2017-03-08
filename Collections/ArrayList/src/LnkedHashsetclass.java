import java.util.HashSet;
import java.util.LinkedHashSet;

public class LnkedHashsetclass {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("B");
		hs.add("c");
		hs.add("d");
		hs.add("v");
		hs.add("a");
		hs.add("e");
		hs.add(null);
		hs.add(10);
		System.out.println(hs.add("a"));
		System.out.println(hs);

	}

}
