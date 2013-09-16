import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class RangeTest {
	
	Range range;
	
	@Before
	public void before(){
		range = new Range();
	}


	@Test
	public void shouldGetRangeOfElementsFromZeroToPositiveIntegerTest() {
		assertEquals(arrays(0,1,2,3,4), range.elements(new Element(0, false),new Element(4, false)));
	}

	
	@Test
	public void shouldGetRangeFromNegativeToPositiveElements() {
		assertEquals(arrays(-2,-1,0,1,2), range.elements(new Element(-2, false), new Element(2, false)));
	}

	@Test
	public void shouldGetRangePositiveWithoutZero() {
		assertEquals(arrays(1,2,3,4,5), range.elements(new Element(1, false), new Element(5, false)));
	}
	
	
	@Test
	public void shouldGetRangeNegativeIntegerWithoutZero() {
		assertEquals(arrays(-4,-3,-2), range.elements(new Element(-4, false),new Element(-2, false)));
	}
	
	@Test
	public void shouldGetRangeNegativeToZero() {
		assertEquals(arrays(-2,-1,0), range.elements(new Element(-2, false),new Element(0, false)));
	}
	
	@Test
	public void shouldGetOpenedPositiveClosedPositiveRange() {
		Element a = new Element(1, true);
		Element b = new Element(3, false);
		assertEquals(arrays(2,3), range.elements(a,b));
	}
	
	@Test
	public void shouldGetClosedPositiveOpenedPositiveRange() {
		Element a = new Element(1, false);
		Element b = new Element(3, true);
		assertEquals(arrays(1,2), range.elements(a,b));
	}
	
	private Integer[] arrays(Integer ... i){
		return i;
	}

}
