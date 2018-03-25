package constants;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstantClassTest {

    @Test
    public void toStringTest() {
        Constant uut = new ConstantClass("PI", Math.PI);
        assertEquals("PI=3.141592653589793",uut.toString());
    }
}