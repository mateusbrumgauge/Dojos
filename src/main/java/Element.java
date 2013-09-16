import static java.lang.Math.abs;


public class Element {

	private int value;
	private boolean open;

	public Element(int value, boolean open) {
		this.value = value;
		this.open = open;
	}

	public int value() {
		return value;
	}

	public boolean hasNext(Element b) {
		if(value < b.value()){
			return true;
		}
		
		return false;
	}

	public Element next() {
		Element next = new Element(value+1, this.open);
		return next;
	}

	public boolean isClose() {
		return !open;
	}

	public boolean samevalue(Element b) {
		return this.value == b.value;
	}


}
