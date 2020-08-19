package xyz.edu;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BooleanOperationsTest {

    // ---------------------  Conjunction  ---------------------

    @Test
    public void whenFirstTrueSecondTrueConjunctionTrue() {
        Assert.assertEquals(true, new BooleanOperations(true, true).conjunction());
    }

    @Test
    public void whenFirstTrueSecondFalseConjunctionFalse() {
        Assert.assertEquals(false, new BooleanOperations(true, false).conjunction());
    }

    @Test
    public void whenFirstTrueSecondNullConjunctionNull() {
        Assert.assertNull(new BooleanOperations(true, null).conjunction());
    }

    @Test
    public void whenFirstFalseSecondTrueConjunctionFalse() {
        Assert.assertEquals(false, new BooleanOperations(false, true).conjunction());
    }

    @Test
    public void whenFirstFalseSecondFalseConjunctionFalse() {
        Assert.assertEquals(false, new BooleanOperations(false, false).conjunction());
    }

    @Test
    public void whenFirstFalseSecondNullConjunctionNull() {
        Assert.assertNull(new BooleanOperations(false, null).conjunction());
    }

    @Test
    public void whenFirstNullSecondTrueConjunctionNull() {
        Assert.assertNull(null, new BooleanOperations(null, true).conjunction());
    }

    @Test
    public void whenFirstNullSecondFalseConjunctionNull() {
        Assert.assertNull(new BooleanOperations(null, false).conjunction());
    }

    @Test
    public void whenFirstNullSecondNullConjunctionNull() {
        Assert.assertNull(new BooleanOperations(null, null).conjunction());
    }

    // ---------------------  Disjunction  ---------------------

    @Test
    public void whenFirstTrueSecondTrueDisjunctionTrue() {
        Assert.assertEquals(true, new BooleanOperations(true, true).disjunction());
    }

    @Test
    public void whenFirstTrueSecondFalseDisjunctionTrue() {
        Assert.assertEquals(true, new BooleanOperations(true, false).disjunction());
    }

    @Test
    public void whenFirstTrueSecondNullDisjunctionTrue() {
        Assert.assertEquals(true, new BooleanOperations(true, null).disjunction());
    }

    @Test
    public void whenFirstFalseSecondTrueDisjunctionTrue() {
        Assert.assertEquals(true, new BooleanOperations(false, true).disjunction());
    }

    @Test
    public void whenFirstFalseSecondFalseDisjunctionFalse() {
        Assert.assertEquals(false, new BooleanOperations(false, false).disjunction());
    }

    @Test
    public void whenFirstFalseSecondNullDisjunctionFalse() {
        Assert.assertEquals(false, new BooleanOperations(false, null).disjunction());
    }

    @Test
    public void whenFirstNullSecondTrueDisjunctionTrue() {
        Assert.assertEquals(true, new BooleanOperations(null, true).disjunction());
    }

    @Test
    public void whenFirstNullSecondFalseDisjunctionFalse() {
        Assert.assertEquals(false, new BooleanOperations(null, false).disjunction());
    }

    @Test
    public void whenFirstNullSecondNullDisjunctionNull() {
        Assert.assertNull(new BooleanOperations(null, null).disjunction());
    }

}