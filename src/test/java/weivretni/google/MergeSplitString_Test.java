package weivretni.google;

import org.junit.Test;

import weivretni.BaseTest;

public class MergeSplitString_Test extends BaseTest {

    public MergeSplitString source = new MergeSplitString();

    @Test
    public void test() {

        String[] array = new String[] { "a", "b", "c", "," };

        this.assertEquals(array, source.split(source.merge(array)));
    }
}
