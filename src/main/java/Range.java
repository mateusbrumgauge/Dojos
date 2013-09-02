import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.*;


public class Range{
	public Integer[] getElements(int x, int y) {
		List<Integer> range = new ArrayList<Integer>();
		int element = x; 
		for(int i = 0;i <= rangeSize(x, y); i++) {
			range.add(element++);
		}
		return range.toArray(new Integer[]{});
	}

	private int rangeSize(int x, int y) {
		int sizeList;
		if(isNegativePositive(x, y)){
			sizeList =abs(x)+abs(y);
		}else if(isNegativeNegative(x, y)){
			sizeList =abs(x)-abs(y);
		} else{
			sizeList= y-x;
		}
		return sizeList;
	}

	private boolean isNegativeNegative(int x, int y) {
		return x<=0 && y<=0;
	}

	private boolean isNegativePositive(int x, int y) {
		return x<=0 && y>=0;
	}
}
