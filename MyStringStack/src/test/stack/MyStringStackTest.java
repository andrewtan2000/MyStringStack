package stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyStringStackTest {
	private String s1, s2;

	@BeforeEach
	public void setUp() throws Exception {
		s1 = "Hello";
		s2 = "there";
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void new_stack_is_empty() {
		MyStringStack stack = new MyStringStack();
		assertTrue("Stack is not empty", stack.isEmpty());
	}

	@Test
	public void push_elements_make_stack_not_empty() {
		MyStringStack stack = new MyStringStack();
		stack.push(s1);
		stack.push(s2);
		assertFalse("Stack is still empty after push", stack.isEmpty());
	}

	@Test
	public void popped_is_same_as_last_pushed() {
		MyStringStack stack = new MyStringStack();
		stack.push(s1);
		stack.push(s2);
		assertSame("Pop should return the last pushed object", stack.pop(), s2);
	}

	@Test
	public void popping_empty_stack_generate_IndexOutOfBoundException() {
		MyStringStack stack = new MyStringStack();
		try {
			stack.pop();
			fail();
		} catch (IndexOutOfBoundsException ex) {
		}
	}

	@Test
	public void pushing_null_element_is_still_empty() {
		MyStringStack stack = new MyStringStack();
		stack.push(null);
		assertTrue(stack.isEmpty());
	}

	@Test
	public void pushing_null_element_pop_last_element() {
		MyStringStack stack = new MyStringStack();
		stack.push(s1);
		stack.push(null);
		assertSame(s1, stack.pop());
	}

	@Test
	public void reverse_order_popping() {
		MyStringStack stack = new MyStringStack();
		stack.push(s1);
		stack.push(s2);
		assertSame(s2, stack.pop());
		assertSame(s1, stack.pop());
	}

	@Test
	public void clear_stack_make_it_empty() {
		MyStringStack stack = new MyStringStack();
		stack.push(s1);
		stack.push(s2);
		stack.clear();
		assertTrue(stack.isEmpty());
	}

}