import com.andrew.dec2hex.Converter;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConverterTest
{
    
    @Test
    public void testToHex() 
    {
        System.out.println("toHex");
        String argument = "12";
        Converter instance = new Converter();
        String expResult = "C";
        String result = instance.toHex(argument);
        
        //assert that the result we expect comes out. If the result that is expecte is generated then the test will pass. If not, then it will fail
        assertEquals(expResult, result);
        assertEquals("D", instance.toHex("13"));
        assertEquals("7B", instance.toHex("123"));
        assertEquals("D", instance.toHex("13"));
        assertEquals("2710", instance.toHex("10000"));
    }
}





