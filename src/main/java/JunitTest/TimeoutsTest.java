package JunitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeoutsTest {

    @Test
    @Timeout(5)
    //fail car 5<5000
    public void timoutTest() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Test Passes with in the time");
    }

    @Test
    @Timeout(6)
    //pass car 6>5
    public void timoutTest1() throws InterruptedException
    {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Test Passes with in the time");
    }

    @Test
    public void timoutTest2()
    {
        //dans ce cas fail executiontime>duration
        Assertions.assertTimeout(Duration.ofSeconds(5), ()->delaySeconds(6));

    }
    private void delaySeconds(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }
}
