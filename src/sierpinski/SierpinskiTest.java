package sierpinski;

import org.junit.Assert;
import org.junit.Test;

public class SierpinskiTest
{
    @Test
    public void prueba1()
    {
	// Primos
	Assert.assertEquals(false, Sierpinski.esPrimo(1));
	Assert.assertEquals(true, Sierpinski.esPrimo(997));
	Assert.assertEquals(false, Sierpinski.esPrimo(813));

	Assert.assertEquals(true, Sierpinski.esSierpinski(47));
    }
}
