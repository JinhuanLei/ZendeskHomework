package Controllers;

import Services.QueryService;
import Utils.InputUtil;
import Utils.KeyType;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class QueryControllerTest {
    private QueryService qs;
    private InputUtil iu;
    private QueryController qc;

    @Before
    public void before() {
        qs = new QueryService();
        iu = new InputUtil();
        qc = new QueryController();
    }

    @Test
    public void testQueryThingsWithValidInput1(){

    }


}