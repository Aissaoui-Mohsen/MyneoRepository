package JunitTest;

import JunitClasses.Calculator;
import org.junit.jupiter.api.*;

public class AnnotationsTest {

    //Calculator cal=new Calculator(); //remplacé par la méthode ci-dessous
    Calculator calc;

    @BeforeEach
    public void init() {
        calc = new Calculator();
        System.out.println("Initializing the calculator instance");
    }

    @BeforeAll
    public static void beforeAllMethod() {
        System.out.println("Establishing connection to the database");

    }

    @AfterAll
    public static void afterAllMethod() {
        System.out.println("Closing connection to the database");
    }

    @Test
    @DisplayName("Additing 2 positive Numbers")
    public void testMethod1() {
        int sum = calc.add(10, 20);
        System.out.println("The total is     " + sum);
    }

    @Test
    @DisplayName("Additing 2 Negative Numbers")
    public void testMethod2() {
        int sum = calc.add(-20, -30);
        System.out.println("The total is     " + sum);
    }

    @Test
    @DisplayName("Additing 2 Negative Numbers")
    @Disabled("Not executing")
    public void testMethod3() {
        int sum = calc.add(-20, 30);
        System.out.println("The total is     " + sum);
    }

}
