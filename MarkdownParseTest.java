import static org.junit.Assert.*; // Import the JUnit tester code from the library
import org.junit.*;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest { // Create the class 

    @Test // tell the code we're making a test here 
    public void addition() { // the test method
        assertEquals(3, 1 + 1); // check to see if 2 equals 1+1 and the test passes if it is
    }

    @Test
    public void getLinksTest() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("https://something.com", "some-thing.html"));
    }

    @Test
    public void getLinksTestMore() throws IOException{
        Path fileName = Path.of("final-test.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("test 1", "test 1", "test 2(", "test 3", "test 4"));
    }

}
