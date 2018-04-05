package src.by.lwo;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class StartCircleIT {
    public StartCircleIT() {
    }
    @Test
    public void testMain() {
        System.out.println("----- Тест запустил какую-то процедуру -----");
        assertEquals(1, 1);
    }
    @Test
    public void testWow() {
        System.out.println("----- Тест запустил еще какую-то процедуру -----");
        Assert.assertEquals("Тут описание какого то сравнения", 1, 1);
        assertEquals(1, 1);
    }
    @Test
    public void testGetSmth() {
        System.out.println("----- Тест запустил опять и снова какую-то процедуру -----");
        Assert.assertEquals("Тут описание еще одного сравнения", 1, 1);
        assertEquals(1, 1);
        assertEquals(1, 1);
        assertEquals(1, 2);
    }
}
