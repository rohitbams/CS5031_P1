package stacs.mastermind;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.io.File;


public class MastermindAppTest {

    private File testWordListFile;

    @BeforeEach
    public void loadTestWordList () {
        testWordListFile = new File(this
                                    .getClass()
                                    .getClassLoader()
                                    .getResource("wordlist-test.txt")
                                    .getFile());
    }
    
    @Test
    public void shouldLoadWordlist() {
        ArrayList<String> wordlist =
            MastermindApp.loadWordlist(testWordListFile);

        // test wordlist only contains 3 words, so wordlist should have the size of 3
        assertEquals(3, wordlist.size());
    }
}
