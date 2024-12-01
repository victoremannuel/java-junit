import com.example.Calculadora;
import org.junit.Assert;
import org.junit.Test;


public class CalculadoraTest {
    
    @Test
    public void testSoma() {
        Calculadora calc = new Calculadora();
        Assert.assertEquals(10, calc.somar(5, 5));
    }
}
