package MohsenJunitTest;


import org.junit.jupiter.api.MethodOrderer;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class MTestExcecutionOrderTest {
    @Test
    @Order(4)
    public void test1()
    {
        System.out.println("C'est le test n°1");

    }

    @Test
    @Order(2)
    public void test2()
    {
        System.out.println("C'est le test n°2");

    }
    @Test
    @Order(3)
    public void test3()
    {
        System.out.println("C'est le test n°3");

    }


    @Test
    @Order(1)
    public void test4()
    {
        System.out.println("C'est le test n°4");

    }









}
