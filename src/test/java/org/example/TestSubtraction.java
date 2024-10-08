package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestSubtraction {
    Calc c = new Calc();
    @Test
    void subtraction(){

        assertEquals(8,c.subtract(4,2));
    }
}
