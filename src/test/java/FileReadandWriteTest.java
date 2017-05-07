import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lenovo on 06/05/2017.
 */
public class FileReadandWriteTest {
    FileReadandWrite fileReadandWrite;
    @Before
    public void setUp() throws Exception {
        fileReadandWrite=new FileReadandWrite();
    }

    @Test
    public void fileReadWrite() throws Exception {
        Assert.assertEquals("String With Multiple Spaces Removed",fileReadandWrite.fileReadWrite("remspace.txt"));
    }


}