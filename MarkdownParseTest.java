import static org.junit.Assert.*; // Import the JUnit tester code from the library
import org.junit.*;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest { // Create the class 

    @Test // tell the code we're making a test here 
    public void addition() { // the test method
        assertEquals(2, 1 + 1); // check to see if 2 equals 1+1 and the test passes if it is
    }

    @Test
    public void snippet1MyRepoTest() throws IOException{
        
        Path fileName = Path.of("snippet1.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("google.com", "google.com", "ucsd.edu"));
    }

    @Test
    public void snippet2MyRepoTest() throws IOException{
        
        Path fileName = Path.of("snippet2.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("a.com", "a.com(())", "example.com"));
    }


    @Test
    public void snippet3MyRepoTest() throws IOException{
        
        Path fileName = Path.of("snippet3.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("https://www.twitter.com", 
        "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", "https://cse.ucsd.edu/"));
    }


}
