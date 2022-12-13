package MohsenJunitTest;

import MohsenJunitClasses.Mcalculator;
import org.junit.jupiter.api.*;

public class MnestedTest {

    Mcalculator calc;

    @BeforeEach
    public void init()
    {
        calc=new Mcalculator();
    }
@Nested
class addPositiveNumbers {
    @Test
    public void smallPositive01() {
        int s = calc.Madd(2, 4);
        System.out.println("the total is" + s);
    }

    @Test
    public void bigPositive02() {
        int s = calc.Madd(2000, 4000);
        System.out.println("the total is" + s);
    }
}


    @Nested
    class addNegativeNumbers {
        @Test
        public void bigNegative03() {
            int s = calc.Madd(-2000, -4000);
            System.out.println("the total is" + s);
        }

        @Test
        public void smallNegtive() {
            int s = calc.Madd(-2, -4);
            System.out.println("the total is" + s);
        }

        @Test
        public void zeroNumbers05() {
            int s = calc.Madd(0, 0);
            System.out.println("the total is  " + s);
        }
    }




}
