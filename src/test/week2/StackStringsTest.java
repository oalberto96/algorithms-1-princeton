package test.week2;
import main.week2.StackStrings;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackStringsTest {
    @Test
    public void pushAndPopTest() {
        StackStrings stack = new StackStrings();
        stack.pop();
        stack.push("1");
        System.out.println(stack);
        stack.push("2");
        System.out.println(stack);
        stack.push("2");
        stack.push("3");
        stack.push("4");
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
        assertEquals("2", stack.pop());
        assertEquals("1", stack.pop());
    }
}
