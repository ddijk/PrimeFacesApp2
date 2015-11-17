/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.ortecfinance.pearl.primefacesapp2;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author DickD
 */
public class ChartValueTypeTest {

    @Test
    public void testValueOf() {

        Assert.assertEquals(ChartValueType.DEBT, ChartValueType.valueOf("DEBT"));
    }

}
