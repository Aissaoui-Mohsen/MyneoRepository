package JunitTest;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

public class RepeatedTestMethod {

    @Test
    @org.junit.jupiter.api.RepeatedTest(3)
    public void repeatedTestMethod()
    {
        System.out.println("A I am executing this test multiple times");
    }

    @org.junit.jupiter.api.RepeatedTest(value=2, name="{displayName} - {currentRepetition}/{totalRepetitions}")
    public void repeatedTestMethod1()
    {
        System.out.println("B I am executing this test multiple times");
    }




    @RepeatedTest(value=2,name=RepeatedTest.LONG_DISPLAY_NAME)
    public void repeatedTestMethod2()
    {
        System.out.println("C I am executing this test multiple times");
    }


    @RepeatedTest(value=4,name=RepeatedTest.SHORT_DISPLAY_NAME)
    public void repeatedTestMethod3()
    {
        System.out.println("D I am executing this test multiple times");
    }


    @RepeatedTest(4)
    public void repeatedTestMethod4(RepetitionInfo repetitionInfo)

    {
        System.out.println(repetitionInfo.getCurrentRepetition());
        System.out.println(repetitionInfo.getTotalRepetitions());

    }



}
