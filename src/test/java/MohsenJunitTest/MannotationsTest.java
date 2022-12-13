package MohsenJunitTest;

import MohsenJunitClasses.Mcalculator;
import org.junit.jupiter.api.*;

public class MannotationsTest {



    Mcalculator calc;
    @BeforeAll
    public static void MethodBeforeAll()
    {
        System.out.println("Establishing connexion to the database");

    }
    @AfterAll
    public static void MethodAfterAll()
    {
        System.out.println("Deconexion from the database");

    }

    @BeforeEach
    public void MethodBeforeEach()
    {
        System.out.println("Initialising Calculator");
        calc=new Mcalculator();
    }

    @Test
    @DisplayName("Methode adding positif numbers")
    public void Test01(){
        int s=calc.Madd(2,4);
        System.out.println("the total is  "+s);
    }

    @Test
    @DisplayName("Methode additing negatif numbers")
    public void Test02(){
        int s=calc.Madd(-2,-4);
        System.out.println("the total is  "+s);
    }
    @Test
    @DisplayName("Methode adding negative and positif number")
    //@Disabled("Not Execution")
    public void Test03(){
        int s=calc.Madd(-2,4);
        System.out.println("the total is  "+s);
    }


}
