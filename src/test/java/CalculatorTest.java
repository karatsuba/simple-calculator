import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorTest extends TestCase {

    @Test
    public void testCalculatorADDWithValidParams() throws Exception{
        // given
        String[] arguments = {"ADD", "2", "2"};

        // when
        Number result = Calculator.calculate(arguments);

        // then
        assertEquals(result,4.0);
    }

    @Test
    public void testCalculatorSUBWithValidParams() throws Exception{
        // given
        String[] arguments = {"SUB", "3", "2"};

        // when
        Number result = Calculator.calculate(arguments);

        // then
        assertEquals(result,1.0);
    }

    @Test
    public void testCalculatorMULWithValidParams() throws Exception{
        // given
        String[] arguments = {"MUL", "2", "2"};

        // when
        Number result = Calculator.calculate(arguments);

        // then
        assertEquals(result,4.0);
    }

    @Test
    public void testCalculatorDIVWithValidParams() throws Exception{
        // given
        String[] arguments = {"DIV", "4", "2"};

        // when
        Number result = Calculator.calculate(arguments);

        // then
        assertEquals(result,2.0);
    }

    @Test
    public void testCalculatorWithNoParams(){
        // given
        String[] arguments = {};

        // when
        try {
            Calculator.calculate(arguments);
            fail( "Method didn't throw anything");
        } catch (Exception e) {
            assertEquals(e.getMessage(),"ERROR: provide operator and operands, please.");

        }
    }

    @Test
    public void testCalculatorWithWrongOperatorName(){
        // given
        String[] arguments = {"SUM", "2", "2"};

        // when
        try {
            Calculator.calculate(arguments);
            fail( "Method didn't throw anything");
        } catch (Exception e) {
            assertEquals(e.getMessage(),"ERROR: there is no 'SUM' command.");

        }
    }

    @Test
    public void testCalculatorWithMissingLeftOperand(){
        // given
        String[] arguments = {"ADD", "", "2"};

        // when
        try {
            Calculator.calculate(arguments);
            fail( "Method didn't throw anything");
        } catch (Exception e) {
            assertEquals(e.getMessage(),"ERROR: can't parse ");

        }
    }

    @Test
    public void testCalculatorWithMissingRightOperand(){
        // given
        String[] arguments = {"ADD", "", "2"};

        // when
        try {
            Calculator.calculate(arguments);
            fail( "Method didn't throw anything");
        } catch (Exception e) {
            assertEquals(e.getMessage(),"ERROR: can't parse ");

        }
    }

    @Test
    public void testCalculatorFailToParseOperands(){
        // given
        String[] arguments = {"ADD", "q", "2"};

        // when
        try {
            Calculator.calculate(arguments);
            fail( "Method didn't throw anything");
        } catch (Exception e) {
            assertEquals(e.getMessage(),"ERROR: can't parse q");

        }
    }

}
