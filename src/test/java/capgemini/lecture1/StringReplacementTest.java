package capgemini.lecture1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class StringReplacementTest {

    @Test
    void when_is_AB_ReturnsNothing(){
        assertEquals("",StringReplacement.replace("AB"));
    }

    @Test
    void when_is_CD_ReturnsNothing(){
        assertEquals("",StringReplacement.replace("CD"));
    }

    @Test
    void when_is_BC_Returns_BC(){
        assertEquals("BC",StringReplacement.replace("BC"));
    }

    @Test
    void when_is_ABC_Returns_C(){
        assertEquals("C",StringReplacement.replace("ABC"));
    }

    @Test
    void when_is_ABCD_Returns_CD(){
        assertEquals("CD",StringReplacement.replace("ABCD"));
    }

    @Test
    void when_is_CBAD_Returns_CD(){
        assertEquals("CD",StringReplacement.replace("CBAD"));
    }

    @Test
    void when_is_CABBAD_Returns_CBAD(){
        assertEquals("CBAD",StringReplacement.replace("CABBAD"));
    }
}
