import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RangeTest {
	
	Range range;
	
	@Before
	public void before(){
		range = new Range();
	}

	@Test
	public void shouldGetElementsOpenOpenTest() {
		assertEquals(arrays(0,1,2), range.getElements(0,2));
	}
	
	@Test
	public void shouldGetRangeOfFiveElementsTest() {
		assertEquals(arrays(0,1,2,3,4), range.getElements(0,4));
	}
	
	@Test
	public void shouldGetRangeOfXYElementsTest() {
		assertEquals(arrays(0,1,2,3,4,5,6,7,8,9,10), range.getElements(0, 10));
	}
	
	
	@Test
	public void shouldGetRangeFromNegative2ToPositive2() {
		assertEquals(arrays(-2,-1,0,1,2), range.getElements(-2, 2));
	}

	@Test
	public void shouldGetRangeWithoutZero() {
		assertEquals(arrays(1,2,3,4,5), range.getElements(1, 5));
	}
	
	
	@Test
	public void shouldGetRangeNegative4ToNegative2() {
		assertEquals(arrays(-4,-3,-2), range.getElements(-4,-2));
	}
	
	@Test
	public void shouldGetRangeNegative2To0() {
		assertEquals(arrays(-2,-1,0), range.getElements(-2,0));
	}
	private Integer[] arrays(Integer ... i){
		return i;
	}

}
