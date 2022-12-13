package MohsenJunitTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {


@Test
@EnabledOnOs(OS.WINDOWS)
        public void ConditionOnWindows()
    {
        System.out.println("execute this test only on windows");



    }
   @Test
   @EnabledOnJre(JRE.JAVA_19)
    public void ConditionOnJRE()
    {
        System.out.println("execute this test only on Jre19");

    }

}