package stack;

import java.util.ArrayList;
import java.util.List;

public class MyStringStackSample {
	private List<String> elements = new ArrayList<>();

	public boolean isEmpty() {
		return elements.isEmpty();
	}

	public void push(String str) {
		if (str != null) {
			elements.add(str);
		}
	}

	public String pop() {
		if (isEmpty())
			throw new IndexOutOfBoundsException();
		return elements.remove(elements.size() - 1);
	}

	public void clear() {
		elements.clear();
	}
}
