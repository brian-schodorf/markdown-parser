import static org.junit.Assert.*; //import junit test lib

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {

    @Test  //tells junit that we want to test here
    public void addition() {
        assertEquals(2, 1 + 1); // checks if 2 is equal to 1+1
    }

    @Test 
    public void linktest() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    assertEquals(links, List.of("https://something.com"));
    }
}
