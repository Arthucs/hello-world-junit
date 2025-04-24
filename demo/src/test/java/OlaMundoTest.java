import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.example.OlaMundo;

public class OlaMundoTest {
    @Test    
    public void testeOlaMundo() {
        OlaMundo oi = new OlaMundo();
        assertEquals("Hello World!", oi.ola());
    }
}
