package JunitTest;

import JunitClasses.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    Calculator calc;
    @BeforeEach
    public void init()
    {
        calc=new Calculator();
    }


    @Test
    public void assertEqualTest()
    {
        int sum=calc.add(2, 2);
        //Assertions.assertEquals(2, sum);
        //ou bien ajouter en haut org.junit.jupiter.api.Assertions.assertEquals; puis
        //assertEquals(2,sum);
        Assertions.assertEquals(2, sum, "Test failed as expected value is not equal to actual value");
    }

    @Test
    public void assertNotEqualsTest()
    {
        int sum=calc.add(2, 2);
        Assertions.assertNotEquals(4,sum,"Test failed as expected value is equal to actual value");
    }

    @Test
    public void assertArrayEqualsTest()
    {
        //Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {1,2,3});
        Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {1,3,2});
    }

    @Test
    public void assertNullTest()
    {
        String nullString=null;
        String notNullString="junit5";
        //Assertions.assertNull(notNullString);
        Assertions.assertNotNull(notNullString);
    }

    @Test
    public void assertTrueTest()
    {
        boolean truevalue=true;
        boolean falsevalue=false;
        Assertions.assertTrue(truevalue);


    }







}
