package JunitTest;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

///Aléatoire
//@TestMethodOrder(MethodOrderer.Random.class)
//Ordre aplhanumérique
//@TestMethodOrder(MethodOrderer.Alphanumeric.class)
//Spécifier l'ordre


//Ajouter Manuel
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)      //  ajouter manuellement


public class TestExecutionOrderTest {


    @Test
    @Order(4)
    public void test1() {
        System.out.println("This is Test 1");
    }

    @Test
    @Order(3)
    public void test2() {
        System.out.println("This is Test 2");
    }

    @Test
    @Order(2)
    public void test3() {
        System.out.println("This is Test 3");
    }

    @Test
    @Order(1)
    public void test4() {
        System.out.println("This is Test 4");
    }


}
