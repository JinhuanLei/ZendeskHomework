package Views;

import Utils.ModelType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ViewTest {
    Views.View v;

    @Before
    public void before() throws Exception {
        v = new View();
    }

    @Test(timeout = 100)
    public void searchOptionsView() {
        View.searchOptionsView();
    }

    @Test
    public void testGetTermArr1() {
        String[] arr = View.getTermArr(ModelType.USER);
        Assert.assertSame(v.getUserTerm(), arr);
    }

    @Test
    public void testGetTermArr2() {
        String[] arr = View.getTermArr(ModelType.TICKET);
        Assert.assertSame(v.getTicketTerm(), arr);
    }

    @Test
    public void testGetTermArr3() {
        String[] arr = View.getTermArr(ModelType.ORGANIZATION);
        Assert.assertSame(v.getOrganizationTerm(), arr);
    }

    @Test(timeout = 100)
    public void modelOptionsView() {
        View.modelOptionsView();
    }

    @Test(timeout = 100)
    public void modelViewHelpManual() {
        View.modelViewHelpManual();
    }
}