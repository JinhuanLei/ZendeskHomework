package Utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InputUtilTest {
    private InputUtil iu;

    @Before
    public void before() throws Exception {
        iu = new InputUtil();
    }


    @Test
    public void testGetSearchOptionsWithValidInput1() {
        KeyType input;
        InputStream stdin = System.in;
        try {
            String data = "1\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getSearchOptions();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertSame(KeyType.SEARCH, input);
    }

    @Test
    public void testGetSearchOptionsWithValidInput2() {
        KeyType input;
        InputStream stdin = System.in;
        try {
            String data = "2\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getSearchOptions();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertSame(KeyType.HELP, input);
    }

    @Test
    public void testGetSearchOptionsWithValidInput3() {
        KeyType input;
        InputStream stdin = System.in;
        try {
            String data = "quit\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getSearchOptions();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertSame(KeyType.QUIT, input);
    }

    @Test
    public void testGetSearchOptionsWithInValidInput1() {
        KeyType input;
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getSearchOptions();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertSame(KeyType.INVALID, input);
    }

    @Test
    public void testGetSearchOptionsWithInValidInput2() {
        KeyType input;
        InputStream stdin = System.in;
        try {
            String data = "quit1\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getSearchOptions();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertSame(KeyType.INVALID, input);
    }

    @Test
    public void testGetSearchOptionsWithInValidInput3() {
        KeyType input;
        InputStream stdin = System.in;
        try {
            String data = "12\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getSearchOptions();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertSame(KeyType.INVALID, input);
    }

    @Test
    public void testGetModelTypeWithValidInput1() {
        ModelType input;
        InputStream stdin = System.in;
        try {
            String data = "1\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getModelType();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertSame(ModelType.USER, input);
    }

    @Test
    public void testGetModelTypeWithValidInput2() {
        ModelType input;
        InputStream stdin = System.in;
        try {
            String data = "2\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getModelType();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertSame(ModelType.TICKET, input);
    }

    @Test
    public void testGetModelTypeWithValidInput3() {
        ModelType input;
        InputStream stdin = System.in;
        try {
            String data = "3\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getModelType();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertSame(ModelType.ORGANIZATION, input);
    }

    @Test
    public void testGetModelTypeWithInValidInput1() {
        ModelType input;
        InputStream stdin = System.in;
        try {
            String data = "4\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getModelType();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertSame(ModelType.INVALID, input);
    }

    @Test
    public void testGetModelTypeWithInValidInput2() {
        ModelType input;
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getModelType();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertSame(ModelType.INVALID, input);
    }

    @Test(timeout = 200)
    public void testGetSearchTermWithValidInput() {
        String input;
        InputStream stdin = System.in;
        try {
            String data = "_id\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getSearchTerm(ModelType.USER);
        } finally {
            System.setIn(stdin);
        }
        Assert.assertNotNull(input);
    }

    @Test(timeout = 200)
    public void testGetSearchTermWithInValidInput1() {
        String input;
        InputStream stdin = System.in;
        try {
            String data = "_id\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getSearchTerm(null);
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals("", input);
    }

    @Test(timeout = 200)
    public void testGetSearchTermWithInValidInput2() {
        String input;
        InputStream stdin = System.in;
        try {
            String data = "@\n_id\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getSearchTerm(ModelType.USER);
        } finally {
            System.setIn(stdin);
        }
        Assert.assertEquals("_id", input);
    }

    @Test
    public void testGetSearchValueWithValidInput1() {
        InputStream stdin = System.in;
        String input;
        try {
            String data = "1\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getSearchValue();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertNotNull(input);
    }

    @Test
    public void testGetSearchValueWithInValidInput1() {
        InputStream stdin = System.in;
        String input;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = iu.getSearchValue();
        } finally {
            System.setIn(stdin);
        }
        Assert.assertNotNull(input);
    }

    @Test(timeout=100)
    public void testGetEnterKeyWithValidInput1() {
        InputStream stdin = System.in;
        try {
            String data = "\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            iu.getEnterKey();
        } finally {
            System.setIn(stdin);
        }
    }

    @Test(timeout=100)
    public void testGetEnterKeyWithInValidInput1() {
        InputStream stdin = System.in;
        try {
            /*
            *  input1 : @   Invalid
            *  input2 : \   Invalid
            *  input3 : \n  Valid
            * */
            String data = "@\n\\\n\n";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            iu.getEnterKey();
        } finally {
            System.setIn(stdin);
        }
    }

}