package Inlämningsuppgift_Annelie_Hagen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextTests {

    @Test
    public void testCharCount() {
        TextClass textClass = new TextClass();//Skapar nytt objekt och anropar konstruktorn med en tom lista som startvärde.
        textClass.addLine("Hallå där"); //Metoden addLine adderar ett elementet, raden med texten "Hallå där".
        assertEquals(9, textClass.charCount());//Jämför förväntat antal tecken med returen från charCount.
    }

    @Test
    public void testLineCount() {
        TextClass textClass = new TextClass();
        textClass.addLine("Lägger till en rad");
        textClass.addLine("Och en rad till");
        assertEquals(2, textClass.lineCount());
    }

    @Test
    public void testIsStop() {
        TextClass textClass = new TextClass();
        String testLine = "Innehåller stop";
        assertTrue(textClass.isStop(testLine));
    }
}


