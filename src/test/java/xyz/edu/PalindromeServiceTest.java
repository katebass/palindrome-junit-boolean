package xyz.edu;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeServiceTest {

    @Test
    public void checkPalindromeTrue() {
        Assert.assertEquals(true,PalindromeService.isValid("testtset"));
    }
    @Test
    public void checkPalindromeFalse() {
        Assert.assertEquals(false,PalindromeService.isValid("test test"));
    }
    @Test
    public void checkPalindromeNull() {
        Assert.assertEquals(null,PalindromeService.isValid(null));
    }
    @Test
    public void checkPalindromeWithNumbers() {
        Assert.assertEquals(true,PalindromeService.isValid("test123321tset"));
    }
    @Test
    public void checkPalindromeEmpty() {
        Assert.assertEquals(false,PalindromeService.isValid(""));
    }
}