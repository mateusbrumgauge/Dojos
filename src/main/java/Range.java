import java.util.ArrayList;
import java.util.List;

public class Range {

	public Integer[] elements(Element a, Element b) {
		List<Integer> range = new ArrayList<Integer>();

		if (a.isClose()) {
			range.add(a.value());
		}
		while (!a.samevalue(b)) {
			a = a.next();
			if (!a.samevalue(b)) {
				range.add(a.value());
			} else {
				if(b.isClose()){
					range.add(a.value());
				}
				break;
			}
		} 

		return range.toArray(new Integer[] {});
	}

}
