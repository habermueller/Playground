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
    @DisplayName("This is afixed Test I can imagine")
    public void aTestWhichIHavefixed(){
        assertEquals(1,  1);
    }


    @Test
    @DisplayName("This Test never fails.")
    public void aTestThatNeverFails(){
        assertEquals(1,  1);
    }



}
