package JunitTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;     //  ajouté manuelle
import org.junit.jupiter.api.condition.JRE;       //  ajouté manuelle


public class ConditionalTest {

/**
     * 1.Condition on operation Sysetem
     * 2.Condition on particular JRE
     **/


    @Test
    @EnabledOnOs(OS.WINDOWS)    // si je met .MAC    ça marche pas
    public void conditionOnWindows() {

        System.out.println("Execute this test only on Windows machine");
    }
    @Test
    @EnabledOnJre(JRE.JAVA_19)
    public void conditionOnJRE()
    {
        System.out.println("Execute this test only for Java 17");


    }

}
