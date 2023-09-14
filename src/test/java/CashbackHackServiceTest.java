import org.junit.Test;
import org.junit.Assert;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    @Test
    public void calculatingTheMissingAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int result = service.remain(amount);
        Assert.assertEquals(result, 100);
    }

    @Test
    public void amountIsEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int result = service.remain(amount);
        Assert.assertEquals(result, 0); //
    }

    @Test
    public void purchaseForAmountEqualToZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        Assert.assertEquals(service.remain(amount), 1000);
    }

    @Test
    public void buyingMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(2000), 0);//
    }
}

