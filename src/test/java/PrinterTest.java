import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    @Test
    public void hasPaper(){
        Printer printer = new Printer(100, 10);
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void hasToner(){
        Printer printer = new Printer(100, 10);
        assertEquals(10, printer.getToner());
    }

    @Test
    public void canPrint(){
        Printer printer = new Printer(100, 10);
        assertEquals(true, printer.print(10, 1));
    }

    @Test
    public void cannotPrint(){
        Printer printer = new Printer(100, 10);
        assertEquals(false, printer.print(1000, 1000));
    }

    @Test
    public void lessPaper(){
        Printer printer = new Printer(100, 10);
        printer.print(1, 1);
        assertEquals(99, printer.getPaper());
    }

    @Test
    public void lessToner(){
        Printer printer = new Printer(100, 10);
        printer.print(1, 1);
        assertEquals(9, printer.getToner());
    }
}
