package test.week1;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import main.week1.Stack;

public class StackTest {
    @Test
    public void pushAndPopTest() {
        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        assertEquals("2", stack.pop());
        assertEquals("1", stack.pop());
    }
}
