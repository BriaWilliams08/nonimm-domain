import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecieveTest{
    @Test
    public void testDatabase(){
        boolean recieve = checkDatabasae();
        Assert.assertEquals(true, recieve);
        
    }
    public void testApprove(){
        boolean recieve = approveRequest();
        Assert.assertEquals(true, recieve);
    }
}