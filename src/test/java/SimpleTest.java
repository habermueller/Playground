import jdk.jfr.StackTrace;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {

    @Test
    @DisplayName("This is the Simplest Test I can imagine")
    public void aTest(){
        assertEquals(1,  1);
    }

    @Test
    @DisplayName("Test that will ever fail")
    public void aTestThatFails(){
        assertEquals(1,  2);
    }

    @Test
    @DisplayName("This Test never fails.")
    public void aTestThatNeverFails(){
        assertEquals(1,  1);
    }



}
