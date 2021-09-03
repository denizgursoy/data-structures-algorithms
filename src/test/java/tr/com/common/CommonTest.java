package tr.com.common;

import org.junit.Test;
import tr.com.utils.Commons;

import static org.junit.Assert.*;

public class CommonTest {
    @Test
    public void testCommon() {
        assertTrue(Commons.lessThan(4,23));
        assertFalse(Commons.lessThan(23,23));
        assertFalse(Commons.lessThan(23,1));
    }
}
