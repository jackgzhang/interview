package weivretni.mixpanel;

import junit.framework.Assert;

import org.junit.Test;

public class PrimeNumberTest {

    private PrimeNumber source = new PrimeNumber();

    @Test
    public void test() {
        Assert.assertTrue(source.isPrime(2));
        Assert.assertTrue(source.isPrime(3));
        Assert.assertFalse(source.isPrime(4));
        Assert.assertTrue(source.isPrime(7));
        Assert.assertFalse(source.isPrime(49));
        
        Assert.assertFalse(source.isPrime(990));
        Assert.assertFalse(source.isPrime(648));
        Assert.assertFalse(source.isPrime(660));
        Assert.assertFalse(source.isPrime(235));
        Assert.assertFalse(source.isPrime(812));
        Assert.assertFalse(source.isPrime(558));
        Assert.assertFalse(source.isPrime(742));
        
        
        Assert.assertTrue(source.isPrime(991));
        Assert.assertTrue(source.isPrime(643));
        Assert.assertTrue(source.isPrime(647));
        Assert.assertTrue(source.isPrime(659));
        Assert.assertTrue(source.isPrime(661));
        Assert.assertTrue(source.isPrime(673));
        Assert.assertTrue(source.isPrime(677));
        
        
    }
}
