import static org.junit.Assert.*; //import junit test lib
import org.junit.*;
public class MarkdownParseTest {

    @Test  //tells junit that we want to test here
    public void addition() {
        assertEquals(2, 1 + 1); // checks if 2 is equal to 1+1
    }

    @Test 
    public void linktest() {
        assertEquals(MarkdownParse.getLinks("test-file.md"), "[https://something.com, some-thing.html]");
    }
}
