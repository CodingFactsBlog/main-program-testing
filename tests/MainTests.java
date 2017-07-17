import org.junit.Assert;
import org.junit.Test;

public class MainTests {

    @Test
    public void test1() {
        String input = "1" +
                    "\n1 1";

        MainIO mainIO = new MainIO(input);
        Main.main(new String[0]);

        Assert.assertEquals("2\r\n", mainIO.getOutput().toString());
    }

    @Test
    public void test2() {
        String input = "4\n" +
                "1 1\n" +
                "5 5\n" +
                "43 100\n" +
                "2 2";

        MainIO mainIO = new MainIO(input);
        Main.main(new String[0]);

        Assert.assertEquals("" +
            "2\r\n" +
            "10\r\n" +
            "143\r\n" +
            "4\r\n", mainIO.getOutput().toString());
    }

    @Test
    public void test3() {
        String input = "0\n";

        MainIO mainIO = new MainIO(input);
        Main.main(new String[0]);

        Assert.assertEquals("", mainIO.getOutput().toString());
    }
}
